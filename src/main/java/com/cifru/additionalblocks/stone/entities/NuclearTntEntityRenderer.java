package com.cifru.additionalblocks.stone.entities;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import com.supermartijn642.core.render.TextureAtlases;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.TntMinecartRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

/**
 * Created 08/04/2023 by SuperMartijn642
 */
public class NuclearTntEntityRenderer extends EntityRenderer<NuclearTntEntity> {

    private final BlockRenderDispatcher blockRenderer;

    public NuclearTntEntityRenderer(EntityRendererProvider.Context context){
        super(context);
        this.shadowRadius = 0.5f;
        this.blockRenderer = context.getBlockRenderDispatcher();
    }

    @Override
    public void render(NuclearTntEntity entity, float rotation, float partialTicks, PoseStack poseStack, MultiBufferSource bufferSource, int combinedLight){
        poseStack.pushPose();
        poseStack.translate(0, 0.5, 0);
        int fuse = entity.getFuse();
        if(fuse - partialTicks + 1 < 10){
            float scalar = 1 - (fuse - partialTicks + 1) / 10;
            scalar = Mth.clamp(scalar, 0, 1);
            scalar *= scalar;
            scalar *= scalar;
            float scale = 1 + scalar * 0.3f;
            poseStack.scale(scale, scale, scale);
        }

        poseStack.mulPose(Axis.YP.rotationDegrees(-90));
        poseStack.translate(-0.5, -0.5, 0.5);
        poseStack.mulPose(Axis.YP.rotationDegrees(90));
        TntMinecartRenderer.renderWhiteSolidBlock(this.blockRenderer, entity.getBlockState(), poseStack, bufferSource, combinedLight, fuse / 5 % 2 == 0);
        poseStack.popPose();
        super.render(entity, rotation, partialTicks, poseStack, bufferSource, combinedLight);
    }

    @Override
    public ResourceLocation getTextureLocation(NuclearTntEntity entity){
        return TextureAtlases.getBlocks();
    }
}

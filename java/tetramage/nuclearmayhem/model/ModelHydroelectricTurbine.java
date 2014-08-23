package tetramage.nuclearmayhem.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHydroelectricTurbine extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Blade_1;
    ModelRenderer Blade_2;
    ModelRenderer Blade_3;
    ModelRenderer Blade_4;
  
  public ModelHydroelectricTurbine()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Body = new ModelRenderer(this, 1, 1);
      Body.addBox(0F, 0F, 0F, 4, 16, 4);
      Body.setRotationPoint(-2F, 8F, -2F);
      Body.setTextureSize(64, 64);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Blade_1 = new ModelRenderer(this, 18, 1);
      Blade_1.addBox(0F, 0F, 0F, 1, 16, 4);
      Blade_1.setRotationPoint(1F, 8F, 2F);
      Blade_1.setTextureSize(64, 64);
      Blade_1.mirror = true;
      setRotation(Blade_1, 0F, 0F, 0.1858931F);
      Blade_2 = new ModelRenderer(this, 29, 1);
      Blade_2.addBox(0F, 0F, 0F, 4, 16, 1);
      Blade_2.setRotationPoint(2F, 8F, -2F);
      Blade_2.setTextureSize(64, 64);
      Blade_2.mirror = true;
      setRotation(Blade_2, 0.1858931F, 0F, 0F);
      Blade_3 = new ModelRenderer(this, 40, 1);
      Blade_3.addBox(0F, 0F, 0F, 1, 16, 4);
      Blade_3.setRotationPoint(-1F, 8F, -2F);
      Blade_3.setTextureSize(64, 64);
      Blade_3.mirror = true;
      setRotation(Blade_3, 0F, 3.141593F, -0.185895F);
      Blade_4 = new ModelRenderer(this, 51, 1);
      Blade_4.addBox(0F, 0F, 0F, 4, 16, 1);
      Blade_4.setRotationPoint(-2F, 8F, 2F);
      Blade_4.setTextureSize(64, 64);
      Blade_4.mirror = true;
      setRotation(Blade_4, 0.1858931F, 3.141593F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Body.render(f5);
    Blade_1.render(f5);    // REMEMBER TO KEEP THE {f5}'S
    Blade_2.render(f5);
    Blade_3.render(f5);
    Blade_4.render(f5);
    }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

public void renderModel(float f) {
	Body.render(f);
    Blade_1.render(f);
    Blade_2.render(f);    // REMEMBER TO MAKE THIS METHOD AND TO TAKE AWAY THE 5'S FROM THE f'S
    Blade_3.render(f);
    Blade_4.render(f);
}

}

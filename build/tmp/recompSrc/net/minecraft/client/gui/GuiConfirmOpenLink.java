package net.minecraft.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.resources.I18n;

@SideOnly(Side.CLIENT)
public class GuiConfirmOpenLink extends GuiYesNo
{
    /** Text to warn players from opening unsafe links. */
    private String openLinkWarning;
    /** Label for the Copy to Clipboard button. */
    private String copyLinkButtonText;
    private String field_146361_t;
    private boolean field_146360_u = true;
    private static final String __OBFID = "CL_00000683";

    public GuiConfirmOpenLink(GuiScreen par1GuiScreen, String par2Str, int par3, boolean par4)
    {
        super(par1GuiScreen, I18n.format(par4 ? "chat.link.confirmTrusted" : "chat.link.confirm", new Object[0]), par2Str, par3);
        this.confirmButtonText = I18n.format(par4 ? "chat.link.open" : "gui.yes", new Object[0]);
        this.cancelButtonText = I18n.format(par4 ? "gui.cancel" : "gui.no", new Object[0]);
        this.copyLinkButtonText = I18n.format("chat.copy", new Object[0]);
        this.openLinkWarning = I18n.format("chat.link.warning", new Object[0]);
        this.field_146361_t = par2Str;
    }

    /**
     * Adds the buttons (and other controls) to the screen in question.
     */
    public void initGui()
    {
        this.buttonList.add(new GuiButton(0, this.width / 3 - 83 + 0, this.height / 6 + 96, 100, 20, this.confirmButtonText));
        this.buttonList.add(new GuiButton(2, this.width / 3 - 83 + 105, this.height / 6 + 96, 100, 20, this.copyLinkButtonText));
        this.buttonList.add(new GuiButton(1, this.width / 3 - 83 + 210, this.height / 6 + 96, 100, 20, this.cancelButtonText));
    }

    protected void actionPerformed(GuiButton p_146284_1_)
    {
        if (p_146284_1_.id == 2)
        {
            this.copyLinkToClipboard();
        }

        this.parentScreen.confirmClicked(p_146284_1_.id == 0, this.field_146357_i);
    }

    /**
     * Copies the link to the system clipboard.
     */
    public void copyLinkToClipboard()
    {
        setClipboardString(this.field_146361_t);
    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int par1, int par2, float par3)
    {
        super.drawScreen(par1, par2, par3);

        if (this.field_146360_u)
        {
            this.drawCenteredString(this.fontRendererObj, this.openLinkWarning, this.width / 2, 110, 16764108);
        }
    }

    public void func_146358_g()
    {
        this.field_146360_u = false;
    }
}
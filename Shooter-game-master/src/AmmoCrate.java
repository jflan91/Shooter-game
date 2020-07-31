import java.awt.*;
import java.awt.image.BufferedImage;

public class AmmoCrate extends GameObject {

    private BufferedImage ammo_crate_image;


    public AmmoCrate(int x, int y, ID id, SpriteSheet ss) {
        super(x, y, id, ss);
        ammo_crate_image = ss.grabImage(6,2,32,32);
    }


    public void tick() {

    }


    public void render(Graphics g) {
        g.drawImage(ammo_crate_image,x,y,null);

    }


    public Rectangle getBounds() {
        return new Rectangle(x,y,32,32);
    }
}

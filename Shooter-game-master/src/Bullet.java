import java.awt.*;

public class Bullet extends GameObject {

    private Handler handler;

    public Bullet(int x, int y, int mx, int my, ID id, Handler handler, SpriteSheet ss) {
        super(x, y, id, ss);
        this.handler = handler;

        velX = (mx - x) /10;
        velY = (my - y) /10;
    }


    public void tick() {
        x += velX;
        y += velY;

        for (int i = 0; i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);

            if (tempObject.getId() == ID.Block){
                if(getBounds().intersects(tempObject.getBounds())){
                    handler.removeObject(this);
                }
            }
        }
    }


    public void render(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x,y,8,8);
    }


    public Rectangle getBounds() {
        return new Rectangle(x,y,8,8);
    }
}

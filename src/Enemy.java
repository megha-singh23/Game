public class Enemy {
    private int health;
    private int positionX;
    private int positionY;

    public Enemy(int health, int x, int y) {
        this.health = health;
        this.positionX = x;
        this.positionY = y;
    }

    public void move(int dx, int dy) {
        positionX += dx;
        positionY += dy;
    }

    public void takeDamage(int amount) {
        health -= amount;
        if (health < 0) {
            health = 0;
        }
    }

    public int getX() {
        return positionX;
    }

    public int getY() {
        return positionY;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Enemy at (" + positionX + "," + positionY + ") with " + health + " health.";
    }
}

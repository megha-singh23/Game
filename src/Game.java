import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Game {
    private Player player;
    private List<Enemy> enemies;
    private Random random;

    public Game() {
        player = new Player(100, 0, 0);
        enemies = new ArrayList<>();
        enemies.add(new Enemy(50, 2, 2));
        enemies.add(new Enemy(50, -3, -3));
        enemies.add(new Enemy(50, 5, -5));
        random = new Random();
    }

    public boolean isColliding(Player p, Enemy e) {
        return p.getX() == e.getX() && p.getY() == e.getY();
    }

    public void startGame() {
        System.out.println("Starting Game...");

        for (int turn = 1; turn <= 5; turn++) {
            if (player.getHealth() <= 0) {
                System.out.println("Player Died! Game Over.");
                return;
            }

            System.out.println("\nTurn " + turn);

            // Move Player
            player.move(randomMove(), randomMove());

            // Move Enemies
            for (Enemy enemy : enemies) {
                enemy.move(randomMove(), randomMove());
            }

            // Check collisions
            Iterator<Enemy> it = enemies.iterator();
            while (it.hasNext()) {
                Enemy enemy = it.next();
                if (isColliding(player, enemy)) {
                    System.out.println("Collision detected!");

                    player.takeDamage(10);
                    enemy.takeDamage(20);

                    if (enemy.getHealth() <= 0) {
                        System.out.println("Enemy defeated!");
                        it.remove();
                    }
                }
            }

            // Print status
            System.out.println(player);
            for (Enemy enemy : enemies) {
                System.out.println(enemy);
            }
        }

        System.out.println("\nGame Over!");
        System.out.println("Final Player Health: " + player.getHealth());
    }

    private int randomMove() {
        // Random movement: -1, 0, or +1
        int[] moves = {-1, 0, 1};
        return moves[random.nextInt(3)];
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }
}

# Player vs Enemy - Java Console Game

This is a simple Java-based console game where a player and multiple enemies move on a grid. The game simulates random movement and collisions between the player and enemies. Each collision results in damage, and enemies are removed when their health reaches zero.

## 🚀 Game Features

- A player starts with 100 health and is positioned at (0, 0).
- Three enemies are initialized at different positions, each with 50 health.
- Both the player and enemies move randomly (-1, 0, +1 per turn).
- Collisions cause:
  - Player to lose 10 health.
  - Enemy to lose 20 health.
- The game runs for 5 turns or until the player dies.
- Dead enemies are removed from the game.

## 🎮 Gameplay Rules

- Movement is random in both X and Y directions.
- If the player and an enemy occupy the same position after movement, they collide.
- The game ends after 5 turns or if the player's health reaches 0.

## 🧠 Code Structure

- **Game.java** – Main game loop and logic.
- **Player.java** – Player class with health and position.
- **Enemy.java** – Enemy class similar to Player.

## 🛠️ Requirements

- Java 8 or above
- A Java compiler (e.g., `javac`) and runtime (e.g., `java`)

## 🏁 How to Run

1. Clone the repository or download the files.
2. Compile the Java files:
   ```bash
   javac Game.java Player.java Enemy.java

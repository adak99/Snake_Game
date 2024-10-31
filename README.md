Here’s a revised version of your Snake Game documentation with an improved professional style and some fixes to enhance clarity and aesthetics:

---

# Snake Game 🐍

This is a classic **Snake Game** developed in Java using the **Swing** library. Inspired by the traditional snake game, the objective is simple: control the snake to eat food, grow longer, and avoid collisions with your own body or the wall.

## 🎮 Features

- **Responsive Controls:** Control the snake’s movement using the arrow keys.
- **Random Food Placement:** Food items appear at random positions on the board.
- **Score Tracking:** Each food item consumed increases your score.
- **Game Over Conditions:** The game ends if the snake collides with its own body or the wall.
- **Simple GUI:** Utilizes Java’s Swing framework for rendering graphics.
- **Customizable Board:** Easily adjust the board dimensions through code modifications.

## 🚀 Demo

<p align="center">
 <img src="Images/demo.png" alt="Game Demo" width="500vh" height="500vh"></p>

## 📥 Installation and Usage

1. **Clone the repository:**

   ```bash
   git clone https://github.com/adak99/Snake_Game.git
   ```

2. **Compile the project:**

   You can use any Java IDE like IntelliJ IDEA, Eclipse, or NetBeans. Alternatively, compile it manually using the following command:

   ```bash
   javac Main.java SnakeGame.java
   ```

3. **Run the game:**

   ```bash
   java Main
   ```

## 🎯 Gameplay Instructions

- **Control Keys:**
    - **Arrow Up:** Move up
    - **Arrow Down:** Move down
    - **Arrow Left:** Move left
    - **Arrow Right:** Move right

- **Objective:** Guide the snake to eat the red food and increase your score. The snake grows longer with each food item consumed.

- **Game Over Conditions:** The game ends if:
    - The snake collides with the wall.
    - The snake collides with its own body.

## 📜 Code Overview

### `Main` Class

- **Purpose:** Initializes the game window using Java's `JFrame`.
- **Core Functionality:**
    - Sets up the game window size, visibility, and close operation.
    - Adds the `SnakeGame` panel to the frame and starts the game loop.

### `SnakeGame` Class

- **Purpose:** Handles the core game logic and rendering.
- **Attributes:**
    - **Tile Class:** Represents each segment of the snake and the food.
    - **Variables:** Manages game components like the snake’s segments, food, movement direction, score, and game-over status.

- **Core Methods:**
    - `draw(Graphics g)`: Renders the snake, food, and game-over screen.
    - `placeFood()`: Randomly places food on the board.
    - `move()`: Handles the snake's movement and checks for food consumption or collisions.
    - `collision(Tile tile1, Tile tile2)`: Checks for collisions between two tiles.
    - `actionPerformed(ActionEvent e)`: Moves the snake and updates the game state at each timer tick.
    - `keyPressed(KeyEvent e)`: Captures keyboard inputs to control the snake's direction.

## 📸 Screenshots

### Game Running

<p align="center">
 <img src="Images/run.png" alt="Game Running" width="500vh" height="500vh"></p>

### Game Over Screen

<p align="center">
 <img src="Images/over.png" alt="Game Over" width="500vh" height="500vh"></p>

---

## 🛠️ Requirements

- **Java Development Kit (JDK) 8 or higher**
- **Any Java IDE or text editor**

<!-- ## How to Contribute

Feel free to fork this project and submit pull requests to contribute to the development. You can add new features, fix bugs, or enhance the game’s UI. -->

<!-- ## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details. -->

## 🙏 Acknowledgments

- **Java Swing Documentation** for reference on creating GUI applications.
- Classic snake games on early mobile devices, which served as an inspiration.

---


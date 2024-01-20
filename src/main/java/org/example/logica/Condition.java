package org.example.logica;

public class Condition {
    private Box box;

    public Condition(Box box) {
        this.box = box;
    }

    public boolean checkWinner() {
        if (checkForWinner('X') || checkForWinner('O')) {
            return true;
        }
        return false;
    }

    private boolean checkForWinner(char symbol) {
        return checkRowForWinner(symbol) || checkColumnForWinner(symbol) || checkDiagonalForWinner(symbol);
    }

    private boolean checkRowForWinner(char symbol) {
        return ((box.cell[0] == symbol && box.cell[1] == symbol && box.cell[2] == symbol) ||
                (box.cell[3] == symbol && box.cell[4] == symbol && box.cell[5] == symbol) ||
                (box.cell[6] == symbol && box.cell[7] == symbol && box.cell[8] == symbol));
    }

    private boolean checkColumnForWinner(char symbol) {
        return ((box.cell[0] == symbol && box.cell[3] == symbol && box.cell[6] == symbol) ||
                (box.cell[1] == symbol && box.cell[4] == symbol && box.cell[7] == symbol) ||
                (box.cell[2] == symbol && box.cell[5] == symbol && box.cell[8] == symbol));
    }

    private boolean checkDiagonalForWinner(char symbol) {
        return ((box.cell[0] == symbol && box.cell[4] == symbol && box.cell[8] == symbol) ||
                (box.cell[2] == symbol && box.cell[4] == symbol && box.cell[6] == symbol));
    }

    public boolean checkBoxAvailability() {
        for (int i = 0; i < 9; i++) {
            if (box.cell[i] != 'X' && box.cell[i] != 'O') {
                return true;
            }
        }
        return false;
    }
}
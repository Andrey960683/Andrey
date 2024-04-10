package day17;

import java.lang.reflect.Array;
import java.util.Arrays;

/**

 * Используя созданный Enum, в методе main() класса Task1 создайте массив, содержащий 4 белых пешки и 4 черных ладьи.
 * Выведите содержимое этого массива на экран, используя строковые обозначения шахматных фигур.
 *
 * Вывод в консоль должен быть таким:
 * ♙ ♙ ♙ ♙ ♜ ♜ ♜ ♜
 */
public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] piece = {
        ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
        ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK
        };
        for (ChessPiece chessPiece: piece){
            System.out.print(chessPiece.getRepresentation()+ " ");
        }
    }

}
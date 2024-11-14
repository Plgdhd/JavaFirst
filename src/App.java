import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        boolean isWorking = true;
        while(isWorking){
            menu();
            int answer;
            answer = in.nextInt();
            try{
                switch (answer) {
                    case 1:
                        System.out.print("\nВведите размер для одномерного массива: ");
                        int size = 0;
                        size = in.nextInt();
                        try{
                            int[] array = new int[size];
                            System.out.printf("\nВаш массив размером: ", size);
                            for(int i = 0; i < array.length; i++){
                                array[i] = rnd.nextInt(100+100-1) - 100;
                                System.out.printf("%d ", array[i]);
                            }
                            break;
                        }
                        catch(Exception ex){
                            System.out.println("\nНеверное значение!\n");
                            continue;
                        }
                    case 2: 
                        System.out.print("\nВведите количество строк: ");
                        int rows = 0;
                        try {
                            rows = in.nextInt(); 
                        } catch (Exception e) {
                            System.err.println("\nНеверное значение!\n");
                            break;
                        }
                        System.out.print("\nВведите количество столбоцов: ");
                        int cols = 0;
                        try {
                            cols = in.nextInt();
                        } catch (Exception e) {
                            System.err.println("\nНеверное значение!\n");
                            break;
                        }
                        int[][] array2D = new int[rows][cols];
                        System.out.println("\nВаш массив: ");
                        for(int i = 0; i<array2D.length; i++){
                            for(int j = 0; j<array2D[cols].length;j++){
                                array2D[i][j] = rnd.nextInt(100+100+1) - 100;
                                System.err.printf("%d ", array2D[i][j]);
                            }
                            System.out.println();
                        }
                        break;
                    case 3:
                        System.out.println("\nБП. Удачи!");
                        isWorking = false;
                    default:
                        continue;
                }
            }
            catch(Exception ex){
                System.err.print("\nНеверное значение!\n");
                continue;
            }
        }
        in.close();
    }
    public static void menu(){
        String menuOut =
                    "\nВыберите действие: \n" +
                    "1 -- Создание одномерного массива случайных чисел от -100 до 100\n"+
                    "2 -- Создание двумерного массива случайных чисел от -100 до 100\n"+
                    "3 -- Выход\n" +
                    "Ваш выбор: ";
        System.out.print(menuOut);
    }
}

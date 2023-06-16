
// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение
package JAVA;
import java.util.ArrayList;
import java.util.Random;
public class J6 
{
public static void main (String[] args){ 
ArrayList<Integer> list = new ArrayList<>();
Random rand = new Random();
int sum = 0;
for (int i = 0; i < 10; i++){
    int a = rand.nextInt(10);
    list.add(a);
    sum = sum + a;
    }

int max = list.get(0);
int min = list.get(0);

for (int i : list) {
    if (i > max) 
        max = i;
    if (i < min) 
    min = i;
    }

System.out.println("Список до удаления: " + list);
System.out.println("Минимальное значение списка: " + min);
System.out.println("Максимальное значение списка: " + max);
System.out.println("Среднее значение списка: " + (sum/list.size()));

for (int i = 0; i < list.size(); i++) {
    if (list.get(i) % 2 == 0) {
        list.remove(i);
        i--;
        }
    }
System.out.println("Список после удаления четных чисел: " + list);
    }
}

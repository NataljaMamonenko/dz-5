public class Main {
    public static void main(String[] args) {
//Надаємо значення 4 змінним та сумуємо їх попарно;
        int a = 6;
        int b = 3;
        int sum1 = a + b;
        int c = 5;
        int d = 1;
        int sum2 = c + d;
        System.out.println(sum1 + "," + sum2);
//Виводить результат порівняння сум (true, якщо перша сума більша).
        System.out.println(sum1 >= sum2);
//Збільшує першу суму на 1.
//Другу суму зменшує на 2.
        int sum3 = sum1 + 1;
        int sum4 = sum2 - 2;
        System.out.println(sum3 + "," + sum4);
//Виводить результат порівняння (true якщо перша сума більша).
        System.out.println(sum3 >= sum4);
//Виводить true якщо хоча б одна сума кратна 2, інакше - false.
 if (sum3 % 2 == 0 | sum4 % 2 == 0){
        System.out.println("true");}
 else{System.out.println("false");
        }
    }
}
package Lessons;
//5.63. В области 10 районов. Заданы площади, засеваемые пшеницей (в гектарах),
//и средняя урожайность (в центнерах с гектара) в каждом районе. Определить
//количество пшеницы, собранное в области, и среднюю урожайность по об-
public class Task5_63 {
    public static void main(String[] args) {

        int[] Area = {102,90,76,55,83,105,109,97,77,89}; // площади (га)
        int[] AveProduct = {65,69,71,58,81,68,77,63,62,65};//урожайность (ц/га)

        int totArea = 0;
        int totProd = 0;

        for (int i = 0; i <Area.length; i++) {
            totProd += Area[i] * AveProduct[i];
            totArea += Area[i];

        }
        double TotAveProduct = (double) totProd / (double) totArea;
        System.out.println("Количество пшеницы, собранное в области: " + totProd + " ц");
        System.out.println("Средняя урожайность по области: " + TotAveProduct + " ц/га");




    }
}

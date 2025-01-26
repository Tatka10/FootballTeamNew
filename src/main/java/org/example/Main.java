package org.example;

import java.io.File;
import java.io.FileWriter;
import java.util.*;
// сумму от индекса до индекса

public class Main {
    public static void main(String[] args) {
        List<Integer> effect = readFile("input.txt");
        effect.sort(Comparator.naturalOrder());
        System.out.println(effect);
        int z = countSummEffectivity(listToInt(effect));
        System.out.println(z);
        writeAnswer(z);

    }

    public static int[] listToInt(List<Integer> eff) {
        int[] mass = new int[eff.size()];
        for (int x = 0; x < eff.size(); x++) {
            mass[x] = eff.get(x);
        }
        return mass;
    }

    public static List<Integer> readFile(String fname) {
        int sumOfPlayers = 0;
        List<Integer> effect = new ArrayList<>();
        try (Scanner scan = new Scanner(new File(fname))) {
            sumOfPlayers = scan.nextInt();
            for (int x = 0; x < sumOfPlayers; x++) {
                int k = scan.nextInt();
                effect.add(x, k);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return effect;
    }

    public static int[] getArray() {
        System.out.println("Введите количество игроков");
        Scanner scanner = new Scanner(System.in);
        int sumOfPlayers = scanner.nextInt();
        System.out.println("Введите производительность игроков");
        int[] effect = new int[sumOfPlayers];
        for (int i = 0; i < sumOfPlayers; i++) {
            effect[i] = scanner.nextInt();
        }
        return effect;
    }

//    public static int[] sortByMinimum(int[] effect) {
//        int[] copyEffect = Arrays.copyOf(effect, effect.length);
//        for (int i = 0; i < copyEffect.length; i++) {
//            int numberMin = i;
//            int min = copyEffect[i];
//            for (int j = i + 1; j < copyEffect.length; j++) {
//                if (copyEffect[j] < min) {
//                    ;
//                    numberMin = j;
//                    min = copyEffect[j];
//                }
//            }
//            copyEffect[numberMin] = copyEffect[i];
//            copyEffect[i] = min;
//        }
//        return copyEffect;
//    }

    public static int countSummEffectivity(int[] sortMassive) {
        int maxPP = 0;
        int z = 0;
        int len = sortMassive.length;
        switch (len) {
            case 0:
                System.out.println("В команде нет людей");
                break;
            case 1:
                maxPP = sortMassive[len];
                break;
            case 2:
                maxPP = sortMassive[len] + sortMassive[len - 1];
                break;
        }
        for (int fired = 0; fired < len - 2; fired++) {
            int numBest = len - fired - 1;//выбор лидера
            z = chooseTeamForBest(sortMassive, numBest); //подбираем команду под выбранного лидера
            if (z > maxPP) {
                maxPP = z;
            }
        }
        return maxPP;
    }

    public static int chooseTeamForBest(int[] mass, int numBest) {
        int z = mass[numBest];
        int y = 0;
        for (y = numBest; y > 1; y--) {
            z = z + mass[y - 1];
            if (mass[numBest] > mass[y - 1] + mass[y - 2]) {
                if (y == numBest - 1 && mass.length > 4) z = z - mass[y - 1];
                break;
            }
        }
        if (y == 1) z = z + mass[y - 1];
        return z;
    }

    public static void writeAnswer(int z) {
        try {
            FileWriter fileWriter = new FileWriter("answer.txt");
            String ans= String.valueOf(z);
            System.out.println("в файл запишется значение "+ans);
            fileWriter.write(ans);
        } catch (Exception e) {
            System.out.println("Информация не сохранена в файл");
        }
    }
//    public static int summElemMassive(int[] mass, int x, int y) {
//        int summ = 0;
//        for (int i = x; i < y; i++) {
//            //Arrays.stream(mass, x, y).sum()
//            summ = summ + mass[i];
//        }
//        return summ;
//    }
}


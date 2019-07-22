/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.megasenaproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author rafael
 */
public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 6, 7, 8, 9, 13, 14, 17, 18, 19, 20, 22, 23, 24, 27, 33, 37, 38, 40, 42, 44, 47, 53, 54};
        Random posRandom = new Random();
        List<Integer> posSeq = new ArrayList<>();
        List<List> posSeqGame = new ArrayList<>();

        for (int y = 0; y < 24; y++) {
            for (int i = 0; i < 6; i++) {
                Integer pos = posRandom.nextInt(numbers.length - 1);
                while (posSeq.contains(pos)) {
                    pos = posRandom.nextInt(14);
                }
                posSeq.add(pos);
            }
            Collections.sort(posSeq);
            if (!posSeqGame.contains(posSeq)) {
                posSeqGame.add(posSeq);
            }
            posSeq = new ArrayList();
        }

        for (int i = 0; i < posSeqGame.size(); i++) {
            posSeq = posSeqGame.get(i);
            List<Integer> game = new ArrayList<>();
            for (int y = 0; y < posSeq.size(); y++) {
                game.add(numbers[posSeq.get(y)]);
            }
            System.out.println((i + 1) + " - " + game);
        }

    }

}

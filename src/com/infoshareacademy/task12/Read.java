package com.infoshareacademy.task12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.Collator;
import java.util.*;
import java.util.stream.Collector;

public class Read {
    public static void read() throws Exception{
        File file = new File("/home/pawelorlikowski/dev/jjdd4-sprint0/src/com/infoshareacademy/task12/input.txt");
        Scanner in = new Scanner(new FileReader(file));
        String text= in.next();
        Set<String> words = new TreeSet<>(Collator.getInstance());
        String[] tab=text.split(",");
        for (String a: tab) {
            words.add(a);

        }
        for (String a: words) {
            System.out.println(a);
        }
        }
    }


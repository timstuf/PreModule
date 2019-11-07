package com.nix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0) return new ArrayList<>();
        List<Integer> head = new ArrayList<>();
        head.add(1);
        List<List<Integer>> result = new ArrayList<>();
        result.add(head);

        for(int i = 1; i<numRows; i++)
        {
            head = new ArrayList<>();
            head.add(1);
            List<Integer> last = result.get(i-1);
            for(int j = 0; j<i-1; j++)
            {
                int par1 = last.get(j);
                int par2 = last.get(j+1);
                head.add(par1+par2);
            }
            head.add(1);
            result.add(head);
        }
        return result;
    }
}

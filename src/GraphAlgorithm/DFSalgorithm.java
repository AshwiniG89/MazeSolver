/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraphAlgorithm;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author harish
 */
public class DFSalgorithm {
    public static boolean searchPath(int[][]maze,int x,int y,ArrayList<Integer>path){
        
        if(maze[x][y]==9){
            path.add(x);
            path.add(y);
            return true;
        }
        
        if(maze[x][y]==0){
            maze[x][y]=2;
            
            int[]dx={1,0,-1,0};
            int[]dy={0,1,0,-1};
            
            for(int d=0;d<dx.length;d++){
                int newX=x+dx[d];
                int newY=y+dy[d];
                if(newX>=0 && newX<maze.length && newY>=0 && newY<maze[0].length
                    && searchPath(maze,newX,newY,path)){
                    path.add(x);
                    path.add(y);
                    return true;
                }
            }    
        }
        return false;
    }
    
    
    public static void main(String[]args){
        DFSalgorithm dfs=new DFSalgorithm();
        int[][] maze={{0,0,1},{0,1,9},{0,0,0}};
        ArrayList<Integer>path=new ArrayList<>();
        boolean result=searchPath(maze,0,0,path);
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+" ");
        }
    }
}

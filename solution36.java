import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result 
{
    public static int mostBalancedPartition(List<Integer> parent, List<Integer> files_size) 
    {
        // Write your code here
        int n = files_size.size();
        //creating adjacent list for trees
        List<List<Integer>> tree = new ArrayList<>();
        
        for(int i = 0; i<n; i++)
        {
            tree.get(parent.get(i)).add(i);
        }
        //dfs to calc size of each node's subtree
        int[] subtreeSize = new int[n];
        dfs(0, tree, files_size, subtreeSize);
        
        return tryAllPartitions(0, tree, subtreeSize);
    }
    
    private static void dfs(int node, List<List<Integer>> tree, List<Integer> files_size, int[] subtreeSizes)
    {
        //starting with size of the file at this node
        subtreeSizes[node] = files_size.get(node);
        
        for(int child:tree.get(node))
        {
            dfs(child, tree, files_size, subtreeSizes)
            {
                //sum up child subtree size
                subtreeSizes[node] += subtreeSizes[child];
            }
        }
    }
    
    private static int tryAllPartitions(int root, List<List<Integer>> tree, int[] subtreeSizes)
    {
        List<Integer> children = tree.get(root);
        int totalSize = subtreeSizes[root];
        
        if(children.isEmpty())
        {
            //base case (leaf node)
            return totalSize;
        }
        
        int minDifference = Integer.MAX_VALUE;
        
        for(int i = 0; i<(1 << children.size()); i++)
        {
            //bitmask to try all combinations
            int leftSize = 0; 
            int rightSize = 0;
            for(int j = 0; j<children.size(); j++)
            {
                if((i & (1 << j))!=0)
                {
                    leftSize += subtreeSizes[children.get(j)];
                }
                else
                {
                    rightSize += subtreeSizes[children.get(j)];
                }
                minDifference = Math.min(minDifference, Math.abs(leftSize-rightSize));
            }
            //recrusive case
            for(int child : children)
            {
                minDifference = Math.min(minDifference, tryAllPartitions(child, tree, subtreeSizes));
            }
        }
        return minDifference;
    }

}

public class Solution
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int parentCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> parent = IntStream.range(0, parentCount).mapToObj(i -> 
        {
            try 
            {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            }
            catch (IOException ex)
            {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int files_sizeCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> files_size = IntStream.range(0, files_sizeCount).mapToObj(i -> 
        {
            try 
            {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            }
            catch (IOException ex)
            {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.mostBalancedPartition(parent, files_size);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

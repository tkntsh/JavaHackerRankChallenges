import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result 
{
    public static int efficientJanitor(List<Float> weight)
    {
        //sorting in descending order
        Collections.sort(weight, Collections.reverseOrder());
        //counter for trips and accumulated weight
        int trips = 0;
        float currentTripWeight = 0;

        for (Float w : weight) 
        {
            //check if weight of bag is < 3 pounds
            if (currentTripWeight + w <= 3.00f) 
            {
                currentTripWeight += w;
            }
            //otherwise start a new trip
            else
            {
                trips++;
                currentTripWeight = w;
            }
        }
        //last trip if there are any bags left
        if (currentTripWeight > 0) 
        {
            trips++;
        }
        //returning total trips
        return trips;
    }
}

public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int weightCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Float> weight = IntStream.range(0, weightCount).mapToObj(i -> 
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
            .map(Float::parseFloat)
            .collect(toList());

        int result = Result.efficientJanitor(weight);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

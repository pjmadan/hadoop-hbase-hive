package hadoop.hbase.hive;


import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;

/**
 * Hello world!
 */
public class MapReduceExample1 {
    public static class map extends Mapper<LongWritable, Text, Text, IntWritable> {

        public static class reduce extends Reducer<Text, IntWritable, Text, IntWritable>
        {



        }

        }
    }


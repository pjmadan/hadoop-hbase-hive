package hadoop.hbase.hive;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

import java.io.IOException;

/**
 * Created by prajitmadan on 1/28/17.
 */
public class MapperExample1 extends MapReduceBase
        implements Mapper<LongWritable, Text, Text, IntWritable> {


    public void map(LongWritable key, Text value, OutputCollector<Text, IntWritable> outputCollector, Reporter reporter) throws IOException {

        String s = value.toString();
        for (String word : s.split((""))) {
            if (word.length() > 0) {
                outputCollector.collect(new Text(word), new IntWritable(1));
            }
        }
    }
}
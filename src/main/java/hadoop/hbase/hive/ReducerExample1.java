package hadoop.hbase.hive;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;

import java.io.IOException;
import java.util.Iterator;

/**
 * Created by prajitmadan on 1/28/17.
 */
public class ReducerExample1 extends MapReduceBase
        implements Reducer<Text, IntWritable, Text, IntWritable> {
    public void reduce(Text key, Iterator<IntWritable> value, OutputCollector<Text, IntWritable> outputCollector, Reporter reporter) throws IOException {


        int count = 0;
        while (value.hasNext()) {
            IntWritable i = value.next();
            count += i.get();

        }
        outputCollector.collect(key, new IntWritable((count)));
    }
}

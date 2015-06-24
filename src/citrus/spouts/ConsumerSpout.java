package citrus.spouts;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.IRichSpout;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Values;


public class ConsumerSpout implements IRichSpout 
{
	@Override
	public void open(Map conf, TopologyContext context,
			SpoutOutputCollector collector) {
		
	}

	@Override
	public void nextTuple() {
		

	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		declarer.declare(new Fields("line"));
	}

	@Override
	public void close() {
		

	}

	public boolean isDistributed() {
		return false;
	}

	@Override
	public void activate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deactivate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ack(Object msgId) {

	}

	@Override
	public void fail(Object msgId) {

	}

	@Override
	public Map<String, Object> getComponentConfiguration() {
		return null;
	}
}

package Lab3_1;

import java.util.List;

public class ReducerInput<K, V> {
	public K key;
	public List<V> val;

	@Override
	public String toString() {
		return "<" + key + " , " + (val == null ? "" : val.toString()) + ">";
	}

}

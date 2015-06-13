import java.util.Random;

public class DataElem implements Comparable<DataElem>, Cloneable {
	private String uuid1 = "";
	private String uuid2 = "";
	private String uuid3 = "";
	private String uuid4 = "";
	private String uuid5 = "";
	
	private Random rand = new Random(System.nanoTime());
	
	public void init() {
		uuid1 += rand.nextInt(10);
		uuid2 += rand.nextInt(10);
		uuid3 += rand.nextInt(10);
		uuid4 += rand.nextInt(10);
		uuid5 += rand.nextInt(10);
	}

	public String getUuid1() {
		return uuid1;
	}

	public void setUuid1(String uuid1) {
		this.uuid1 = uuid1;
	}

	public String getUuid2() {
		return uuid2;
	}

	public void setUuid2(String uuid2) {
		this.uuid2 = uuid2;
	}

	public String getUuid3() {
		return uuid3;
	}

	public void setUuid3(String uuid3) {
		this.uuid3 = uuid3;
	}

	public String getUuid4() {
		return uuid4;
	}

	public void setUuid4(String uuid4) {
		this.uuid4 = uuid4;
	}

	public String getUuid5() {
		return uuid5;
	}

	public void setUuid5(String uuid5) {
		this.uuid5 = uuid5;
	}

	@Override
	public int compareTo(DataElem o) {
		int cmp;
		
		if (getUuid1().equals("")) {
			return 1;
		}
		
		if (o.getUuid1().equals("")) {
			return -1;
		}
		
		cmp = getUuid1().compareTo(o.getUuid1());
		if (cmp > 0) return 1;
		if (cmp < 0) return -1;
		
		cmp = getUuid2().compareTo(o.getUuid2());
		if (cmp > 0) return 1;
		if (cmp < 0) return -1;
		
		cmp = getUuid3().compareTo(o.getUuid3());
		if (cmp > 0) return 1;
		if (cmp < 0) return -1;
	
		cmp = getUuid4().compareTo(o.getUuid4());
		if (cmp > 0) return 1;
		if (cmp < 0) return -1;
		
		cmp = getUuid5().compareTo(o.getUuid5());
		if (cmp > 0) return 1;
		if (cmp < 0) return -1;
		
		return 0;
	}
	
	public String toString() {
		return uuid1 + ":" + uuid2 + ":" + uuid3 + ":" + uuid4 + ":" + uuid5;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
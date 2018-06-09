package pb2;

class MathEx {
	final static double Pi=3.14;
	
	static int abs(int nNum) {
		if(nNum<0)
		nNum=nNum*-1;
		return nNum;
	}
	double abs(double dNum) {
		if(dNum<0)
		dNum=dNum*-1.0;
		return dNum;
	}
}

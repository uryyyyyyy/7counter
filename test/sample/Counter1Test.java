package sample;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Counter1Test {

	static Counter1 counter = new Counter1();

	@Test
	public void test() {
		assertThat(Integer.valueOf(counter.count(10, 7)), is(1));
		assertThat(Integer.valueOf(counter.count(20, 7)), is(2));
		assertThat(Integer.valueOf(counter.count(70, 7)), is(8));
		assertThat(Integer.valueOf(counter.count(80, 7)), is(18));
		assertThat(Integer.valueOf(counter.count(90, 7)), is(19));
	}

	@Test
	public void test2() {
		assertThat(Integer.valueOf(counter.count(100, 7)), is(20));
		assertThat(Integer.valueOf(counter.count(200, 7)), is(40));
		assertThat(Integer.valueOf(counter.count(700, 7)), is(141));
		assertThat(Integer.valueOf(counter.count(800, 7)), is(260));
		assertThat(Integer.valueOf(counter.count(1000, 7)), is(300));
	}

	@Test
	public void test3() {
		assertThat(Integer.valueOf(counter.count(2000, 7)), is(600));
		assertThat(Integer.valueOf(counter.count(7000, 7)), is(2101));
		assertThat(Integer.valueOf(counter.count(8000, 7)), is(3400));
		assertThat(Integer.valueOf(counter.count(10000, 7)), is(4000));
	}

	@Test
	public void test4() {
		assertThat(Integer.valueOf(counter.count(348, 7)), is((34+1)*1 + 3*10));
		assertThat(Integer.valueOf(counter.count(1192, 7)), is(119*1 + (11+1)*10 + 1*100));
		assertThat(Integer.valueOf(counter.count(7192, 7)), is(719*1 + (71+1)*10 + 7*100 + 193));
		assertThat(Integer.valueOf(counter.count(63074, 7)), is(6307*1 + 630*10+5 + 63*100 + 6*1000));
		assertThat(Integer.valueOf(counter.count(784708, 7)), is((78470+1)*1 + 7847*10 + 784*100+9 + 78*1000 + (7+1)*10000 + 84709));
	}
	@Test
	public void test5() {
		int moke = 784708;
		assertThat(Integer.valueOf(counter.count(moke, 7)), 
				is((moke/10+1)*1 + moke/100*10 + moke/1000*100+9 + moke/10000*1000 + (moke/100000+1)*10000 + moke%100000+1));
	}

	@Test
	public void test6() {
		assertThat(Integer.valueOf(counter.count(99, 7)), is(20));
		assertThat(Integer.valueOf(counter.count(77777, 7)), is(7*4000 + 7*300 + 7*20 + 7*1+ 7778 + 778 + 78 +8 + 1));
		//		assertThat(Integer.valueOf(counter.count(23678947)), is(7*300 + 1*20 + 9*1 + 193 + 10));//
		//		assertThat(Integer.valueOf(counter.count(732465890)), is(6*4000 + 3*300 + 0*20 + 7*1 + 5));
		//		assertThat(Integer.valueOf(counter.count(1912478368)), is(7*4000 + 4*300 + 7*20 + 0*1 + 4709 + 9 + 1));
	}
}

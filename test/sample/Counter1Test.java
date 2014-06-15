package sample;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Counter1Test {

	static Counter1 counter = new Counter1();

	@Test
	public void test() {
		assertThat(counter.countTergetNumInInput(10, 7), is(1l));
		assertThat(counter.countTergetNumInInput(20, 7), is(2));
		assertThat(counter.countTergetNumInInput(70, 7), is(8));
		assertThat(counter.countTergetNumInInput(80, 7), is(18));
		assertThat(counter.countTergetNumInInput(90, 7), is(19));
	}

	@Test
	public void test2() {
		assertThat(counter.countTergetNumInInput(100, 7), is(20));
		assertThat(counter.countTergetNumInInput(200, 7), is(40));
		assertThat(counter.countTergetNumInInput(700, 7), is(141));
		assertThat(counter.countTergetNumInInput(800, 7), is(260));
		assertThat(counter.countTergetNumInInput(1000, 7), is(300));
	}

	@Test
	public void test3() {
		assertThat(counter.countTergetNumInInput(2000, 7), is(600));
		assertThat(counter.countTergetNumInInput(7000, 7), is(2101));
		assertThat(counter.countTergetNumInInput(8000, 7), is(3400));
		assertThat(counter.countTergetNumInInput(10000, 7), is(4000));
	}

	@Test
	public void test4() {
		assertThat(counter.countTergetNumInInput(348, 7), is((34+1)*1 + 3*10));
		assertThat(counter.countTergetNumInInput(1192, 7), is(119*1 + (11+1)*10 + 1*100));
		assertThat(counter.countTergetNumInInput(7192, 7), is(719*1 + (71+1)*10 + 7*100 + 193));
		assertThat(counter.countTergetNumInInput(63074, 7), is(6307*1 + 630*10+5 + 63*100 + 6*1000));
		assertThat(counter.countTergetNumInInput(784708, 7), is((78470+1)*1 + 7847*10 + 784*100+9 + 78*1000 + (7+1)*10000 + 84709));
	}
	@Test
	public void test5() {
		int moke = 784708;
		assertThat(counter.countTergetNumInInput(moke, 7), 
				is((moke/10+1)*1 + moke/100*10 + moke/1000*100+9 + moke/10000*1000 + (moke/100000+1)*10000 + moke%100000+1L));
	}

	@Test
	public void test6() {
		assertThat(counter.countTergetNumInInput(99, 7), is(20L));
		assertThat(counter.countTergetNumInInput(77777, 7), is(38890L));
		assertThat(counter.countTergetNumInInput(23678947, 7), is(16140633L));
		assertThat(counter.countTergetNumInInput(732465890, 7), is(614891670L));
		assertThat(counter.countTergetNumInInput(1912478368, 7), is(2728439836L));
	}
}

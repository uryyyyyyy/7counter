package sample;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Counter1Test {

	static TargetNumberCounterImpl1 counter = new TargetNumberCounterImpl1();

	@Test
	public void test() {
		assertThat(counter.countTargetNumInInput(10, 7), is(1l));
		assertThat(counter.countTargetNumInInput(20, 7), is(2));
		assertThat(counter.countTargetNumInInput(70, 7), is(8));
		assertThat(counter.countTargetNumInInput(80, 7), is(18));
		assertThat(counter.countTargetNumInInput(90, 7), is(19));
	}

	@Test
	public void test2() {
		assertThat(counter.countTargetNumInInput(100, 7), is(20));
		assertThat(counter.countTargetNumInInput(200, 7), is(40));
		assertThat(counter.countTargetNumInInput(700, 7), is(141));
		assertThat(counter.countTargetNumInInput(800, 7), is(260));
		assertThat(counter.countTargetNumInInput(1000, 7), is(300));
	}

	@Test
	public void test3() {
		assertThat(counter.countTargetNumInInput(2000, 7), is(600));
		assertThat(counter.countTargetNumInInput(7000, 7), is(2101));
		assertThat(counter.countTargetNumInInput(8000, 7), is(3400));
		assertThat(counter.countTargetNumInInput(10000, 7), is(4000));
	}

	@Test
	public void test4() {
		assertThat(counter.countTargetNumInInput(348, 7), is((34+1)*1 + 3*10));
		assertThat(counter.countTargetNumInInput(1192, 7), is(119*1 + (11+1)*10 + 1*100));
		assertThat(counter.countTargetNumInInput(7192, 7), is(719*1 + (71+1)*10 + 7*100 + 193));
		assertThat(counter.countTargetNumInInput(63074, 7), is(6307*1 + 630*10+5 + 63*100 + 6*1000));
		assertThat(counter.countTargetNumInInput(784708, 7), is((78470+1)*1 + 7847*10 + 784*100+9 + 78*1000 + (7+1)*10000 + 84709));
	}
	@Test
	public void test5() {
		int moke = 784708;
		assertThat(counter.countTargetNumInInput(moke, 7), 
				is((moke/10+1)*1 + moke/100*10 + moke/1000*100+9 + moke/10000*1000 + (moke/100000+1)*10000 + moke%100000+1L));
	}

	@Test
	public void test6() {
		assertThat(counter.countTargetNumInInput(99, 7), is(20L));
		assertThat(counter.countTargetNumInInput(77777, 7), is(38890L));
		assertThat(counter.countTargetNumInInput(23678947, 7), is(16140633L));
		assertThat(counter.countTargetNumInInput(732465890, 7), is(614891670L));
		assertThat(counter.countTargetNumInInput(1912478368, 7), is(2728439836L));
	}
}

package com.likith.EmployeesRating;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeesRatingApplicationTests {

	@Test
	public void contextLoads() {
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> tree = new TreeSet<Integer>();
		Set<Integer> hash = new HashSet<Integer>();
		Set<Integer> linked = new LinkedHashSet<Integer>();
		
		tree.add(1);
		hash.add(1);
		linked.add(1);
		list.add(1);
		
		tree.add(3);
		hash.add(3);
		linked.add(3);
		list.add(3);
		
		tree.add(3);
		hash.add(3);
		linked.add(3);
		list.add(3);
		
		tree.add(5);
		hash.add(5);
		linked.add(5);
		list.add(5);
		
		tree.add(2);
		hash.add(2);
		linked.add(2);
		list.add(2);
		
		tree.add(4);
		hash.add(4);
		linked.add(4);
		list.add(4);
		
		System.out.println("tree set :" + tree);
		System.out.println("hash set :" + hash);
		System.out.println("set linked :" + linked);
		System.out.println("array list :" + list);
		
		
	}

}

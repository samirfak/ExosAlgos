package Streams;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.junit.Test;

public class PlayingWithStreams {

	@Test
	public void test() {
		List<List<String>> data = new ArrayList<>() ;
        data.add(List.of("A","B")) ;
        data.add(List.of("D","C","E")) ;
        data.stream()
                //.map(List::size)
                .flatMap(Collection::stream)
                .forEach(System.out::println);
	}
	
	@Test
    public void play_with_flatMap() {
        List<List<String>> data = new ArrayList<>() ;
        data.add(List.of("A","B")) ;
        data.add(List.of("D","C","E")) ;
        //data.stream()
        //.flatMap(Collection::stream)
                //.collect(Collectors.toList());
        
       // AssertEquals(result, {"A","B","D","C","E"}) ;
    }
	
	
	@Test
    void play_with_filter() {
        var data = List.of("A","B","E","ARe") ;
        var result =  data.stream()
                .filter(s -> ((String) s).startsWith("A"))
                .collect(Collectors.toList());
        assertThat(result).containsExactly("A","ARe") ;
    }

    @Test
    void play_with_predicate() {
        var data = List.of("A","B","E","ARe") ;
        var result =  data.stream()
                .filter(Predicate.not(s -> ((String) s).startsWith("A")))
                .collect(Collectors.toList());
        assertThat(result).containsExactly("B","E") ;
    }

}

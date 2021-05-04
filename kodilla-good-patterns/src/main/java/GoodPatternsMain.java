import com.kodilla.good.patterns.challanges.MovieStore;

import java.util.stream.Collectors;

public class GoodPatternsMain {
    public static void main(String[] args){
        MovieStore movieStore = new MovieStore();
        String result = movieStore.getMovies().entrySet().stream()
                .flatMap(x -> x.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(result);

    }
}

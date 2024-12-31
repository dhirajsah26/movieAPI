package np.com.dhirajsah.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Console;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> findAllMovies() {
        List<Movie> movies = repository.findAll();
//        movies.forEach(movie -> {
//            System.out.println("Generated toString: " + movie.toString());
//        });
        return movies;
    }

    public Optional<Movie> findMovieById(ObjectId id) {
        return movieRepository.findById(id);
    }

    public Optional<Movie> findMovieByImdbId(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}

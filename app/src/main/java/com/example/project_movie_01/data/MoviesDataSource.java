package com.example.project_movie_01.data;

import java.util.List;

public interface MoviesDataSource {
    public interface OnFetchMovieListener<T> {
        void onFetchMovieSuccess(List<T> data);

        void onFetchMovieFailure(Exception e);
    }

    public interface FetchMovieDataSource {
        void getMovies(MoviesDataSource.OnFetchMovieListener listener);
    }

    public interface FetchPopularDataSource {
        void getPopular(MoviesDataSource.OnFetchMovieListener listener);
    }
}

package com.example.asynctaskwithapiexample.utilities;

import android.os.AsyncTask;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class AsyncDataLoader extends AsyncTask<String, Void, String> {

    protected String doInBackground(String... params) {
        try {
            return ApiDataReader.getValuesFromApi(params[0], params[1]); // Pass both arguments
        } catch (IOException ex) {
            return String.format("Some error occurred => %s", ex.getMessage());
        }
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
    }
}

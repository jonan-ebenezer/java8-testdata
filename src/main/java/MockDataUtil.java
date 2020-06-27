import java.io.*;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import com.google.common.collect.ImmutableList;
import com.google.common.io.Resources;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class MockDataUtil {

    public static List<Employee> getEmployees() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonData = FileUtils.readFileToString(new File("/home/jonan/IdeaProjects/practise/testdata/employee.json"), StandardCharsets.UTF_8);
        List<Employee> participantJsonList = mapper.readValue(jsonData, new TypeReference<List<Employee>>() {
        });
        return participantJsonList;

    }

}
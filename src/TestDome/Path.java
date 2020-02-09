package TestDome;

import java.util.ArrayList;

public class Path {
    private String path;

    public Path(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void cd(String newPath) {
        int i = 0;
        String[] newPathArr = newPath.split("/");
        String[] pathArr = this.path.split("/");
        int newPathLength = newPathArr.length;

        ArrayList pathList = new ArrayList();
        for (int j = 1; j < pathArr.length; j++) {
            pathList.add(pathArr[j]);
        }

        if (newPathArr[0].equals("")) {
            pathList.clear();
            pathList.add(newPathArr[1]);
            i = i + 2;
        }
        while (i < newPathLength) {
            int k = pathList.size() - 1;
            if (newPathArr[i].equals("..")) {
                pathList.remove(k);
            } else {
                pathList.add(newPathArr[i]);
            }
            i++;
        }

    }

    public static void main(String[] args) {
        Path path = new Path("/a/b/c/d");
        path.cd("x/../z");
        System.out.println(path.getPath());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htmlcomponents;

/**
 *
 * @author giorgos
 */
public class HtmlComponents {

    /**
     * This method starts an HTML file. It provides a string starting from
     * <!DOCTYPE html>
     * and ending to <body>
     *
     * @return
     */
    public String startHTML(String title) {
        StringBuilder strBuild = new StringBuilder();
        strBuild.append("<!DOCTYPE html>")
                .append("<html>")
                .append("<head>")
                .append("<title>" + title + "</title>")
                .append("</head>")
                .append("<body>");
        return strBuild.toString();
    }

    public String endHTML() {
        StringBuilder strBuild = new StringBuilder();
        strBuild.append("</body>")
                .append("</html>");
        return strBuild.toString();
    }

    /**
     * This method creates a <tr> element with variable <th> elements, and
     * returns it as a string.
     *
     * @param rowHeadings: Name of the columns.
     * @return
     */
    public String createTableHeadings(String... rowHeadings) {
        StringBuilder strBuild = new StringBuilder();
        strBuild.append("<tr>");
        for (String s : rowHeadings) {
            strBuild.append("<th>" + s + "</th>");
        }
        strBuild.append("</tr>");
        return strBuild.toString();
    }

    /**
     * This method creates a <tr> element with variable <td> elements, and
     * returns it as a string.
     *
     * @param rowData
     * @return
     */
    public String createTableData(String... rowData) {
        StringBuilder strBuild = new StringBuilder();
        strBuild.append("<tr>");
        for (String s : rowData) {
            strBuild.append("<td>" + s + "</td>");
        }
        strBuild.append("</tr>");
        return strBuild.toString();
    }

    public String createLogin(String action) {
        StringBuilder strBuild = new StringBuilder();
        strBuild.append("<form method=\"POST\" action=\"" + action + "\">")
                .append("<label for=\"username\">Username:</label>")
                .append("<input id=\"username\" type=\"text\" name=\"username\" placeholder=\"myusername\" required maxlength=\"10\" minlength=\"4\" />")
                .append("<br />")
                .append("<label for=\"password\">Password:</label>")
                .append("<input id=\"password\" type=\"password\" name=\"password\" placeholder=\"myP@asSw0rd\" required maxlength=\"20\" minlength=\"4\"/>")
                .append("<br />")
                .append("<input type=\"submit\" value=\"Login\" />")
                .append("</form>");
        return strBuild.toString();
    }

}

# About

jdbc-wrappers is an MIT-licensed set of Java decorator classes that wrap
the most common JDBC interfaces. It may come in handy when, well, you need
to wrap, proxy, or decorate them:

- java.sql.CallableStatement > io.trbl.jdbc.CallableStatementWrapper
- java.sql.Connection > io.trbl.jdbc.ConnectionWrapper
- java.sql.DataSource > io.trbl.jdbc.DataSourceWrapper
- java.sql.PreparedStatement > io.trbl.jdbc.PreparedStatementWrapper
- java.sql.ResultSet > io.trbl.jdbc.ResultSetWrapper
- java.sql.Statement > io.trbl.jdbc.StatementWrapper

All classes come with a hopefully correct implementation of java.sql.Wrapper.

# Build

1. Clone this repository:
       
        git clone git@github.com:hsch/jdbc-wrappers.git
        cd jdbc-wrappers

2. Run Build:
       
        gradlew build
       
3. Find your library
        
        ls -la build/libs/jdbc-wrappers.jar


# License

Copyright &copy; 2016 Hendrik Schnepel

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

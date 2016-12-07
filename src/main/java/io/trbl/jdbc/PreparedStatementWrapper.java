/*
 * MIT License, Copyright (c) 2016 Hendrik Schnepel
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package io.trbl.jdbc;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;

public class PreparedStatementWrapper extends BasicWrapper<PreparedStatement>implements PreparedStatement {

  public PreparedStatementWrapper(final PreparedStatement target) {
    super(target);
  }

  @Override
  public ResultSet executeQuery(final String sql) throws SQLException {
    return target.executeQuery(sql);
  }

  @Override
  public ResultSet executeQuery() throws SQLException {
    return target.executeQuery();
  }

  @Override
  public int executeUpdate(final String sql) throws SQLException {
    return target.executeUpdate(sql);
  }

  @Override
  public int executeUpdate() throws SQLException {
    return target.executeUpdate();
  }

  @Override
  public void setNull(final int parameterIndex, final int sqlType) throws SQLException {
    target.setNull(parameterIndex, sqlType);
  }

  @Override
  public void close() throws SQLException {
    target.close();
  }

  @Override
  public int getMaxFieldSize() throws SQLException {
    return target.getMaxFieldSize();
  }

  @Override
  public void setBoolean(final int parameterIndex, final boolean x) throws SQLException {
    target.setBoolean(parameterIndex, x);
  }

  @Override
  public void setByte(final int parameterIndex, final byte x) throws SQLException {
    target.setByte(parameterIndex, x);
  }

  @Override
  public void setMaxFieldSize(final int max) throws SQLException {
    target.setMaxFieldSize(max);
  }

  @Override
  public void setShort(final int parameterIndex, final short x) throws SQLException {
    target.setShort(parameterIndex, x);
  }

  @Override
  public int getMaxRows() throws SQLException {
    return target.getMaxRows();
  }

  @Override
  public void setInt(final int parameterIndex, final int x) throws SQLException {
    target.setInt(parameterIndex, x);
  }

  @Override
  public void setMaxRows(final int max) throws SQLException {
    target.setMaxRows(max);
  }

  @Override
  public void setLong(final int parameterIndex, final long x) throws SQLException {
    target.setLong(parameterIndex, x);
  }

  @Override
  public void setFloat(final int parameterIndex, final float x) throws SQLException {
    target.setFloat(parameterIndex, x);
  }

  @Override
  public void setEscapeProcessing(final boolean enable) throws SQLException {
    target.setEscapeProcessing(enable);
  }

  @Override
  public void setDouble(final int parameterIndex, final double x) throws SQLException {
    target.setDouble(parameterIndex, x);
  }

  @Override
  public int getQueryTimeout() throws SQLException {
    return target.getQueryTimeout();
  }

  @Override
  public void setBigDecimal(final int parameterIndex, final BigDecimal x) throws SQLException {
    target.setBigDecimal(parameterIndex, x);
  }

  @Override
  public void setQueryTimeout(final int seconds) throws SQLException {
    target.setQueryTimeout(seconds);
  }

  @Override
  public void setString(final int parameterIndex, final String x) throws SQLException {
    target.setString(parameterIndex, x);
  }

  @Override
  public void setBytes(final int parameterIndex, final byte[] x) throws SQLException {
    target.setBytes(parameterIndex, x);
  }

  @Override
  public void cancel() throws SQLException {
    target.cancel();
  }

  @Override
  public void setDate(final int parameterIndex, final Date x) throws SQLException {
    target.setDate(parameterIndex, x);
  }

  @Override
  public SQLWarning getWarnings() throws SQLException {
    return target.getWarnings();
  }

  @Override
  public void setTime(final int parameterIndex, final Time x) throws SQLException {
    target.setTime(parameterIndex, x);
  }

  @Override
  public void setTimestamp(final int parameterIndex, final Timestamp x) throws SQLException {
    target.setTimestamp(parameterIndex, x);
  }

  @Override
  public void clearWarnings() throws SQLException {
    target.clearWarnings();
  }

  @Override
  public void setCursorName(final String name) throws SQLException {
    target.setCursorName(name);
  }

  @Override
  public void setAsciiStream(final int parameterIndex, final InputStream x, final int length) throws SQLException {
    target.setAsciiStream(parameterIndex, x, length);
  }

  @Deprecated
  @Override
  public void setUnicodeStream(final int parameterIndex, final InputStream x, final int length) throws SQLException {
    target.setUnicodeStream(parameterIndex, x, length);
  }

  @Override
  public boolean execute(final String sql) throws SQLException {
    return target.execute(sql);
  }

  @Override
  public void setBinaryStream(final int parameterIndex, final InputStream x, final int length) throws SQLException {
    target.setBinaryStream(parameterIndex, x, length);
  }

  @Override
  public ResultSet getResultSet() throws SQLException {
    return target.getResultSet();
  }

  @Override
  public int getUpdateCount() throws SQLException {
    return target.getUpdateCount();
  }

  @Override
  public void clearParameters() throws SQLException {
    target.clearParameters();
  }

  @Override
  public boolean getMoreResults() throws SQLException {
    return target.getMoreResults();
  }

  @Override
  public void setObject(final int parameterIndex, final Object x, final int targetSqlType) throws SQLException {
    target.setObject(parameterIndex, x, targetSqlType);
  }

  @Override
  public void setFetchDirection(final int direction) throws SQLException {
    target.setFetchDirection(direction);
  }

  @Override
  public void setObject(final int parameterIndex, final Object x) throws SQLException {
    target.setObject(parameterIndex, x);
  }

  @Override
  public int getFetchDirection() throws SQLException {
    return target.getFetchDirection();
  }

  @Override
  public void setFetchSize(final int rows) throws SQLException {
    target.setFetchSize(rows);
  }

  @Override
  public int getFetchSize() throws SQLException {
    return target.getFetchSize();
  }

  @Override
  public boolean execute() throws SQLException {
    return target.execute();
  }

  @Override
  public int getResultSetConcurrency() throws SQLException {
    return target.getResultSetConcurrency();
  }

  @Override
  public int getResultSetType() throws SQLException {
    return target.getResultSetType();
  }

  @Override
  public void addBatch(final String sql) throws SQLException {
    target.addBatch(sql);
  }

  @Override
  public void addBatch() throws SQLException {
    target.addBatch();
  }

  @Override
  public void setCharacterStream(final int parameterIndex, final Reader reader, final int length) throws SQLException {
    target.setCharacterStream(parameterIndex, reader, length);
  }

  @Override
  public void clearBatch() throws SQLException {
    target.clearBatch();
  }

  @Override
  public int[] executeBatch() throws SQLException {
    return target.executeBatch();
  }

  @Override
  public void setRef(final int parameterIndex, final Ref x) throws SQLException {
    target.setRef(parameterIndex, x);
  }

  @Override
  public void setBlob(final int parameterIndex, final Blob x) throws SQLException {
    target.setBlob(parameterIndex, x);
  }

  @Override
  public void setClob(final int parameterIndex, final Clob x) throws SQLException {
    target.setClob(parameterIndex, x);
  }

  @Override
  public void setArray(final int parameterIndex, final Array x) throws SQLException {
    target.setArray(parameterIndex, x);
  }

  @Override
  public Connection getConnection() throws SQLException {
    return target.getConnection();
  }

  @Override
  public ResultSetMetaData getMetaData() throws SQLException {
    return target.getMetaData();
  }

  @Override
  public void setDate(final int parameterIndex, final Date x, final Calendar cal) throws SQLException {
    target.setDate(parameterIndex, x, cal);
  }

  @Override
  public boolean getMoreResults(final int current) throws SQLException {
    return target.getMoreResults(current);
  }

  @Override
  public void setTime(final int parameterIndex, final Time x, final Calendar cal) throws SQLException {
    target.setTime(parameterIndex, x, cal);
  }

  @Override
  public ResultSet getGeneratedKeys() throws SQLException {
    return target.getGeneratedKeys();
  }

  @Override
  public void setTimestamp(final int parameterIndex, final Timestamp x, final Calendar cal) throws SQLException {
    target.setTimestamp(parameterIndex, x, cal);
  }

  @Override
  public int executeUpdate(final String sql, final int autoGeneratedKeys) throws SQLException {
    return target.executeUpdate(sql, autoGeneratedKeys);
  }

  @Override
  public void setNull(final int parameterIndex, final int sqlType, final String typeName) throws SQLException {
    target.setNull(parameterIndex, sqlType, typeName);
  }

  @Override
  public int executeUpdate(final String sql, final int[] columnIndexes) throws SQLException {
    return target.executeUpdate(sql, columnIndexes);
  }

  @Override
  public void setURL(final int parameterIndex, final URL x) throws SQLException {
    target.setURL(parameterIndex, x);
  }

  @Override
  public ParameterMetaData getParameterMetaData() throws SQLException {
    return target.getParameterMetaData();
  }

  @Override
  public void setRowId(final int parameterIndex, final RowId x) throws SQLException {
    target.setRowId(parameterIndex, x);
  }

  @Override
  public int executeUpdate(final String sql, final String[] columnNames) throws SQLException {
    return target.executeUpdate(sql, columnNames);
  }

  @Override
  public void setNString(final int parameterIndex, final String value) throws SQLException {
    target.setNString(parameterIndex, value);
  }

  @Override
  public void setNCharacterStream(final int parameterIndex, final Reader value, final long length) throws SQLException {
    target.setNCharacterStream(parameterIndex, value, length);
  }

  @Override
  public boolean execute(final String sql, final int autoGeneratedKeys) throws SQLException {
    return target.execute(sql, autoGeneratedKeys);
  }

  @Override
  public void setNClob(final int parameterIndex, final NClob value) throws SQLException {
    target.setNClob(parameterIndex, value);
  }

  @Override
  public void setClob(final int parameterIndex, final Reader reader, final long length) throws SQLException {
    target.setClob(parameterIndex, reader, length);
  }

  @Override
  public boolean execute(final String sql, final int[] columnIndexes) throws SQLException {
    return target.execute(sql, columnIndexes);
  }

  @Override
  public void setBlob(final int parameterIndex, final InputStream inputStream, final long length) throws SQLException {
    target.setBlob(parameterIndex, inputStream, length);
  }

  @Override
  public void setNClob(final int parameterIndex, final Reader reader, final long length) throws SQLException {
    target.setNClob(parameterIndex, reader, length);
  }

  @Override
  public boolean execute(final String sql, final String[] columnNames) throws SQLException {
    return target.execute(sql, columnNames);
  }

  @Override
  public void setSQLXML(final int parameterIndex, final SQLXML xmlObject) throws SQLException {
    target.setSQLXML(parameterIndex, xmlObject);
  }

  @Override
  public void setObject(final int parameterIndex, final Object x, final int targetSqlType, final int scaleOrLength) throws SQLException {
    target.setObject(parameterIndex, x, targetSqlType, scaleOrLength);
  }

  @Override
  public int getResultSetHoldability() throws SQLException {
    return target.getResultSetHoldability();
  }

  @Override
  public boolean isClosed() throws SQLException {
    return target.isClosed();
  }

  @Override
  public void setPoolable(final boolean poolable) throws SQLException {
    target.setPoolable(poolable);
  }

  @Override
  public void setAsciiStream(final int parameterIndex, final InputStream x, final long length) throws SQLException {
    target.setAsciiStream(parameterIndex, x, length);
  }

  @Override
  public boolean isPoolable() throws SQLException {
    return target.isPoolable();
  }

  @Override
  public void closeOnCompletion() throws SQLException {
    target.closeOnCompletion();
  }

  @Override
  public void setBinaryStream(final int parameterIndex, final InputStream x, final long length) throws SQLException {
    target.setBinaryStream(parameterIndex, x, length);
  }

  @Override
  public boolean isCloseOnCompletion() throws SQLException {
    return target.isCloseOnCompletion();
  }

  @Override
  public void setCharacterStream(final int parameterIndex, final Reader reader, final long length) throws SQLException {
    target.setCharacterStream(parameterIndex, reader, length);
  }

  @Override
  public long getLargeUpdateCount() throws SQLException {
    return target.getLargeUpdateCount();
  }

  @Override
  public void setLargeMaxRows(final long max) throws SQLException {
    target.setLargeMaxRows(max);
  }

  @Override
  public void setAsciiStream(final int parameterIndex, final InputStream x) throws SQLException {
    target.setAsciiStream(parameterIndex, x);
  }

  @Override
  public long getLargeMaxRows() throws SQLException {
    return target.getLargeMaxRows();
  }

  @Override
  public void setBinaryStream(final int parameterIndex, final InputStream x) throws SQLException {
    target.setBinaryStream(parameterIndex, x);
  }

  @Override
  public long[] executeLargeBatch() throws SQLException {
    return target.executeLargeBatch();
  }

  @Override
  public void setCharacterStream(final int parameterIndex, final Reader reader) throws SQLException {
    target.setCharacterStream(parameterIndex, reader);
  }

  @Override
  public void setNCharacterStream(final int parameterIndex, final Reader value) throws SQLException {
    target.setNCharacterStream(parameterIndex, value);
  }

  @Override
  public long executeLargeUpdate(final String sql) throws SQLException {
    return target.executeLargeUpdate(sql);
  }

  @Override
  public void setClob(final int parameterIndex, final Reader reader) throws SQLException {
    target.setClob(parameterIndex, reader);
  }

  @Override
  public long executeLargeUpdate(final String sql, final int autoGeneratedKeys) throws SQLException {
    return target.executeLargeUpdate(sql, autoGeneratedKeys);
  }

  @Override
  public void setBlob(final int parameterIndex, final InputStream inputStream) throws SQLException {
    target.setBlob(parameterIndex, inputStream);
  }

  @Override
  public void setNClob(final int parameterIndex, final Reader reader) throws SQLException {
    target.setNClob(parameterIndex, reader);
  }

  @Override
  public long executeLargeUpdate(final String sql, final int[] columnIndexes) throws SQLException {
    return target.executeLargeUpdate(sql, columnIndexes);
  }

  @Override
  public void setObject(final int parameterIndex, final Object x, final SQLType targetSqlType, final int scaleOrLength) throws SQLException {
    target.setObject(parameterIndex, x, targetSqlType, scaleOrLength);
  }

  @Override
  public long executeLargeUpdate(final String sql, final String[] columnNames) throws SQLException {
    return target.executeLargeUpdate(sql, columnNames);
  }

  @Override
  public void setObject(final int parameterIndex, final Object x, final SQLType targetSqlType) throws SQLException {
    target.setObject(parameterIndex, x, targetSqlType);
  }

  @Override
  public long executeLargeUpdate() throws SQLException {
    return target.executeLargeUpdate();
  }

}

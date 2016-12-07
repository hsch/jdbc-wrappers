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
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
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
import java.util.Map;

public class CallableStatementWrapper extends BasicWrapper<CallableStatement>implements CallableStatement {

  public CallableStatementWrapper(final CallableStatement target) {
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
  public void registerOutParameter(final int parameterIndex, final int sqlType) throws SQLException {
    target.registerOutParameter(parameterIndex, sqlType);
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
  public void registerOutParameter(final int parameterIndex, final int sqlType, final int scale) throws SQLException {
    target.registerOutParameter(parameterIndex, sqlType, scale);
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
  public boolean wasNull() throws SQLException {
    return target.wasNull();
  }

  @Override
  public void setShort(final int parameterIndex, final short x) throws SQLException {
    target.setShort(parameterIndex, x);
  }

  @Override
  public String getString(final int parameterIndex) throws SQLException {
    return target.getString(parameterIndex);
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
  public boolean getBoolean(final int parameterIndex) throws SQLException {
    return target.getBoolean(parameterIndex);
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
  public byte getByte(final int parameterIndex) throws SQLException {
    return target.getByte(parameterIndex);
  }

  @Override
  public void setDouble(final int parameterIndex, final double x) throws SQLException {
    target.setDouble(parameterIndex, x);
  }

  @Override
  public short getShort(final int parameterIndex) throws SQLException {
    return target.getShort(parameterIndex);
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
  public int getInt(final int parameterIndex) throws SQLException {
    return target.getInt(parameterIndex);
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
  public long getLong(final int parameterIndex) throws SQLException {
    return target.getLong(parameterIndex);
  }

  @Override
  public void setBytes(final int parameterIndex, final byte[] x) throws SQLException {
    target.setBytes(parameterIndex, x);
  }

  @Override
  public float getFloat(final int parameterIndex) throws SQLException {
    return target.getFloat(parameterIndex);
  }

  @Override
  public void cancel() throws SQLException {
    target.cancel();
  }

  @Override
  public double getDouble(final int parameterIndex) throws SQLException {
    return target.getDouble(parameterIndex);
  }

  @Override
  public void setDate(final int parameterIndex, final Date x) throws SQLException {
    target.setDate(parameterIndex, x);
  }

  @Override
  public SQLWarning getWarnings() throws SQLException {
    return target.getWarnings();
  }

  @Deprecated
  @Override
  public BigDecimal getBigDecimal(final int parameterIndex, final int scale) throws SQLException {
    return target.getBigDecimal(parameterIndex, scale);
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
  public byte[] getBytes(final int parameterIndex) throws SQLException {
    return target.getBytes(parameterIndex);
  }

  @Override
  public void setCursorName(final String name) throws SQLException {
    target.setCursorName(name);
  }

  @Override
  public void setAsciiStream(final int parameterIndex, final InputStream x, final int length) throws SQLException {
    target.setAsciiStream(parameterIndex, x, length);
  }

  @Override
  public Date getDate(final int parameterIndex) throws SQLException {
    return target.getDate(parameterIndex);
  }

  @Override
  public Time getTime(final int parameterIndex) throws SQLException {
    return target.getTime(parameterIndex);
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
  public Timestamp getTimestamp(final int parameterIndex) throws SQLException {
    return target.getTimestamp(parameterIndex);
  }

  @Override
  public Object getObject(final int parameterIndex) throws SQLException {
    return target.getObject(parameterIndex);
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
  public BigDecimal getBigDecimal(final int parameterIndex) throws SQLException {
    return target.getBigDecimal(parameterIndex);
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
  public Object getObject(final int parameterIndex, final Map<String, Class<?>> map) throws SQLException {
    return target.getObject(parameterIndex, map);
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
  public Ref getRef(final int parameterIndex) throws SQLException {
    return target.getRef(parameterIndex);
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
  public Blob getBlob(final int parameterIndex) throws SQLException {
    return target.getBlob(parameterIndex);
  }

  @Override
  public void setFetchSize(final int rows) throws SQLException {
    target.setFetchSize(rows);
  }

  @Override
  public Clob getClob(final int parameterIndex) throws SQLException {
    return target.getClob(parameterIndex);
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
  public Array getArray(final int parameterIndex) throws SQLException {
    return target.getArray(parameterIndex);
  }

  @Override
  public int getResultSetConcurrency() throws SQLException {
    return target.getResultSetConcurrency();
  }

  @Override
  public Date getDate(final int parameterIndex, final Calendar cal) throws SQLException {
    return target.getDate(parameterIndex, cal);
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
  public Time getTime(final int parameterIndex, final Calendar cal) throws SQLException {
    return target.getTime(parameterIndex, cal);
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
  public Timestamp getTimestamp(final int parameterIndex, final Calendar cal) throws SQLException {
    return target.getTimestamp(parameterIndex, cal);
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
  public void registerOutParameter(final int parameterIndex, final int sqlType, final String typeName) throws SQLException {
    target.registerOutParameter(parameterIndex, sqlType, typeName);
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
  public void registerOutParameter(final String parameterName, final int sqlType) throws SQLException {
    target.registerOutParameter(parameterName, sqlType);
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
  public void registerOutParameter(final String parameterName, final int sqlType, final int scale) throws SQLException {
    target.registerOutParameter(parameterName, sqlType, scale);
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
  public void registerOutParameter(final String parameterName, final int sqlType, final String typeName) throws SQLException {
    target.registerOutParameter(parameterName, sqlType, typeName);
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
  public URL getURL(final int parameterIndex) throws SQLException {
    return target.getURL(parameterIndex);
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
  public void setURL(final String parameterName, final URL val) throws SQLException {
    target.setURL(parameterName, val);
  }

  @Override
  public ParameterMetaData getParameterMetaData() throws SQLException {
    return target.getParameterMetaData();
  }

  @Override
  public void setNull(final String parameterName, final int sqlType) throws SQLException {
    target.setNull(parameterName, sqlType);
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
  public void setBoolean(final String parameterName, final boolean x) throws SQLException {
    target.setBoolean(parameterName, x);
  }

  @Override
  public void setNString(final int parameterIndex, final String value) throws SQLException {
    target.setNString(parameterIndex, value);
  }

  @Override
  public void setByte(final String parameterName, final byte x) throws SQLException {
    target.setByte(parameterName, x);
  }

  @Override
  public void setShort(final String parameterName, final short x) throws SQLException {
    target.setShort(parameterName, x);
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
  public void setInt(final String parameterName, final int x) throws SQLException {
    target.setInt(parameterName, x);
  }

  @Override
  public void setNClob(final int parameterIndex, final NClob value) throws SQLException {
    target.setNClob(parameterIndex, value);
  }

  @Override
  public void setLong(final String parameterName, final long x) throws SQLException {
    target.setLong(parameterName, x);
  }

  @Override
  public void setFloat(final String parameterName, final float x) throws SQLException {
    target.setFloat(parameterName, x);
  }

  @Override
  public void setClob(final int parameterIndex, final Reader reader, final long length) throws SQLException {
    target.setClob(parameterIndex, reader, length);
  }

  @Override
  public void setDouble(final String parameterName, final double x) throws SQLException {
    target.setDouble(parameterName, x);
  }

  @Override
  public boolean execute(final String sql, final int[] columnIndexes) throws SQLException {
    return target.execute(sql, columnIndexes);
  }

  @Override
  public void setBigDecimal(final String parameterName, final BigDecimal x) throws SQLException {
    target.setBigDecimal(parameterName, x);
  }

  @Override
  public void setBlob(final int parameterIndex, final InputStream inputStream, final long length) throws SQLException {
    target.setBlob(parameterIndex, inputStream, length);
  }

  @Override
  public void setString(final String parameterName, final String x) throws SQLException {
    target.setString(parameterName, x);
  }

  @Override
  public void setNClob(final int parameterIndex, final Reader reader, final long length) throws SQLException {
    target.setNClob(parameterIndex, reader, length);
  }

  @Override
  public void setBytes(final String parameterName, final byte[] x) throws SQLException {
    target.setBytes(parameterName, x);
  }

  @Override
  public void setDate(final String parameterName, final Date x) throws SQLException {
    target.setDate(parameterName, x);
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
  public void setTime(final String parameterName, final Time x) throws SQLException {
    target.setTime(parameterName, x);
  }

  @Override
  public void setTimestamp(final String parameterName, final Timestamp x) throws SQLException {
    target.setTimestamp(parameterName, x);
  }

  @Override
  public void setObject(final int parameterIndex, final Object x, final int targetSqlType, final int scaleOrLength) throws SQLException {
    target.setObject(parameterIndex, x, targetSqlType, scaleOrLength);
  }

  @Override
  public void setAsciiStream(final String parameterName, final InputStream x, final int length) throws SQLException {
    target.setAsciiStream(parameterName, x, length);
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
  public void setBinaryStream(final String parameterName, final InputStream x, final int length) throws SQLException {
    target.setBinaryStream(parameterName, x, length);
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
  public void setObject(final String parameterName, final Object x, final int targetSqlType, final int scale) throws SQLException {
    target.setObject(parameterName, x, targetSqlType, scale);
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
  public void setObject(final String parameterName, final Object x, final int targetSqlType) throws SQLException {
    target.setObject(parameterName, x, targetSqlType);
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
  public void setObject(final String parameterName, final Object x) throws SQLException {
    target.setObject(parameterName, x);
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
  public void setCharacterStream(final String parameterName, final Reader reader, final int length) throws SQLException {
    target.setCharacterStream(parameterName, reader, length);
  }

  @Override
  public void setCharacterStream(final int parameterIndex, final Reader reader) throws SQLException {
    target.setCharacterStream(parameterIndex, reader);
  }

  @Override
  public void setDate(final String parameterName, final Date x, final Calendar cal) throws SQLException {
    target.setDate(parameterName, x, cal);
  }

  @Override
  public void setNCharacterStream(final int parameterIndex, final Reader value) throws SQLException {
    target.setNCharacterStream(parameterIndex, value);
  }

  @Override
  public void setTime(final String parameterName, final Time x, final Calendar cal) throws SQLException {
    target.setTime(parameterName, x, cal);
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
  public void setTimestamp(final String parameterName, final Timestamp x, final Calendar cal) throws SQLException {
    target.setTimestamp(parameterName, x, cal);
  }

  @Override
  public long executeLargeUpdate(final String sql, final int autoGeneratedKeys) throws SQLException {
    return target.executeLargeUpdate(sql, autoGeneratedKeys);
  }

  @Override
  public void setNull(final String parameterName, final int sqlType, final String typeName) throws SQLException {
    target.setNull(parameterName, sqlType, typeName);
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
  public String getString(final String parameterName) throws SQLException {
    return target.getString(parameterName);
  }

  @Override
  public long executeLargeUpdate(final String sql, final int[] columnIndexes) throws SQLException {
    return target.executeLargeUpdate(sql, columnIndexes);
  }

  @Override
  public boolean getBoolean(final String parameterName) throws SQLException {
    return target.getBoolean(parameterName);
  }

  @Override
  public void setObject(final int parameterIndex, final Object x, final SQLType targetSqlType, final int scaleOrLength) throws SQLException {
    target.setObject(parameterIndex, x, targetSqlType, scaleOrLength);
  }

  @Override
  public byte getByte(final String parameterName) throws SQLException {
    return target.getByte(parameterName);
  }

  @Override
  public short getShort(final String parameterName) throws SQLException {
    return target.getShort(parameterName);
  }

  @Override
  public long executeLargeUpdate(final String sql, final String[] columnNames) throws SQLException {
    return target.executeLargeUpdate(sql, columnNames);
  }

  @Override
  public int getInt(final String parameterName) throws SQLException {
    return target.getInt(parameterName);
  }

  @Override
  public long getLong(final String parameterName) throws SQLException {
    return target.getLong(parameterName);
  }

  @Override
  public void setObject(final int parameterIndex, final Object x, final SQLType targetSqlType) throws SQLException {
    target.setObject(parameterIndex, x, targetSqlType);
  }

  @Override
  public float getFloat(final String parameterName) throws SQLException {
    return target.getFloat(parameterName);
  }

  @Override
  public long executeLargeUpdate() throws SQLException {
    return target.executeLargeUpdate();
  }

  @Override
  public double getDouble(final String parameterName) throws SQLException {
    return target.getDouble(parameterName);
  }

  @Override
  public byte[] getBytes(final String parameterName) throws SQLException {
    return target.getBytes(parameterName);
  }

  @Override
  public Date getDate(final String parameterName) throws SQLException {
    return target.getDate(parameterName);
  }

  @Override
  public Time getTime(final String parameterName) throws SQLException {
    return target.getTime(parameterName);
  }

  @Override
  public Timestamp getTimestamp(final String parameterName) throws SQLException {
    return target.getTimestamp(parameterName);
  }

  @Override
  public Object getObject(final String parameterName) throws SQLException {
    return target.getObject(parameterName);
  }

  @Override
  public BigDecimal getBigDecimal(final String parameterName) throws SQLException {
    return target.getBigDecimal(parameterName);
  }

  @Override
  public Object getObject(final String parameterName, final Map<String, Class<?>> map) throws SQLException {
    return target.getObject(parameterName, map);
  }

  @Override
  public Ref getRef(final String parameterName) throws SQLException {
    return target.getRef(parameterName);
  }

  @Override
  public Blob getBlob(final String parameterName) throws SQLException {
    return target.getBlob(parameterName);
  }

  @Override
  public Clob getClob(final String parameterName) throws SQLException {
    return target.getClob(parameterName);
  }

  @Override
  public Array getArray(final String parameterName) throws SQLException {
    return target.getArray(parameterName);
  }

  @Override
  public Date getDate(final String parameterName, final Calendar cal) throws SQLException {
    return target.getDate(parameterName, cal);
  }

  @Override
  public Time getTime(final String parameterName, final Calendar cal) throws SQLException {
    return target.getTime(parameterName, cal);
  }

  @Override
  public Timestamp getTimestamp(final String parameterName, final Calendar cal) throws SQLException {
    return target.getTimestamp(parameterName, cal);
  }

  @Override
  public URL getURL(final String parameterName) throws SQLException {
    return target.getURL(parameterName);
  }

  @Override
  public RowId getRowId(final int parameterIndex) throws SQLException {
    return target.getRowId(parameterIndex);
  }

  @Override
  public RowId getRowId(final String parameterName) throws SQLException {
    return target.getRowId(parameterName);
  }

  @Override
  public void setRowId(final String parameterName, final RowId x) throws SQLException {
    target.setRowId(parameterName, x);
  }

  @Override
  public void setNString(final String parameterName, final String value) throws SQLException {
    target.setNString(parameterName, value);
  }

  @Override
  public void setNCharacterStream(final String parameterName, final Reader value, final long length) throws SQLException {
    target.setNCharacterStream(parameterName, value, length);
  }

  @Override
  public void setNClob(final String parameterName, final NClob value) throws SQLException {
    target.setNClob(parameterName, value);
  }

  @Override
  public void setClob(final String parameterName, final Reader reader, final long length) throws SQLException {
    target.setClob(parameterName, reader, length);
  }

  @Override
  public void setBlob(final String parameterName, final InputStream inputStream, final long length) throws SQLException {
    target.setBlob(parameterName, inputStream, length);
  }

  @Override
  public void setNClob(final String parameterName, final Reader reader, final long length) throws SQLException {
    target.setNClob(parameterName, reader, length);
  }

  @Override
  public NClob getNClob(final int parameterIndex) throws SQLException {
    return target.getNClob(parameterIndex);
  }

  @Override
  public NClob getNClob(final String parameterName) throws SQLException {
    return target.getNClob(parameterName);
  }

  @Override
  public void setSQLXML(final String parameterName, final SQLXML xmlObject) throws SQLException {
    target.setSQLXML(parameterName, xmlObject);
  }

  @Override
  public SQLXML getSQLXML(final int parameterIndex) throws SQLException {
    return target.getSQLXML(parameterIndex);
  }

  @Override
  public SQLXML getSQLXML(final String parameterName) throws SQLException {
    return target.getSQLXML(parameterName);
  }

  @Override
  public String getNString(final int parameterIndex) throws SQLException {
    return target.getNString(parameterIndex);
  }

  @Override
  public String getNString(final String parameterName) throws SQLException {
    return target.getNString(parameterName);
  }

  @Override
  public Reader getNCharacterStream(final int parameterIndex) throws SQLException {
    return target.getNCharacterStream(parameterIndex);
  }

  @Override
  public Reader getNCharacterStream(final String parameterName) throws SQLException {
    return target.getNCharacterStream(parameterName);
  }

  @Override
  public Reader getCharacterStream(final int parameterIndex) throws SQLException {
    return target.getCharacterStream(parameterIndex);
  }

  @Override
  public Reader getCharacterStream(final String parameterName) throws SQLException {
    return target.getCharacterStream(parameterName);
  }

  @Override
  public void setBlob(final String parameterName, final Blob x) throws SQLException {
    target.setBlob(parameterName, x);
  }

  @Override
  public void setClob(final String parameterName, final Clob x) throws SQLException {
    target.setClob(parameterName, x);
  }

  @Override
  public void setAsciiStream(final String parameterName, final InputStream x, final long length) throws SQLException {
    target.setAsciiStream(parameterName, x, length);
  }

  @Override
  public void setBinaryStream(final String parameterName, final InputStream x, final long length) throws SQLException {
    target.setBinaryStream(parameterName, x, length);
  }

  @Override
  public void setCharacterStream(final String parameterName, final Reader reader, final long length) throws SQLException {
    target.setCharacterStream(parameterName, reader, length);
  }

  @Override
  public void setAsciiStream(final String parameterName, final InputStream x) throws SQLException {
    target.setAsciiStream(parameterName, x);
  }

  @Override
  public void setBinaryStream(final String parameterName, final InputStream x) throws SQLException {
    target.setBinaryStream(parameterName, x);
  }

  @Override
  public void setCharacterStream(final String parameterName, final Reader reader) throws SQLException {
    target.setCharacterStream(parameterName, reader);
  }

  @Override
  public void setNCharacterStream(final String parameterName, final Reader value) throws SQLException {
    target.setNCharacterStream(parameterName, value);
  }

  @Override
  public void setClob(final String parameterName, final Reader reader) throws SQLException {
    target.setClob(parameterName, reader);
  }

  @Override
  public void setBlob(final String parameterName, final InputStream inputStream) throws SQLException {
    target.setBlob(parameterName, inputStream);
  }

  @Override
  public void setNClob(final String parameterName, final Reader reader) throws SQLException {
    target.setNClob(parameterName, reader);
  }

  @Override
  public <T> T getObject(final int parameterIndex, final Class<T> type) throws SQLException {
    return target.getObject(parameterIndex, type);
  }

  @Override
  public <T> T getObject(final String parameterName, final Class<T> type) throws SQLException {
    return target.getObject(parameterName, type);
  }

  @Override
  public void setObject(final String parameterName, final Object x, final SQLType targetSqlType, final int scaleOrLength) throws SQLException {
    target.setObject(parameterName, x, targetSqlType, scaleOrLength);
  }

  @Override
  public void setObject(final String parameterName, final Object x, final SQLType targetSqlType) throws SQLException {
    target.setObject(parameterName, x, targetSqlType);
  }

  @Override
  public void registerOutParameter(final int parameterIndex, final SQLType sqlType) throws SQLException {
    target.registerOutParameter(parameterIndex, sqlType);
  }

  @Override
  public void registerOutParameter(final int parameterIndex, final SQLType sqlType, final int scale) throws SQLException {
    target.registerOutParameter(parameterIndex, sqlType, scale);
  }

  @Override
  public void registerOutParameter(final int parameterIndex, final SQLType sqlType, final String typeName) throws SQLException {
    target.registerOutParameter(parameterIndex, sqlType, typeName);
  }

  @Override
  public void registerOutParameter(final String parameterName, final SQLType sqlType) throws SQLException {
    target.registerOutParameter(parameterName, sqlType);
  }

  @Override
  public void registerOutParameter(final String parameterName, final SQLType sqlType, final int scale) throws SQLException {
    target.registerOutParameter(parameterName, sqlType, scale);
  }

  @Override
  public void registerOutParameter(final String parameterName, final SQLType sqlType, final String typeName) throws SQLException {
    target.registerOutParameter(parameterName, sqlType, typeName);
  }

}

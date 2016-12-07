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

package io.trbl.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Map;

public class ResultSetWrapper extends BasicWrapper<ResultSet>implements ResultSet {

  public ResultSetWrapper(final ResultSet target) {
    super(target);
  }

  @Override
  public boolean next() throws SQLException {
    return target.next();
  }

  @Override
  public void close() throws SQLException {
    target.close();
  }

  @Override
  public boolean wasNull() throws SQLException {
    return target.wasNull();
  }

  @Override
  public String getString(final int columnIndex) throws SQLException {
    return target.getString(columnIndex);
  }

  @Override
  public boolean getBoolean(final int columnIndex) throws SQLException {
    return target.getBoolean(columnIndex);
  }

  @Override
  public byte getByte(final int columnIndex) throws SQLException {
    return target.getByte(columnIndex);
  }

  @Override
  public short getShort(final int columnIndex) throws SQLException {
    return target.getShort(columnIndex);
  }

  @Override
  public int getInt(final int columnIndex) throws SQLException {
    return target.getInt(columnIndex);
  }

  @Override
  public long getLong(final int columnIndex) throws SQLException {
    return target.getLong(columnIndex);
  }

  @Override
  public float getFloat(final int columnIndex) throws SQLException {
    return target.getFloat(columnIndex);
  }

  @Override
  public double getDouble(final int columnIndex) throws SQLException {
    return target.getDouble(columnIndex);
  }

  @Deprecated
  @Override
  public BigDecimal getBigDecimal(final int columnIndex, final int scale) throws SQLException {
    return target.getBigDecimal(columnIndex, scale);
  }

  @Override
  public byte[] getBytes(final int columnIndex) throws SQLException {
    return target.getBytes(columnIndex);
  }

  @Override
  public Date getDate(final int columnIndex) throws SQLException {
    return target.getDate(columnIndex);
  }

  @Override
  public Time getTime(final int columnIndex) throws SQLException {
    return target.getTime(columnIndex);
  }

  @Override
  public Timestamp getTimestamp(final int columnIndex) throws SQLException {
    return target.getTimestamp(columnIndex);
  }

  @Override
  public InputStream getAsciiStream(final int columnIndex) throws SQLException {
    return target.getAsciiStream(columnIndex);
  }

  @Deprecated
  @Override
  public InputStream getUnicodeStream(final int columnIndex) throws SQLException {
    return target.getUnicodeStream(columnIndex);
  }

  @Override
  public InputStream getBinaryStream(final int columnIndex) throws SQLException {
    return target.getBinaryStream(columnIndex);
  }

  @Override
  public String getString(final String columnLabel) throws SQLException {
    return target.getString(columnLabel);
  }

  @Override
  public boolean getBoolean(final String columnLabel) throws SQLException {
    return target.getBoolean(columnLabel);
  }

  @Override
  public byte getByte(final String columnLabel) throws SQLException {
    return target.getByte(columnLabel);
  }

  @Override
  public short getShort(final String columnLabel) throws SQLException {
    return target.getShort(columnLabel);
  }

  @Override
  public int getInt(final String columnLabel) throws SQLException {
    return target.getInt(columnLabel);
  }

  @Override
  public long getLong(final String columnLabel) throws SQLException {
    return target.getLong(columnLabel);
  }

  @Override
  public float getFloat(final String columnLabel) throws SQLException {
    return target.getFloat(columnLabel);
  }

  @Override
  public double getDouble(final String columnLabel) throws SQLException {
    return target.getDouble(columnLabel);
  }

  @Deprecated
  @Override
  public BigDecimal getBigDecimal(final String columnLabel, final int scale) throws SQLException {
    return target.getBigDecimal(columnLabel, scale);
  }

  @Override
  public byte[] getBytes(final String columnLabel) throws SQLException {
    return target.getBytes(columnLabel);
  }

  @Override
  public Date getDate(final String columnLabel) throws SQLException {
    return target.getDate(columnLabel);
  }

  @Override
  public Time getTime(final String columnLabel) throws SQLException {
    return target.getTime(columnLabel);
  }

  @Override
  public Timestamp getTimestamp(final String columnLabel) throws SQLException {
    return target.getTimestamp(columnLabel);
  }

  @Override
  public InputStream getAsciiStream(final String columnLabel) throws SQLException {
    return target.getAsciiStream(columnLabel);
  }

  @Deprecated
  @Override
  public InputStream getUnicodeStream(final String columnLabel) throws SQLException {
    return target.getUnicodeStream(columnLabel);
  }

  @Override
  public InputStream getBinaryStream(final String columnLabel) throws SQLException {
    return target.getBinaryStream(columnLabel);
  }

  @Override
  public SQLWarning getWarnings() throws SQLException {
    return target.getWarnings();
  }

  @Override
  public void clearWarnings() throws SQLException {
    target.clearWarnings();
  }

  @Override
  public String getCursorName() throws SQLException {
    return target.getCursorName();
  }

  @Override
  public ResultSetMetaData getMetaData() throws SQLException {
    return target.getMetaData();
  }

  @Override
  public Object getObject(final int columnIndex) throws SQLException {
    return target.getObject(columnIndex);
  }

  @Override
  public Object getObject(final String columnLabel) throws SQLException {
    return target.getObject(columnLabel);
  }

  @Override
  public int findColumn(final String columnLabel) throws SQLException {
    return target.findColumn(columnLabel);
  }

  @Override
  public Reader getCharacterStream(final int columnIndex) throws SQLException {
    return target.getCharacterStream(columnIndex);
  }

  @Override
  public Reader getCharacterStream(final String columnLabel) throws SQLException {
    return target.getCharacterStream(columnLabel);
  }

  @Override
  public BigDecimal getBigDecimal(final int columnIndex) throws SQLException {
    return target.getBigDecimal(columnIndex);
  }

  @Override
  public BigDecimal getBigDecimal(final String columnLabel) throws SQLException {
    return target.getBigDecimal(columnLabel);
  }

  @Override
  public boolean isBeforeFirst() throws SQLException {
    return target.isBeforeFirst();
  }

  @Override
  public boolean isAfterLast() throws SQLException {
    return target.isAfterLast();
  }

  @Override
  public boolean isFirst() throws SQLException {
    return target.isFirst();
  }

  @Override
  public boolean isLast() throws SQLException {
    return target.isLast();
  }

  @Override
  public void beforeFirst() throws SQLException {
    target.beforeFirst();
  }

  @Override
  public void afterLast() throws SQLException {
    target.afterLast();
  }

  @Override
  public boolean first() throws SQLException {
    return target.first();
  }

  @Override
  public boolean last() throws SQLException {
    return target.last();
  }

  @Override
  public int getRow() throws SQLException {
    return target.getRow();
  }

  @Override
  public boolean absolute(final int row) throws SQLException {
    return target.absolute(row);
  }

  @Override
  public boolean relative(final int rows) throws SQLException {
    return target.relative(rows);
  }

  @Override
  public boolean previous() throws SQLException {
    return target.previous();
  }

  @Override
  public void setFetchDirection(final int direction) throws SQLException {
    target.setFetchDirection(direction);
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
  public int getType() throws SQLException {
    return target.getType();
  }

  @Override
  public int getConcurrency() throws SQLException {
    return target.getConcurrency();
  }

  @Override
  public boolean rowUpdated() throws SQLException {
    return target.rowUpdated();
  }

  @Override
  public boolean rowInserted() throws SQLException {
    return target.rowInserted();
  }

  @Override
  public boolean rowDeleted() throws SQLException {
    return target.rowDeleted();
  }

  @Override
  public void updateNull(final int columnIndex) throws SQLException {
    target.updateNull(columnIndex);
  }

  @Override
  public void updateBoolean(final int columnIndex, final boolean x) throws SQLException {
    target.updateBoolean(columnIndex, x);
  }

  @Override
  public void updateByte(final int columnIndex, final byte x) throws SQLException {
    target.updateByte(columnIndex, x);
  }

  @Override
  public void updateShort(final int columnIndex, final short x) throws SQLException {
    target.updateShort(columnIndex, x);
  }

  @Override
  public void updateInt(final int columnIndex, final int x) throws SQLException {
    target.updateInt(columnIndex, x);
  }

  @Override
  public void updateLong(final int columnIndex, final long x) throws SQLException {
    target.updateLong(columnIndex, x);
  }

  @Override
  public void updateFloat(final int columnIndex, final float x) throws SQLException {
    target.updateFloat(columnIndex, x);
  }

  @Override
  public void updateDouble(final int columnIndex, final double x) throws SQLException {
    target.updateDouble(columnIndex, x);
  }

  @Override
  public void updateBigDecimal(final int columnIndex, final BigDecimal x) throws SQLException {
    target.updateBigDecimal(columnIndex, x);
  }

  @Override
  public void updateString(final int columnIndex, final String x) throws SQLException {
    target.updateString(columnIndex, x);
  }

  @Override
  public void updateBytes(final int columnIndex, final byte[] x) throws SQLException {
    target.updateBytes(columnIndex, x);
  }

  @Override
  public void updateDate(final int columnIndex, final Date x) throws SQLException {
    target.updateDate(columnIndex, x);
  }

  @Override
  public void updateTime(final int columnIndex, final Time x) throws SQLException {
    target.updateTime(columnIndex, x);
  }

  @Override
  public void updateTimestamp(final int columnIndex, final Timestamp x) throws SQLException {
    target.updateTimestamp(columnIndex, x);
  }

  @Override
  public void updateAsciiStream(final int columnIndex, final InputStream x, final int length) throws SQLException {
    target.updateAsciiStream(columnIndex, x, length);
  }

  @Override
  public void updateBinaryStream(final int columnIndex, final InputStream x, final int length) throws SQLException {
    target.updateBinaryStream(columnIndex, x, length);
  }

  @Override
  public void updateCharacterStream(final int columnIndex, final Reader x, final int length) throws SQLException {
    target.updateCharacterStream(columnIndex, x, length);
  }

  @Override
  public void updateObject(final int columnIndex, final Object x, final int scaleOrLength) throws SQLException {
    target.updateObject(columnIndex, x, scaleOrLength);
  }

  @Override
  public void updateObject(final int columnIndex, final Object x) throws SQLException {
    target.updateObject(columnIndex, x);
  }

  @Override
  public void updateNull(final String columnLabel) throws SQLException {
    target.updateNull(columnLabel);
  }

  @Override
  public void updateBoolean(final String columnLabel, final boolean x) throws SQLException {
    target.updateBoolean(columnLabel, x);
  }

  @Override
  public void updateByte(final String columnLabel, final byte x) throws SQLException {
    target.updateByte(columnLabel, x);
  }

  @Override
  public void updateShort(final String columnLabel, final short x) throws SQLException {
    target.updateShort(columnLabel, x);
  }

  @Override
  public void updateInt(final String columnLabel, final int x) throws SQLException {
    target.updateInt(columnLabel, x);
  }

  @Override
  public void updateLong(final String columnLabel, final long x) throws SQLException {
    target.updateLong(columnLabel, x);
  }

  @Override
  public void updateFloat(final String columnLabel, final float x) throws SQLException {
    target.updateFloat(columnLabel, x);
  }

  @Override
  public void updateDouble(final String columnLabel, final double x) throws SQLException {
    target.updateDouble(columnLabel, x);
  }

  @Override
  public void updateBigDecimal(final String columnLabel, final BigDecimal x) throws SQLException {
    target.updateBigDecimal(columnLabel, x);
  }

  @Override
  public void updateString(final String columnLabel, final String x) throws SQLException {
    target.updateString(columnLabel, x);
  }

  @Override
  public void updateBytes(final String columnLabel, final byte[] x) throws SQLException {
    target.updateBytes(columnLabel, x);
  }

  @Override
  public void updateDate(final String columnLabel, final Date x) throws SQLException {
    target.updateDate(columnLabel, x);
  }

  @Override
  public void updateTime(final String columnLabel, final Time x) throws SQLException {
    target.updateTime(columnLabel, x);
  }

  @Override
  public void updateTimestamp(final String columnLabel, final Timestamp x) throws SQLException {
    target.updateTimestamp(columnLabel, x);
  }

  @Override
  public void updateAsciiStream(final String columnLabel, final InputStream x, final int length) throws SQLException {
    target.updateAsciiStream(columnLabel, x, length);
  }

  @Override
  public void updateBinaryStream(final String columnLabel, final InputStream x, final int length) throws SQLException {
    target.updateBinaryStream(columnLabel, x, length);
  }

  @Override
  public void updateCharacterStream(final String columnLabel, final Reader reader, final int length) throws SQLException {
    target.updateCharacterStream(columnLabel, reader, length);
  }

  @Override
  public void updateObject(final String columnLabel, final Object x, final int scaleOrLength) throws SQLException {
    target.updateObject(columnLabel, x, scaleOrLength);
  }

  @Override
  public void updateObject(final String columnLabel, final Object x) throws SQLException {
    target.updateObject(columnLabel, x);
  }

  @Override
  public void insertRow() throws SQLException {
    target.insertRow();
  }

  @Override
  public void updateRow() throws SQLException {
    target.updateRow();
  }

  @Override
  public void deleteRow() throws SQLException {
    target.deleteRow();
  }

  @Override
  public void refreshRow() throws SQLException {
    target.refreshRow();
  }

  @Override
  public void cancelRowUpdates() throws SQLException {
    target.cancelRowUpdates();
  }

  @Override
  public void moveToInsertRow() throws SQLException {
    target.moveToInsertRow();
  }

  @Override
  public void moveToCurrentRow() throws SQLException {
    target.moveToCurrentRow();
  }

  @Override
  public Statement getStatement() throws SQLException {
    return target.getStatement();
  }

  @Override
  public Object getObject(final int columnIndex, final Map<String, Class<?>> map) throws SQLException {
    return target.getObject(columnIndex, map);
  }

  @Override
  public Ref getRef(final int columnIndex) throws SQLException {
    return target.getRef(columnIndex);
  }

  @Override
  public Blob getBlob(final int columnIndex) throws SQLException {
    return target.getBlob(columnIndex);
  }

  @Override
  public Clob getClob(final int columnIndex) throws SQLException {
    return target.getClob(columnIndex);
  }

  @Override
  public Array getArray(final int columnIndex) throws SQLException {
    return target.getArray(columnIndex);
  }

  @Override
  public Object getObject(final String columnLabel, final Map<String, Class<?>> map) throws SQLException {
    return target.getObject(columnLabel, map);
  }

  @Override
  public Ref getRef(final String columnLabel) throws SQLException {
    return target.getRef(columnLabel);
  }

  @Override
  public Blob getBlob(final String columnLabel) throws SQLException {
    return target.getBlob(columnLabel);
  }

  @Override
  public Clob getClob(final String columnLabel) throws SQLException {
    return target.getClob(columnLabel);
  }

  @Override
  public Array getArray(final String columnLabel) throws SQLException {
    return target.getArray(columnLabel);
  }

  @Override
  public Date getDate(final int columnIndex, final Calendar cal) throws SQLException {
    return target.getDate(columnIndex, cal);
  }

  @Override
  public Date getDate(final String columnLabel, final Calendar cal) throws SQLException {
    return target.getDate(columnLabel, cal);
  }

  @Override
  public Time getTime(final int columnIndex, final Calendar cal) throws SQLException {
    return target.getTime(columnIndex, cal);
  }

  @Override
  public Time getTime(final String columnLabel, final Calendar cal) throws SQLException {
    return target.getTime(columnLabel, cal);
  }

  @Override
  public Timestamp getTimestamp(final int columnIndex, final Calendar cal) throws SQLException {
    return target.getTimestamp(columnIndex, cal);
  }

  @Override
  public Timestamp getTimestamp(final String columnLabel, final Calendar cal) throws SQLException {
    return target.getTimestamp(columnLabel, cal);
  }

  @Override
  public URL getURL(final int columnIndex) throws SQLException {
    return target.getURL(columnIndex);
  }

  @Override
  public URL getURL(final String columnLabel) throws SQLException {
    return target.getURL(columnLabel);
  }

  @Override
  public void updateRef(final int columnIndex, final Ref x) throws SQLException {
    target.updateRef(columnIndex, x);
  }

  @Override
  public void updateRef(final String columnLabel, final Ref x) throws SQLException {
    target.updateRef(columnLabel, x);
  }

  @Override
  public void updateBlob(final int columnIndex, final Blob x) throws SQLException {
    target.updateBlob(columnIndex, x);
  }

  @Override
  public void updateBlob(final String columnLabel, final Blob x) throws SQLException {
    target.updateBlob(columnLabel, x);
  }

  @Override
  public void updateClob(final int columnIndex, final Clob x) throws SQLException {
    target.updateClob(columnIndex, x);
  }

  @Override
  public void updateClob(final String columnLabel, final Clob x) throws SQLException {
    target.updateClob(columnLabel, x);
  }

  @Override
  public void updateArray(final int columnIndex, final Array x) throws SQLException {
    target.updateArray(columnIndex, x);
  }

  @Override
  public void updateArray(final String columnLabel, final Array x) throws SQLException {
    target.updateArray(columnLabel, x);
  }

  @Override
  public RowId getRowId(final int columnIndex) throws SQLException {
    return target.getRowId(columnIndex);
  }

  @Override
  public RowId getRowId(final String columnLabel) throws SQLException {
    return target.getRowId(columnLabel);
  }

  @Override
  public void updateRowId(final int columnIndex, final RowId x) throws SQLException {
    target.updateRowId(columnIndex, x);
  }

  @Override
  public void updateRowId(final String columnLabel, final RowId x) throws SQLException {
    target.updateRowId(columnLabel, x);
  }

  @Override
  public int getHoldability() throws SQLException {
    return target.getHoldability();
  }

  @Override
  public boolean isClosed() throws SQLException {
    return target.isClosed();
  }

  @Override
  public void updateNString(final int columnIndex, final String nString) throws SQLException {
    target.updateNString(columnIndex, nString);
  }

  @Override
  public void updateNString(final String columnLabel, final String nString) throws SQLException {
    target.updateNString(columnLabel, nString);
  }

  @Override
  public void updateNClob(final int columnIndex, final NClob nClob) throws SQLException {
    target.updateNClob(columnIndex, nClob);
  }

  @Override
  public void updateNClob(final String columnLabel, final NClob nClob) throws SQLException {
    target.updateNClob(columnLabel, nClob);
  }

  @Override
  public NClob getNClob(final int columnIndex) throws SQLException {
    return target.getNClob(columnIndex);
  }

  @Override
  public NClob getNClob(final String columnLabel) throws SQLException {
    return target.getNClob(columnLabel);
  }

  @Override
  public SQLXML getSQLXML(final int columnIndex) throws SQLException {
    return target.getSQLXML(columnIndex);
  }

  @Override
  public SQLXML getSQLXML(final String columnLabel) throws SQLException {
    return target.getSQLXML(columnLabel);
  }

  @Override
  public void updateSQLXML(final int columnIndex, final SQLXML xmlObject) throws SQLException {
    target.updateSQLXML(columnIndex, xmlObject);
  }

  @Override
  public void updateSQLXML(final String columnLabel, final SQLXML xmlObject) throws SQLException {
    target.updateSQLXML(columnLabel, xmlObject);
  }

  @Override
  public String getNString(final int columnIndex) throws SQLException {
    return target.getNString(columnIndex);
  }

  @Override
  public String getNString(final String columnLabel) throws SQLException {
    return target.getNString(columnLabel);
  }

  @Override
  public Reader getNCharacterStream(final int columnIndex) throws SQLException {
    return target.getNCharacterStream(columnIndex);
  }

  @Override
  public Reader getNCharacterStream(final String columnLabel) throws SQLException {
    return target.getNCharacterStream(columnLabel);
  }

  @Override
  public void updateNCharacterStream(final int columnIndex, final Reader x, final long length) throws SQLException {
    target.updateNCharacterStream(columnIndex, x, length);
  }

  @Override
  public void updateNCharacterStream(final String columnLabel, final Reader reader, final long length) throws SQLException {
    target.updateNCharacterStream(columnLabel, reader, length);
  }

  @Override
  public void updateAsciiStream(final int columnIndex, final InputStream x, final long length) throws SQLException {
    target.updateAsciiStream(columnIndex, x, length);
  }

  @Override
  public void updateBinaryStream(final int columnIndex, final InputStream x, final long length) throws SQLException {
    target.updateBinaryStream(columnIndex, x, length);
  }

  @Override
  public void updateCharacterStream(final int columnIndex, final Reader x, final long length) throws SQLException {
    target.updateCharacterStream(columnIndex, x, length);
  }

  @Override
  public void updateAsciiStream(final String columnLabel, final InputStream x, final long length) throws SQLException {
    target.updateAsciiStream(columnLabel, x, length);
  }

  @Override
  public void updateBinaryStream(final String columnLabel, final InputStream x, final long length) throws SQLException {
    target.updateBinaryStream(columnLabel, x, length);
  }

  @Override
  public void updateCharacterStream(final String columnLabel, final Reader reader, final long length) throws SQLException {
    target.updateCharacterStream(columnLabel, reader, length);
  }

  @Override
  public void updateBlob(final int columnIndex, final InputStream inputStream, final long length) throws SQLException {
    target.updateBlob(columnIndex, inputStream, length);
  }

  @Override
  public void updateBlob(final String columnLabel, final InputStream inputStream, final long length) throws SQLException {
    target.updateBlob(columnLabel, inputStream, length);
  }

  @Override
  public void updateClob(final int columnIndex, final Reader reader, final long length) throws SQLException {
    target.updateClob(columnIndex, reader, length);
  }

  @Override
  public void updateClob(final String columnLabel, final Reader reader, final long length) throws SQLException {
    target.updateClob(columnLabel, reader, length);
  }

  @Override
  public void updateNClob(final int columnIndex, final Reader reader, final long length) throws SQLException {
    target.updateNClob(columnIndex, reader, length);
  }

  @Override
  public void updateNClob(final String columnLabel, final Reader reader, final long length) throws SQLException {
    target.updateNClob(columnLabel, reader, length);
  }

  @Override
  public void updateNCharacterStream(final int columnIndex, final Reader x) throws SQLException {
    target.updateNCharacterStream(columnIndex, x);
  }

  @Override
  public void updateNCharacterStream(final String columnLabel, final Reader reader) throws SQLException {
    target.updateNCharacterStream(columnLabel, reader);
  }

  @Override
  public void updateAsciiStream(final int columnIndex, final InputStream x) throws SQLException {
    target.updateAsciiStream(columnIndex, x);
  }

  @Override
  public void updateBinaryStream(final int columnIndex, final InputStream x) throws SQLException {
    target.updateBinaryStream(columnIndex, x);
  }

  @Override
  public void updateCharacterStream(final int columnIndex, final Reader x) throws SQLException {
    target.updateCharacterStream(columnIndex, x);
  }

  @Override
  public void updateAsciiStream(final String columnLabel, final InputStream x) throws SQLException {
    target.updateAsciiStream(columnLabel, x);
  }

  @Override
  public void updateBinaryStream(final String columnLabel, final InputStream x) throws SQLException {
    target.updateBinaryStream(columnLabel, x);
  }

  @Override
  public void updateCharacterStream(final String columnLabel, final Reader reader) throws SQLException {
    target.updateCharacterStream(columnLabel, reader);
  }

  @Override
  public void updateBlob(final int columnIndex, final InputStream inputStream) throws SQLException {
    target.updateBlob(columnIndex, inputStream);
  }

  @Override
  public void updateBlob(final String columnLabel, final InputStream inputStream) throws SQLException {
    target.updateBlob(columnLabel, inputStream);
  }

  @Override
  public void updateClob(final int columnIndex, final Reader reader) throws SQLException {
    target.updateClob(columnIndex, reader);
  }

  @Override
  public void updateClob(final String columnLabel, final Reader reader) throws SQLException {
    target.updateClob(columnLabel, reader);
  }

  @Override
  public void updateNClob(final int columnIndex, final Reader reader) throws SQLException {
    target.updateNClob(columnIndex, reader);
  }

  @Override
  public void updateNClob(final String columnLabel, final Reader reader) throws SQLException {
    target.updateNClob(columnLabel, reader);
  }

  @Override
  public <T> T getObject(final int columnIndex, final Class<T> type) throws SQLException {
    return target.getObject(columnIndex, type);
  }

  @Override
  public <T> T getObject(final String columnLabel, final Class<T> type) throws SQLException {
    return target.getObject(columnLabel, type);
  }

  @Override
  public void updateObject(final int columnIndex, final Object x, final SQLType targetSqlType, final int scaleOrLength) throws SQLException {
    target.updateObject(columnIndex, x, targetSqlType, scaleOrLength);
  }

  @Override
  public void updateObject(final String columnLabel, final Object x, final SQLType targetSqlType, final int scaleOrLength) throws SQLException {
    target.updateObject(columnLabel, x, targetSqlType, scaleOrLength);
  }

  @Override
  public void updateObject(final int columnIndex, final Object x, final SQLType targetSqlType) throws SQLException {
    target.updateObject(columnIndex, x, targetSqlType);
  }

  @Override
  public void updateObject(final String columnLabel, final Object x, final SQLType targetSqlType) throws SQLException {
    target.updateObject(columnLabel, x, targetSqlType);
  }

}

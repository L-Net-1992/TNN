// automatically generated by the FlatBuffers compiler, do not modify

package NamespaceA;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class SecondTableInA extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static SecondTableInA getRootAsSecondTableInA(ByteBuffer _bb) { return getRootAsSecondTableInA(_bb, new SecondTableInA()); }
  public static SecondTableInA getRootAsSecondTableInA(ByteBuffer _bb, SecondTableInA obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public SecondTableInA __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public NamespaceC.TableInC referToC() { return referToC(new NamespaceC.TableInC()); }
  public NamespaceC.TableInC referToC(NamespaceC.TableInC obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createSecondTableInA(FlatBufferBuilder builder,
      int refer_to_cOffset) {
    builder.startTable(1);
    SecondTableInA.addReferToC(builder, refer_to_cOffset);
    return SecondTableInA.endSecondTableInA(builder);
  }

  public static void startSecondTableInA(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addReferToC(FlatBufferBuilder builder, int referToCOffset) { builder.addOffset(0, referToCOffset, 0); }
  public static int endSecondTableInA(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public SecondTableInA get(int j) { return get(new SecondTableInA(), j); }
    public SecondTableInA get(SecondTableInA obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}


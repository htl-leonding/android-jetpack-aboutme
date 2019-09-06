package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new at.htl.myapplication.DataBinderMapperImpl());
  }
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CalculateArea.proto

package com.example.server.area;

public interface AreaRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.server.area.AreaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>double length = 1;</code>
   */
  double getLength();

  /**
   * <code>double width = 2;</code>
   */
  double getWidth();

  /**
   * <code>double radius = 3;</code>
   */
  double getRadius();

  /**
   * <code>.com.example.server.area.AreaFor areafor = 4;</code>
   */
  int getAreaforValue();
  /**
   * <code>.com.example.server.area.AreaFor areafor = 4;</code>
   */
  com.example.server.area.AreaFor getAreafor();
}

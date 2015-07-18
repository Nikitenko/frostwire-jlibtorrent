/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public enum errc_t {
  success(libtorrent_jni.success_get()),
  address_family_not_supported(libtorrent_jni.address_family_not_supported_get()),
  address_in_use(libtorrent_jni.address_in_use_get()),
  address_not_available(libtorrent_jni.address_not_available_get()),
  already_connected(libtorrent_jni.already_connected_get()),
  argument_list_too_long(libtorrent_jni.argument_list_too_long_get()),
  argument_out_of_domain(libtorrent_jni.argument_out_of_domain_get()),
  bad_address(libtorrent_jni.bad_address_get()),
  bad_file_descriptor(libtorrent_jni.bad_file_descriptor_get()),
  bad_message(libtorrent_jni.bad_message_get()),
  broken_pipe(libtorrent_jni.broken_pipe_get()),
  connection_aborted(libtorrent_jni.connection_aborted_get()),
  connection_already_in_progress(libtorrent_jni.connection_already_in_progress_get()),
  connection_refused(libtorrent_jni.connection_refused_get()),
  connection_reset(libtorrent_jni.connection_reset_get()),
  cross_device_link(libtorrent_jni.cross_device_link_get()),
  destination_address_required(libtorrent_jni.destination_address_required_get()),
  device_or_resource_busy(libtorrent_jni.device_or_resource_busy_get()),
  directory_not_empty(libtorrent_jni.directory_not_empty_get()),
  executable_format_error(libtorrent_jni.executable_format_error_get()),
  file_exists(libtorrent_jni.file_exists_get()),
  file_too_large(libtorrent_jni.file_too_large_get()),
  filename_too_long(libtorrent_jni.filename_too_long_get()),
  function_not_supported(libtorrent_jni.function_not_supported_get()),
  host_unreachable(libtorrent_jni.host_unreachable_get()),
  identifier_removed(libtorrent_jni.identifier_removed_get()),
  illegal_byte_sequence(libtorrent_jni.illegal_byte_sequence_get()),
  inappropriate_io_control_operation(libtorrent_jni.inappropriate_io_control_operation_get()),
  interrupted(libtorrent_jni.interrupted_get()),
  invalid_argument(libtorrent_jni.invalid_argument_get()),
  invalid_seek(libtorrent_jni.invalid_seek_get()),
  io_error(libtorrent_jni.io_error_get()),
  is_a_directory(libtorrent_jni.is_a_directory_get()),
  message_size(libtorrent_jni.message_size_get()),
  network_down(libtorrent_jni.network_down_get()),
  network_reset(libtorrent_jni.network_reset_get()),
  network_unreachable(libtorrent_jni.network_unreachable_get()),
  no_buffer_space(libtorrent_jni.no_buffer_space_get()),
  no_child_process(libtorrent_jni.no_child_process_get()),
  no_link(libtorrent_jni.no_link_get()),
  no_lock_available(libtorrent_jni.no_lock_available_get()),
  no_message_available(libtorrent_jni.no_message_available_get()),
  no_message(libtorrent_jni.no_message_get()),
  no_protocol_option(libtorrent_jni.no_protocol_option_get()),
  no_space_on_device(libtorrent_jni.no_space_on_device_get()),
  no_stream_resources(libtorrent_jni.no_stream_resources_get()),
  no_such_device_or_address(libtorrent_jni.no_such_device_or_address_get()),
  no_such_device(libtorrent_jni.no_such_device_get()),
  no_such_file_or_directory(libtorrent_jni.no_such_file_or_directory_get()),
  no_such_process(libtorrent_jni.no_such_process_get()),
  not_a_directory(libtorrent_jni.not_a_directory_get()),
  not_a_socket(libtorrent_jni.not_a_socket_get()),
  not_a_stream(libtorrent_jni.not_a_stream_get()),
  not_connected(libtorrent_jni.not_connected_get()),
  not_enough_memory(libtorrent_jni.not_enough_memory_get()),
  not_supported(libtorrent_jni.not_supported_get()),
  operation_canceled(libtorrent_jni.operation_canceled_get()),
  operation_in_progress(libtorrent_jni.operation_in_progress_get()),
  operation_not_permitted(libtorrent_jni.operation_not_permitted_get()),
  operation_not_supported(libtorrent_jni.operation_not_supported_get()),
  operation_would_block(libtorrent_jni.operation_would_block_get()),
  owner_dead(libtorrent_jni.owner_dead_get()),
  permission_denied(libtorrent_jni.permission_denied_get()),
  protocol_error(libtorrent_jni.protocol_error_get()),
  protocol_not_supported(libtorrent_jni.protocol_not_supported_get()),
  read_only_file_system(libtorrent_jni.read_only_file_system_get()),
  resource_deadlock_would_occur(libtorrent_jni.resource_deadlock_would_occur_get()),
  resource_unavailable_try_again(libtorrent_jni.resource_unavailable_try_again_get()),
  result_out_of_range(libtorrent_jni.result_out_of_range_get()),
  state_not_recoverable(libtorrent_jni.state_not_recoverable_get()),
  stream_timeout(libtorrent_jni.stream_timeout_get()),
  text_file_busy(libtorrent_jni.text_file_busy_get()),
  timed_out(libtorrent_jni.timed_out_get()),
  too_many_files_open_in_system(libtorrent_jni.too_many_files_open_in_system_get()),
  too_many_files_open(libtorrent_jni.too_many_files_open_get()),
  too_many_links(libtorrent_jni.too_many_links_get()),
  too_many_symbolic_link_levels(libtorrent_jni.too_many_symbolic_link_levels_get()),
  value_too_large(libtorrent_jni.value_too_large_get()),
  wrong_protocol_type(libtorrent_jni.wrong_protocol_type_get());

  public final int swigValue() {
    return swigValue;
  }

  public static errc_t swigToEnum(int swigValue) {
    errc_t[] swigValues = errc_t.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (errc_t swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + errc_t.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private errc_t() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private errc_t(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private errc_t(errc_t swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}


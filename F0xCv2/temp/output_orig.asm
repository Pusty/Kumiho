; FASM DEBUG MACROS [HEADER AND SECTION ALIGNMENT]
format PE console
entry start_function
include 'C:\fasm\INCLUDE\win32a.inc'

section '.text' code readable executable


start_function:
call function_pusty_f0xC_imports_Internal_createGB__V_line_start
call function_stringmap_start
call function_java_lang_Integer_$clinit$__V_line_start
call function_java_lang_System_$clinit$__V_line_start
call function_example_windows_Example_main__Ljava_lang_String_V_line_start
call function_java_lang_Integer_$cldestroy$_line_start
call function_java_lang_System_$cldestroy$_line_start
call function_free_stringmap_start
call function_pusty_f0xC_imports_Internal_deleteGB__V_line_start
call function_pusty_f0xC_imports_Internal_diagnostics__V_line_start
mov eax, 0
push eax
call function_pusty_f0xC_imports_Internal_exit_I_V_line_start
pop eax
ret

function_stringmap_start:
push ebp
mov ebp, esp
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
push eax
mov ecx, 0
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
pop ebx
push eax
push ebx
lea edi, [eax+12]
lea esi, [stringmap_0_value]
mov ecx, 0
rep movsb
push eax
call function_java_lang_String_$init$__C_V_line_start
add esp, 4*2
pop eax
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [stringmap_0], eax
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
push eax
mov ecx, 1
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
pop ebx
push eax
push ebx
lea edi, [eax+12]
lea esi, [stringmap_23_value]
mov ecx, 1
rep movsb
push eax
call function_java_lang_String_$init$__C_V_line_start
add esp, 4*2
pop eax
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [stringmap_23], eax
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
push eax
mov ecx, 11
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
pop ebx
push eax
push ebx
lea edi, [eax+12]
lea esi, [stringmap_15876a41_value]
mov ecx, 11
rep movsb
push eax
call function_java_lang_String_$init$__C_V_line_start
add esp, 4*2
pop eax
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [stringmap_15876a41], eax
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
push eax
mov ecx, 5
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
pop ebx
push eax
push ebx
lea edi, [eax+12]
lea esi, [stringmap_5cb1923_value]
mov ecx, 5
rep movsb
push eax
call function_java_lang_String_$init$__C_V_line_start
add esp, 4*2
pop eax
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [stringmap_5cb1923], eax
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
push eax
mov ecx, 2
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
pop ebx
push eax
push ebx
lea edi, [eax+12]
lea esi, [stringmap_648_value]
mov ecx, 2
rep movsb
push eax
call function_java_lang_String_$init$__C_V_line_start
add esp, 4*2
pop eax
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [stringmap_648], eax
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
push eax
mov ecx, 2
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
pop ebx
push eax
push ebx
lea edi, [eax+12]
lea esi, [stringmap_628_value]
mov ecx, 2
rep movsb
push eax
call function_java_lang_String_$init$__C_V_line_start
add esp, 4*2
pop eax
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [stringmap_628], eax
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
push eax
mov ecx, 1
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
pop ebx
push eax
push ebx
lea edi, [eax+12]
lea esi, [stringmap_a_value]
mov ecx, 1
rep movsb
push eax
call function_java_lang_String_$init$__C_V_line_start
add esp, 4*2
pop eax
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [stringmap_a], eax
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
push eax
mov ecx, 1
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
pop ebx
push eax
push ebx
lea edi, [eax+12]
lea esi, [stringmap_2b_value]
mov ecx, 1
rep movsb
push eax
call function_java_lang_String_$init$__C_V_line_start
add esp, 4*2
pop eax
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [stringmap_2b], eax
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
push eax
mov ecx, 1
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
pop ebx
push eax
push ebx
lea edi, [eax+12]
lea esi, [stringmap_2d_value]
mov ecx, 1
rep movsb
push eax
call function_java_lang_String_$init$__C_V_line_start
add esp, 4*2
pop eax
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [stringmap_2d], eax
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
push eax
mov ecx, 1
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
pop ebx
push eax
push ebx
lea edi, [eax+12]
lea esi, [stringmap_30_value]
mov ecx, 1
rep movsb
push eax
call function_java_lang_String_$init$__C_V_line_start
add esp, 4*2
pop eax
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [stringmap_30], eax
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
push eax
mov ecx, 4
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
pop ebx
push eax
push ebx
lea edi, [eax+12]
lea esi, [stringmap_33c587_value]
mov ecx, 4
rep movsb
push eax
call function_java_lang_String_$init$__C_V_line_start
add esp, 4*2
pop eax
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [stringmap_33c587], eax
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
push eax
mov ecx, 4
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
pop ebx
push eax
push ebx
lea edi, [eax+12]
lea esi, [stringmap_36758e_value]
mov ecx, 4
rep movsb
push eax
call function_java_lang_String_$init$__C_V_line_start
add esp, 4*2
pop eax
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [stringmap_36758e], eax
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
push eax
mov ecx, 2
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
pop ebx
push eax
push ebx
lea edi, [eax+12]
lea esi, [stringmap_dd9_value]
mov ecx, 2
rep movsb
push eax
call function_java_lang_String_$init$__C_V_line_start
add esp, 4*2
pop eax
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [stringmap_dd9], eax
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
push eax
mov ecx, 29
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
pop ebx
push eax
push ebx
lea edi, [eax+12]
lea esi, [stringmap_85c2f798_value]
mov ecx, 29
rep movsb
push eax
call function_java_lang_String_$init$__C_V_line_start
add esp, 4*2
pop eax
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [stringmap_85c2f798], eax
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
push eax
mov ecx, 4
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
pop ebx
push eax
push ebx
lea edi, [eax+12]
lea esi, [stringmap_33ae2f_value]
mov ecx, 4
rep movsb
push eax
call function_java_lang_String_$init$__C_V_line_start
add esp, 4*2
pop eax
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [stringmap_33ae2f], eax
mov esp, ebp
pop ebp
ret

function_free_stringmap_start:
push ebp
mov ebp, esp
mov eax, dword [stringmap_0]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
mov eax, dword [stringmap_23]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
mov eax, dword [stringmap_15876a41]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
mov eax, dword [stringmap_5cb1923]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
mov eax, dword [stringmap_648]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
mov eax, dword [stringmap_628]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
mov eax, dword [stringmap_a]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
mov eax, dword [stringmap_2b]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
mov eax, dword [stringmap_2d]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
mov eax, dword [stringmap_30]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
mov eax, dword [stringmap_33c587]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
mov eax, dword [stringmap_36758e]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
mov eax, dword [stringmap_dd9]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
mov eax, dword [stringmap_85c2f798]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
mov eax, dword [stringmap_33ae2f]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
mov esp, ebp
pop ebp
ret

;Starting function [$clinit$__V] (P:0 - 0;L:0 - 0)
function_java_lang_Integer_$clinit$__V_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_$clinit$__V_line_0:
mov eax, 36
push eax
function_java_lang_Integer_$clinit$__V_line_2:
pop ecx
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
push eax
function_java_lang_Integer_$clinit$__V_line_4:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_5:
mov eax, 0
push eax
function_java_lang_Integer_$clinit$__V_line_6:
mov eax, 48
push eax
function_java_lang_Integer_$clinit$__V_line_8:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_9:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_10:
mov eax, 1
push eax
function_java_lang_Integer_$clinit$__V_line_11:
mov eax, 49
push eax
function_java_lang_Integer_$clinit$__V_line_13:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_14:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_15:
mov eax, 2
push eax
function_java_lang_Integer_$clinit$__V_line_16:
mov eax, 50
push eax
function_java_lang_Integer_$clinit$__V_line_18:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_19:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_20:
mov eax, 3
push eax
function_java_lang_Integer_$clinit$__V_line_21:
mov eax, 51
push eax
function_java_lang_Integer_$clinit$__V_line_23:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_24:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_25:
mov eax, 4
push eax
function_java_lang_Integer_$clinit$__V_line_26:
mov eax, 52
push eax
function_java_lang_Integer_$clinit$__V_line_28:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_29:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_30:
mov eax, 5
push eax
function_java_lang_Integer_$clinit$__V_line_31:
mov eax, 53
push eax
function_java_lang_Integer_$clinit$__V_line_33:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_34:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_35:
mov eax, 6
push eax
function_java_lang_Integer_$clinit$__V_line_37:
mov eax, 54
push eax
function_java_lang_Integer_$clinit$__V_line_39:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_40:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_41:
mov eax, 7
push eax
function_java_lang_Integer_$clinit$__V_line_43:
mov eax, 55
push eax
function_java_lang_Integer_$clinit$__V_line_45:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_46:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_47:
mov eax, 8
push eax
function_java_lang_Integer_$clinit$__V_line_49:
mov eax, 56
push eax
function_java_lang_Integer_$clinit$__V_line_51:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_52:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_53:
mov eax, 9
push eax
function_java_lang_Integer_$clinit$__V_line_55:
mov eax, 57
push eax
function_java_lang_Integer_$clinit$__V_line_57:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_58:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_59:
mov eax, 10
push eax
function_java_lang_Integer_$clinit$__V_line_61:
mov eax, 97
push eax
function_java_lang_Integer_$clinit$__V_line_63:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_64:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_65:
mov eax, 11
push eax
function_java_lang_Integer_$clinit$__V_line_67:
mov eax, 98
push eax
function_java_lang_Integer_$clinit$__V_line_69:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_70:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_71:
mov eax, 12
push eax
function_java_lang_Integer_$clinit$__V_line_73:
mov eax, 99
push eax
function_java_lang_Integer_$clinit$__V_line_75:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_76:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_77:
mov eax, 13
push eax
function_java_lang_Integer_$clinit$__V_line_79:
mov eax, 100
push eax
function_java_lang_Integer_$clinit$__V_line_81:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_82:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_83:
mov eax, 14
push eax
function_java_lang_Integer_$clinit$__V_line_85:
mov eax, 101
push eax
function_java_lang_Integer_$clinit$__V_line_87:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_88:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_89:
mov eax, 15
push eax
function_java_lang_Integer_$clinit$__V_line_91:
mov eax, 102
push eax
function_java_lang_Integer_$clinit$__V_line_93:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_94:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_95:
mov eax, 16
push eax
function_java_lang_Integer_$clinit$__V_line_97:
mov eax, 103
push eax
function_java_lang_Integer_$clinit$__V_line_99:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_100:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_101:
mov eax, 17
push eax
function_java_lang_Integer_$clinit$__V_line_103:
mov eax, 104
push eax
function_java_lang_Integer_$clinit$__V_line_105:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_106:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_107:
mov eax, 18
push eax
function_java_lang_Integer_$clinit$__V_line_109:
mov eax, 105
push eax
function_java_lang_Integer_$clinit$__V_line_111:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_112:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_113:
mov eax, 19
push eax
function_java_lang_Integer_$clinit$__V_line_115:
mov eax, 106
push eax
function_java_lang_Integer_$clinit$__V_line_117:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_118:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_119:
mov eax, 20
push eax
function_java_lang_Integer_$clinit$__V_line_121:
mov eax, 107
push eax
function_java_lang_Integer_$clinit$__V_line_123:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_124:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_125:
mov eax, 21
push eax
function_java_lang_Integer_$clinit$__V_line_127:
mov eax, 108
push eax
function_java_lang_Integer_$clinit$__V_line_129:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_130:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_131:
mov eax, 22
push eax
function_java_lang_Integer_$clinit$__V_line_133:
mov eax, 109
push eax
function_java_lang_Integer_$clinit$__V_line_135:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_136:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_137:
mov eax, 23
push eax
function_java_lang_Integer_$clinit$__V_line_139:
mov eax, 110
push eax
function_java_lang_Integer_$clinit$__V_line_141:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_142:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_143:
mov eax, 24
push eax
function_java_lang_Integer_$clinit$__V_line_145:
mov eax, 111
push eax
function_java_lang_Integer_$clinit$__V_line_147:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_148:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_149:
mov eax, 25
push eax
function_java_lang_Integer_$clinit$__V_line_151:
mov eax, 112
push eax
function_java_lang_Integer_$clinit$__V_line_153:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_154:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_155:
mov eax, 26
push eax
function_java_lang_Integer_$clinit$__V_line_157:
mov eax, 113
push eax
function_java_lang_Integer_$clinit$__V_line_159:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_160:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_161:
mov eax, 27
push eax
function_java_lang_Integer_$clinit$__V_line_163:
mov eax, 114
push eax
function_java_lang_Integer_$clinit$__V_line_165:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_166:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_167:
mov eax, 28
push eax
function_java_lang_Integer_$clinit$__V_line_169:
mov eax, 115
push eax
function_java_lang_Integer_$clinit$__V_line_171:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_172:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_173:
mov eax, 29
push eax
function_java_lang_Integer_$clinit$__V_line_175:
mov eax, 116
push eax
function_java_lang_Integer_$clinit$__V_line_177:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_178:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_179:
mov eax, 30
push eax
function_java_lang_Integer_$clinit$__V_line_181:
mov eax, 117
push eax
function_java_lang_Integer_$clinit$__V_line_183:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_184:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_185:
mov eax, 31
push eax
function_java_lang_Integer_$clinit$__V_line_187:
mov eax, 118
push eax
function_java_lang_Integer_$clinit$__V_line_189:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_190:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_191:
mov eax, 32
push eax
function_java_lang_Integer_$clinit$__V_line_193:
mov eax, 119
push eax
function_java_lang_Integer_$clinit$__V_line_195:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_196:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_197:
mov eax, 33
push eax
function_java_lang_Integer_$clinit$__V_line_199:
mov eax, 120
push eax
function_java_lang_Integer_$clinit$__V_line_201:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_202:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_203:
mov eax, 34
push eax
function_java_lang_Integer_$clinit$__V_line_205:
mov eax, 121
push eax
function_java_lang_Integer_$clinit$__V_line_207:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_208:
pop eax
push eax
push eax
function_java_lang_Integer_$clinit$__V_line_209:
mov eax, 35
push eax
function_java_lang_Integer_$clinit$__V_line_211:
mov eax, 122
push eax
function_java_lang_Integer_$clinit$__V_line_213:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_$clinit$__V_line_214:
mov eax, dword [java_lang_Integer_digits]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [java_lang_Integer_digits], eax
function_java_lang_Integer_$clinit$__V_line_217:
jmp function_java_lang_Integer_$clinit$__V_line_exit
function_java_lang_Integer_$clinit$__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$init$_I_V] (P:2 - 2;L:0 - 0)
function_java_lang_Integer_$init$_I_V_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_$init$_I_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_$init$_I_V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_java_lang_Integer_$init$_I_V_line_4:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_$init$_I_V_line_5:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_$init$_I_V_line_6:
pop eax
pop ebx
mov dword [ebx+8], eax
function_java_lang_Integer_$init$_I_V_line_9:
jmp function_java_lang_Integer_$init$_I_V_line_exit
function_java_lang_Integer_$init$_I_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$init$_Ljava_lang_String_V] (P:2 - 2;L:0 - 0)
function_java_lang_Integer_$init$_Ljava_lang_String_V_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_$init$_Ljava_lang_String_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_$init$_Ljava_lang_String_V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_java_lang_Integer_$init$_Ljava_lang_String_V_line_4:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_$init$_Ljava_lang_String_V_line_5:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_$init$_Ljava_lang_String_V_line_6:
mov eax, 10
push eax
function_java_lang_Integer_$init$_Ljava_lang_String_V_line_8:
call function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_start
add esp, 4*2
push eax
function_java_lang_Integer_$init$_Ljava_lang_String_V_line_11:
pop eax
pop ebx
mov dword [ebx+8], eax
function_java_lang_Integer_$init$_Ljava_lang_String_V_line_14:
jmp function_java_lang_Integer_$init$_Ljava_lang_String_V_line_exit
function_java_lang_Integer_$init$_Ljava_lang_String_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [valueOf_I_Ljava_lang_Integer] (P:1 - 1;L:0 - 0)
function_java_lang_Integer_valueOf_I_Ljava_lang_Integer_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_valueOf_I_Ljava_lang_Integer_line_0:
mov eax, java_lang_Integer_class
push eax
mov eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_Integer_valueOf_I_Ljava_lang_Integer_line_3:
pop eax
push eax
push eax
function_java_lang_Integer_valueOf_I_Ljava_lang_Integer_line_4:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_valueOf_I_Ljava_lang_Integer_line_5:
call function_java_lang_Integer_$init$_I_V_line_start
add esp, 4*2
function_java_lang_Integer_valueOf_I_Ljava_lang_Integer_line_8:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_Integer_valueOf_I_Ljava_lang_Integer_line_exit
function_java_lang_Integer_valueOf_I_Ljava_lang_Integer_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [byteValue__B] (P:1 - 1;L:0 - 0)
function_java_lang_Integer_byteValue__B_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_byteValue__B_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_byteValue__B_line_1:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_Integer_byteValue__B_line_4:
pop eax
movsx eax, al
push eax
function_java_lang_Integer_byteValue__B_line_5:
pop eax
jmp function_java_lang_Integer_byteValue__B_line_exit
function_java_lang_Integer_byteValue__B_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [shortValue__S] (P:1 - 1;L:0 - 0)
function_java_lang_Integer_shortValue__S_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_shortValue__S_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_shortValue__S_line_1:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_Integer_shortValue__S_line_4:
pop eax
movsx eax, ax
push eax
function_java_lang_Integer_shortValue__S_line_5:
pop eax
jmp function_java_lang_Integer_shortValue__S_line_exit
function_java_lang_Integer_shortValue__S_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [intValue__I] (P:1 - 1;L:0 - 0)
function_java_lang_Integer_intValue__I_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_intValue__I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_intValue__I_line_1:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_Integer_intValue__I_line_4:
pop eax
jmp function_java_lang_Integer_intValue__I_line_exit
function_java_lang_Integer_intValue__I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [longValue__J] (P:1 - 1;L:0 - 0)
function_java_lang_Integer_longValue__J_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_longValue__J_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_longValue__J_line_1:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_Integer_longValue__J_line_4:
pop eax
xor edx, edx
push eax
push edx
function_java_lang_Integer_longValue__J_line_5:
pop edx
pop eax
jmp function_java_lang_Integer_longValue__J_line_exit
function_java_lang_Integer_longValue__J_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [floatValue__F] (P:1 - 1;L:0 - 0)
function_java_lang_Integer_floatValue__F_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_floatValue__F_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_floatValue__F_line_1:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_Integer_floatValue__F_line_4:
pop eax
push eax
fild dword [esp]
fstp dword [esp]
pop eax
push eax
function_java_lang_Integer_floatValue__F_line_5:
pop eax
jmp function_java_lang_Integer_floatValue__F_line_exit
function_java_lang_Integer_floatValue__F_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [doubleValue__D] (P:1 - 1;L:0 - 0)
function_java_lang_Integer_doubleValue__D_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_doubleValue__D_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_doubleValue__D_line_1:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_Integer_doubleValue__D_line_4:
pop eax
push eax
fild dword [esp]
fstp dword [esp]
pop eax
push edx
push eax
fld dword  [esp]
fstp qword [esp]
pop edx
pop eax
push eax
push edx
function_java_lang_Integer_doubleValue__D_line_5:
pop edx
pop eax
jmp function_java_lang_Integer_doubleValue__D_line_exit
function_java_lang_Integer_doubleValue__D_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [toString__Ljava_lang_String] (P:1 - 1;L:0 - 0)
function_java_lang_Integer_toString__Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_toString__Ljava_lang_String_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_toString__Ljava_lang_String_line_1:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_Integer_toString__Ljava_lang_String_line_4:
call function_java_lang_Integer_toString_I_Ljava_lang_String_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_Integer_toString__Ljava_lang_String_line_7:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_Integer_toString__Ljava_lang_String_line_exit
function_java_lang_Integer_toString__Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [decode_Ljava_lang_String_Ljava_lang_Integer] (P:1 - 1;L:5 - 5)
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_start:
push ebp
mov ebp, esp
sub esp, 4*5
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
mov dword [esp+4*2], 0
mov dword [esp+4*3], 0
mov dword [esp+4*4], 0
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_0:
mov eax, 10
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_2:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_3:
mov eax, 0
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_4:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_5:
mov eax, 0
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_6:
pop eax
mov dword [ebp-4*3], eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_7:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_8:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:length__I
add eax, 4*5
call dword [eax] ;java_lang_String.length__I
add esp, 4*1
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_11:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_16
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_14:
mov eax, 0
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_15:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_exit
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_16:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_17:
mov eax, 0
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_18:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:charAt_I_C
add eax, 4*7
call dword [eax] ;java_lang_String.charAt_I_C
add esp, 4*2
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_21:
pop eax
mov dword [ebp-4*5], eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_23:
mov eax, dword [ebp-4*5]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_25:
mov eax, 45
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_27:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_38
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_30:
mov eax, 1
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_31:
pop eax
mov dword [ebp-4*3], eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_32:
mov eax, dword [ebp-4*2]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*2], eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_35:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_48
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_38:
mov eax, dword [ebp-4*5]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_40:
mov eax, 43
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_42:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_48
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_45:
mov eax, dword [ebp-4*2]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*2], eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_48:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_49:
mov eax, dword [stringmap_648]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_51:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_52:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:startsWith_Ljava_lang_StringI_Z
add eax, 4*16
call dword [eax] ;java_lang_String.startsWith_Ljava_lang_StringI_Z
add esp, 4*3
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_55:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_68
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_58:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_59:
mov eax, dword [stringmap_628]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_61:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_62:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:startsWith_Ljava_lang_StringI_Z
add eax, 4*16
call dword [eax] ;java_lang_String.startsWith_Ljava_lang_StringI_Z
add esp, 4*3
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_65:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_77
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_68:
mov eax, dword [ebp-4*2]
push eax
mov eax, 2
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*2], eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_71:
mov eax, 16
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_73:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_74:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_122
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_77:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_78:
mov eax, dword [stringmap_23]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_80:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_81:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:startsWith_Ljava_lang_StringI_Z
add eax, 4*16
call dword [eax] ;java_lang_String.startsWith_Ljava_lang_StringI_Z
add esp, 4*3
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_84:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_96
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_87:
mov eax, dword [ebp-4*2]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*2], eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_90:
mov eax, 16
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_92:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_93:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_122
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_96:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_97:
mov eax, dword [stringmap_30]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_99:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_100:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:startsWith_Ljava_lang_StringI_Z
add eax, 4*16
call dword [eax] ;java_lang_String.startsWith_Ljava_lang_StringI_Z
add esp, 4*3
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_103:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_122
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_106:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_107:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:length__I
add eax, 4*5
call dword [eax] ;java_lang_String.length__I
add esp, 4*1
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_110:
mov eax, 1
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_111:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_112:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_113:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_122
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_116:
mov eax, dword [ebp-4*2]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*2], eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_119:
mov eax, 8
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_121:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_122:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_123:
mov eax, dword [stringmap_2d]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_125:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_126:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:startsWith_Ljava_lang_StringI_Z
add eax, 4*16
call dword [eax] ;java_lang_String.startsWith_Ljava_lang_StringI_Z
add esp, 4*3
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_129:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_142
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_132:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_133:
mov eax, dword [stringmap_2b]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_135:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_136:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:startsWith_Ljava_lang_StringI_Z
add eax, 4*16
call dword [eax] ;java_lang_String.startsWith_Ljava_lang_StringI_Z
add esp, 4*3
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_139:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_144
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_142:
mov eax, 0
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_143:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_exit
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_144:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_145:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_146:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:substring_I_Ljava_lang_String
add eax, 4*11
call dword [eax] ;java_lang_String.substring_I_Ljava_lang_String
add esp, 4*2
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_149:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_150:
call function_java_lang_Integer_valueOf_Ljava_lang_StringI_Ljava_lang_Integer_line_start
add esp, 4*2
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_153:
mov eax, dword [ebp-4*4]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*4], eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_155:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_156:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_171
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_159:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_161:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:intValue__I
add eax, 4*7
call dword [eax] ;java_lang_Integer.intValue__I
add esp, 4*1
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_164:
pop eax
neg eax
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_165:
call function_java_lang_Integer_valueOf_I_Ljava_lang_Integer_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_168:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_173
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_171:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_173:
mov eax, dword [ebp-4*4]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*4], eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_175:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_177:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_exit
function_java_lang_Integer_decode_Ljava_lang_String_Ljava_lang_Integer_line_exit:
push eax
mov eax, dword [ebp-4*4]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [compareTo_Ljava_lang_Integer_I] (P:2 - 2;L:0 - 0)
function_java_lang_Integer_compareTo_Ljava_lang_Integer_I_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_compareTo_Ljava_lang_Integer_I_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_compareTo_Ljava_lang_Integer_I_line_1:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_Integer_compareTo_Ljava_lang_Integer_I_line_4:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_compareTo_Ljava_lang_Integer_I_line_5:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_Integer_compareTo_Ljava_lang_Integer_I_line_8:
call function_java_lang_Integer_compare_II_I_line_start
add esp, 4*2
push eax
function_java_lang_Integer_compareTo_Ljava_lang_Integer_I_line_11:
pop eax
jmp function_java_lang_Integer_compareTo_Ljava_lang_Integer_I_line_exit
function_java_lang_Integer_compareTo_Ljava_lang_Integer_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [compare_II_I] (P:2 - 2;L:0 - 0)
function_java_lang_Integer_compare_II_I_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_compare_II_I_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_compare_II_I_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_compare_II_I_line_2:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_Integer_compare_II_I_line_9
function_java_lang_Integer_compare_II_I_line_5:
mov eax, -1
push eax
function_java_lang_Integer_compare_II_I_line_6:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_Integer_compare_II_I_line_19
function_java_lang_Integer_compare_II_I_line_9:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_compare_II_I_line_10:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_compare_II_I_line_11:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_Integer_compare_II_I_line_18
function_java_lang_Integer_compare_II_I_line_14:
mov eax, 0
push eax
function_java_lang_Integer_compare_II_I_line_15:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_Integer_compare_II_I_line_19
function_java_lang_Integer_compare_II_I_line_18:
mov eax, 1
push eax
function_java_lang_Integer_compare_II_I_line_19:
pop eax
jmp function_java_lang_Integer_compare_II_I_line_exit
function_java_lang_Integer_compare_II_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [highestOneBit_I_I] (P:1 - 1;L:0 - 0)
function_java_lang_Integer_highestOneBit_I_I_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_highestOneBit_I_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_highestOneBit_I_I_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_highestOneBit_I_I_line_2:
mov eax, 1
push eax
function_java_lang_Integer_highestOneBit_I_I_line_3:
pop ebx
pop eax
mov cl, bl
sar eax, cl
push eax
function_java_lang_Integer_highestOneBit_I_I_line_4:
pop ebx
pop eax
or eax, ebx
push eax
function_java_lang_Integer_highestOneBit_I_I_line_5:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_Integer_highestOneBit_I_I_line_6:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_highestOneBit_I_I_line_7:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_highestOneBit_I_I_line_8:
mov eax, 2
push eax
function_java_lang_Integer_highestOneBit_I_I_line_9:
pop ebx
pop eax
mov cl, bl
sar eax, cl
push eax
function_java_lang_Integer_highestOneBit_I_I_line_10:
pop ebx
pop eax
or eax, ebx
push eax
function_java_lang_Integer_highestOneBit_I_I_line_11:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_Integer_highestOneBit_I_I_line_12:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_highestOneBit_I_I_line_13:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_highestOneBit_I_I_line_14:
mov eax, 4
push eax
function_java_lang_Integer_highestOneBit_I_I_line_15:
pop ebx
pop eax
mov cl, bl
sar eax, cl
push eax
function_java_lang_Integer_highestOneBit_I_I_line_16:
pop ebx
pop eax
or eax, ebx
push eax
function_java_lang_Integer_highestOneBit_I_I_line_17:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_Integer_highestOneBit_I_I_line_18:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_highestOneBit_I_I_line_19:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_highestOneBit_I_I_line_20:
mov eax, 8
push eax
function_java_lang_Integer_highestOneBit_I_I_line_22:
pop ebx
pop eax
mov cl, bl
sar eax, cl
push eax
function_java_lang_Integer_highestOneBit_I_I_line_23:
pop ebx
pop eax
or eax, ebx
push eax
function_java_lang_Integer_highestOneBit_I_I_line_24:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_Integer_highestOneBit_I_I_line_25:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_highestOneBit_I_I_line_26:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_highestOneBit_I_I_line_27:
mov eax, 16
push eax
function_java_lang_Integer_highestOneBit_I_I_line_29:
pop ebx
pop eax
mov cl, bl
sar eax, cl
push eax
function_java_lang_Integer_highestOneBit_I_I_line_30:
pop ebx
pop eax
or eax, ebx
push eax
function_java_lang_Integer_highestOneBit_I_I_line_31:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_Integer_highestOneBit_I_I_line_32:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_highestOneBit_I_I_line_33:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_highestOneBit_I_I_line_34:
mov eax, 1
push eax
function_java_lang_Integer_highestOneBit_I_I_line_35:
pop ebx
pop eax
mov cl, bl
shr eax, cl
push eax
function_java_lang_Integer_highestOneBit_I_I_line_36:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_Integer_highestOneBit_I_I_line_37:
pop eax
jmp function_java_lang_Integer_highestOneBit_I_I_line_exit
function_java_lang_Integer_highestOneBit_I_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [lowestOneBit_I_I] (P:1 - 1;L:0 - 0)
function_java_lang_Integer_lowestOneBit_I_I_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_lowestOneBit_I_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_lowestOneBit_I_I_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_lowestOneBit_I_I_line_2:
pop eax
neg eax
push eax
function_java_lang_Integer_lowestOneBit_I_I_line_3:
pop ebx
pop eax
and eax, ebx
push eax
function_java_lang_Integer_lowestOneBit_I_I_line_4:
pop eax
jmp function_java_lang_Integer_lowestOneBit_I_I_line_exit
function_java_lang_Integer_lowestOneBit_I_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [numberOfLeadingZeros_I_I] (P:1 - 1;L:1 - 1)
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_start:
push ebp
mov ebp, esp
sub esp, 4*1
mov dword [esp+4*0], 0
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_1:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_Integer_numberOfLeadingZeros_I_I_line_7
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_4:
mov eax, 32
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_6:
pop eax
jmp function_java_lang_Integer_numberOfLeadingZeros_I_I_line_exit
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_7:
mov eax, 1
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_8:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_9:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_10:
mov eax, 16
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_12:
pop ebx
pop eax
mov cl, bl
shr eax, cl
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_13:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_Integer_numberOfLeadingZeros_I_I_line_24
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_16:
mov eax, dword [ebp-4*1]
push eax
mov eax, 16
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*1], eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_19:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_20:
mov eax, 16
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_22:
pop ebx
pop eax
mov cl, bl
shl eax, cl
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_23:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_24:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_25:
mov eax, 24
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_27:
pop ebx
pop eax
mov cl, bl
shr eax, cl
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_28:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_Integer_numberOfLeadingZeros_I_I_line_39
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_31:
mov eax, dword [ebp-4*1]
push eax
mov eax, 8
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*1], eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_34:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_35:
mov eax, 8
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_37:
pop ebx
pop eax
mov cl, bl
shl eax, cl
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_38:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_39:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_40:
mov eax, 28
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_42:
pop ebx
pop eax
mov cl, bl
shr eax, cl
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_43:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_Integer_numberOfLeadingZeros_I_I_line_53
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_46:
mov eax, dword [ebp-4*1]
push eax
mov eax, 4
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*1], eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_49:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_50:
mov eax, 4
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_51:
pop ebx
pop eax
mov cl, bl
shl eax, cl
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_52:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_53:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_54:
mov eax, 30
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_56:
pop ebx
pop eax
mov cl, bl
shr eax, cl
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_57:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_Integer_numberOfLeadingZeros_I_I_line_67
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_60:
mov eax, dword [ebp-4*1]
push eax
mov eax, 2
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*1], eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_63:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_64:
mov eax, 2
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_65:
pop ebx
pop eax
mov cl, bl
shl eax, cl
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_66:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_67:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_68:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_69:
mov eax, 31
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_71:
pop ebx
pop eax
mov cl, bl
shr eax, cl
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_72:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_73:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_74:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_75:
pop eax
jmp function_java_lang_Integer_numberOfLeadingZeros_I_I_line_exit
function_java_lang_Integer_numberOfLeadingZeros_I_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [numberOfTrailingZeros_I_I] (P:1 - 1;L:2 - 2)
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_start:
push ebp
mov ebp, esp
sub esp, 4*2
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_1:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_Integer_numberOfTrailingZeros_I_I_line_7
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_4:
mov eax, 32
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_6:
pop eax
jmp function_java_lang_Integer_numberOfTrailingZeros_I_I_line_exit
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_7:
mov eax, 31
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_9:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_10:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_11:
mov eax, 16
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_13:
pop ebx
pop eax
mov cl, bl
shl eax, cl
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_14:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_15:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_16:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_Integer_numberOfTrailingZeros_I_I_line_24
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_19:
mov eax, dword [ebp-4*2]
push eax
mov eax, 240
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*2], eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_22:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_23:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_24:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_25:
mov eax, 8
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_27:
pop ebx
pop eax
mov cl, bl
shl eax, cl
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_28:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_29:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_30:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_Integer_numberOfTrailingZeros_I_I_line_38
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_33:
mov eax, dword [ebp-4*2]
push eax
mov eax, 248
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*2], eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_36:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_37:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_38:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_39:
mov eax, 4
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_40:
pop ebx
pop eax
mov cl, bl
shl eax, cl
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_41:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_42:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_43:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_Integer_numberOfTrailingZeros_I_I_line_51
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_46:
mov eax, dword [ebp-4*2]
push eax
mov eax, 252
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*2], eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_49:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_50:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_51:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_52:
mov eax, 2
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_53:
pop ebx
pop eax
mov cl, bl
shl eax, cl
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_54:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_55:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_56:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_Integer_numberOfTrailingZeros_I_I_line_64
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_59:
mov eax, dword [ebp-4*2]
push eax
mov eax, 254
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*2], eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_62:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_63:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_64:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_65:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_66:
mov eax, 1
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_67:
pop ebx
pop eax
mov cl, bl
shl eax, cl
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_68:
mov eax, 31
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_70:
pop ebx
pop eax
mov cl, bl
shr eax, cl
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_71:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_72:
pop eax
jmp function_java_lang_Integer_numberOfTrailingZeros_I_I_line_exit
function_java_lang_Integer_numberOfTrailingZeros_I_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [bitCount_I_I] (P:1 - 1;L:0 - 0)
function_java_lang_Integer_bitCount_I_I_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_bitCount_I_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_bitCount_I_I_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_bitCount_I_I_line_2:
mov eax, 1
push eax
function_java_lang_Integer_bitCount_I_I_line_3:
pop ebx
pop eax
mov cl, bl
shr eax, cl
push eax
function_java_lang_Integer_bitCount_I_I_line_4:
mov eax, 1431655765
push eax
function_java_lang_Integer_bitCount_I_I_line_6:
pop ebx
pop eax
and eax, ebx
push eax
function_java_lang_Integer_bitCount_I_I_line_7:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_Integer_bitCount_I_I_line_8:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_Integer_bitCount_I_I_line_9:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_bitCount_I_I_line_10:
mov eax, 858993459
push eax
function_java_lang_Integer_bitCount_I_I_line_12:
pop ebx
pop eax
and eax, ebx
push eax
function_java_lang_Integer_bitCount_I_I_line_13:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_bitCount_I_I_line_14:
mov eax, 2
push eax
function_java_lang_Integer_bitCount_I_I_line_15:
pop ebx
pop eax
mov cl, bl
shr eax, cl
push eax
function_java_lang_Integer_bitCount_I_I_line_16:
mov eax, 858993459
push eax
function_java_lang_Integer_bitCount_I_I_line_18:
pop ebx
pop eax
and eax, ebx
push eax
function_java_lang_Integer_bitCount_I_I_line_19:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_Integer_bitCount_I_I_line_20:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_Integer_bitCount_I_I_line_21:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_bitCount_I_I_line_22:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_bitCount_I_I_line_23:
mov eax, 4
push eax
function_java_lang_Integer_bitCount_I_I_line_24:
pop ebx
pop eax
mov cl, bl
shr eax, cl
push eax
function_java_lang_Integer_bitCount_I_I_line_25:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_Integer_bitCount_I_I_line_26:
mov eax, 252645135
push eax
function_java_lang_Integer_bitCount_I_I_line_28:
pop ebx
pop eax
and eax, ebx
push eax
function_java_lang_Integer_bitCount_I_I_line_29:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_Integer_bitCount_I_I_line_30:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_bitCount_I_I_line_31:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_bitCount_I_I_line_32:
mov eax, 8
push eax
function_java_lang_Integer_bitCount_I_I_line_34:
pop ebx
pop eax
mov cl, bl
shr eax, cl
push eax
function_java_lang_Integer_bitCount_I_I_line_35:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_Integer_bitCount_I_I_line_36:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_Integer_bitCount_I_I_line_37:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_bitCount_I_I_line_38:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_bitCount_I_I_line_39:
mov eax, 16
push eax
function_java_lang_Integer_bitCount_I_I_line_41:
pop ebx
pop eax
mov cl, bl
shr eax, cl
push eax
function_java_lang_Integer_bitCount_I_I_line_42:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_Integer_bitCount_I_I_line_43:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_Integer_bitCount_I_I_line_44:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_bitCount_I_I_line_45:
mov eax, 63
push eax
function_java_lang_Integer_bitCount_I_I_line_47:
pop ebx
pop eax
and eax, ebx
push eax
function_java_lang_Integer_bitCount_I_I_line_48:
pop eax
jmp function_java_lang_Integer_bitCount_I_I_line_exit
function_java_lang_Integer_bitCount_I_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [rotateLeft_II_I] (P:2 - 2;L:0 - 0)
function_java_lang_Integer_rotateLeft_II_I_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_rotateLeft_II_I_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_rotateLeft_II_I_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_rotateLeft_II_I_line_2:
pop ebx
pop eax
mov cl, bl
shl eax, cl
push eax
function_java_lang_Integer_rotateLeft_II_I_line_3:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_rotateLeft_II_I_line_4:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_rotateLeft_II_I_line_5:
pop eax
neg eax
push eax
function_java_lang_Integer_rotateLeft_II_I_line_6:
pop ebx
pop eax
mov cl, bl
shr eax, cl
push eax
function_java_lang_Integer_rotateLeft_II_I_line_7:
pop ebx
pop eax
or eax, ebx
push eax
function_java_lang_Integer_rotateLeft_II_I_line_8:
pop eax
jmp function_java_lang_Integer_rotateLeft_II_I_line_exit
function_java_lang_Integer_rotateLeft_II_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [rotateRight_II_I] (P:2 - 2;L:0 - 0)
function_java_lang_Integer_rotateRight_II_I_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_rotateRight_II_I_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_rotateRight_II_I_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_rotateRight_II_I_line_2:
pop ebx
pop eax
mov cl, bl
shr eax, cl
push eax
function_java_lang_Integer_rotateRight_II_I_line_3:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_rotateRight_II_I_line_4:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_rotateRight_II_I_line_5:
pop eax
neg eax
push eax
function_java_lang_Integer_rotateRight_II_I_line_6:
pop ebx
pop eax
mov cl, bl
shl eax, cl
push eax
function_java_lang_Integer_rotateRight_II_I_line_7:
pop ebx
pop eax
or eax, ebx
push eax
function_java_lang_Integer_rotateRight_II_I_line_8:
pop eax
jmp function_java_lang_Integer_rotateRight_II_I_line_exit
function_java_lang_Integer_rotateRight_II_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [reverse_I_I] (P:1 - 1;L:0 - 0)
function_java_lang_Integer_reverse_I_I_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_reverse_I_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_reverse_I_I_line_1:
mov eax, 1431655765
push eax
function_java_lang_Integer_reverse_I_I_line_3:
pop ebx
pop eax
and eax, ebx
push eax
function_java_lang_Integer_reverse_I_I_line_4:
mov eax, 1
push eax
function_java_lang_Integer_reverse_I_I_line_5:
pop ebx
pop eax
mov cl, bl
shl eax, cl
push eax
function_java_lang_Integer_reverse_I_I_line_6:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_reverse_I_I_line_7:
mov eax, 1
push eax
function_java_lang_Integer_reverse_I_I_line_8:
pop ebx
pop eax
mov cl, bl
shr eax, cl
push eax
function_java_lang_Integer_reverse_I_I_line_9:
mov eax, 1431655765
push eax
function_java_lang_Integer_reverse_I_I_line_11:
pop ebx
pop eax
and eax, ebx
push eax
function_java_lang_Integer_reverse_I_I_line_12:
pop ebx
pop eax
or eax, ebx
push eax
function_java_lang_Integer_reverse_I_I_line_13:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_Integer_reverse_I_I_line_14:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_reverse_I_I_line_15:
mov eax, 858993459
push eax
function_java_lang_Integer_reverse_I_I_line_17:
pop ebx
pop eax
and eax, ebx
push eax
function_java_lang_Integer_reverse_I_I_line_18:
mov eax, 2
push eax
function_java_lang_Integer_reverse_I_I_line_19:
pop ebx
pop eax
mov cl, bl
shl eax, cl
push eax
function_java_lang_Integer_reverse_I_I_line_20:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_reverse_I_I_line_21:
mov eax, 2
push eax
function_java_lang_Integer_reverse_I_I_line_22:
pop ebx
pop eax
mov cl, bl
shr eax, cl
push eax
function_java_lang_Integer_reverse_I_I_line_23:
mov eax, 858993459
push eax
function_java_lang_Integer_reverse_I_I_line_25:
pop ebx
pop eax
and eax, ebx
push eax
function_java_lang_Integer_reverse_I_I_line_26:
pop ebx
pop eax
or eax, ebx
push eax
function_java_lang_Integer_reverse_I_I_line_27:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_Integer_reverse_I_I_line_28:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_reverse_I_I_line_29:
mov eax, 252645135
push eax
function_java_lang_Integer_reverse_I_I_line_31:
pop ebx
pop eax
and eax, ebx
push eax
function_java_lang_Integer_reverse_I_I_line_32:
mov eax, 4
push eax
function_java_lang_Integer_reverse_I_I_line_33:
pop ebx
pop eax
mov cl, bl
shl eax, cl
push eax
function_java_lang_Integer_reverse_I_I_line_34:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_reverse_I_I_line_35:
mov eax, 4
push eax
function_java_lang_Integer_reverse_I_I_line_36:
pop ebx
pop eax
mov cl, bl
shr eax, cl
push eax
function_java_lang_Integer_reverse_I_I_line_37:
mov eax, 252645135
push eax
function_java_lang_Integer_reverse_I_I_line_39:
pop ebx
pop eax
and eax, ebx
push eax
function_java_lang_Integer_reverse_I_I_line_40:
pop ebx
pop eax
or eax, ebx
push eax
function_java_lang_Integer_reverse_I_I_line_41:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_Integer_reverse_I_I_line_42:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_reverse_I_I_line_43:
mov eax, 24
push eax
function_java_lang_Integer_reverse_I_I_line_45:
pop ebx
pop eax
mov cl, bl
shl eax, cl
push eax
function_java_lang_Integer_reverse_I_I_line_46:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_reverse_I_I_line_47:
mov eax, 65280
push eax
function_java_lang_Integer_reverse_I_I_line_49:
pop ebx
pop eax
and eax, ebx
push eax
function_java_lang_Integer_reverse_I_I_line_50:
mov eax, 8
push eax
function_java_lang_Integer_reverse_I_I_line_52:
pop ebx
pop eax
mov cl, bl
shl eax, cl
push eax
function_java_lang_Integer_reverse_I_I_line_53:
pop ebx
pop eax
or eax, ebx
push eax
function_java_lang_Integer_reverse_I_I_line_54:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_reverse_I_I_line_55:
mov eax, 8
push eax
function_java_lang_Integer_reverse_I_I_line_57:
pop ebx
pop eax
mov cl, bl
shr eax, cl
push eax
function_java_lang_Integer_reverse_I_I_line_58:
mov eax, 65280
push eax
function_java_lang_Integer_reverse_I_I_line_60:
pop ebx
pop eax
and eax, ebx
push eax
function_java_lang_Integer_reverse_I_I_line_61:
pop ebx
pop eax
or eax, ebx
push eax
function_java_lang_Integer_reverse_I_I_line_62:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_reverse_I_I_line_63:
mov eax, 24
push eax
function_java_lang_Integer_reverse_I_I_line_65:
pop ebx
pop eax
mov cl, bl
shr eax, cl
push eax
function_java_lang_Integer_reverse_I_I_line_66:
pop ebx
pop eax
or eax, ebx
push eax
function_java_lang_Integer_reverse_I_I_line_67:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_Integer_reverse_I_I_line_68:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_reverse_I_I_line_69:
pop eax
jmp function_java_lang_Integer_reverse_I_I_line_exit
function_java_lang_Integer_reverse_I_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [signum_I_I] (P:1 - 1;L:0 - 0)
function_java_lang_Integer_signum_I_I_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_signum_I_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_signum_I_I_line_1:
mov eax, 31
push eax
function_java_lang_Integer_signum_I_I_line_3:
pop ebx
pop eax
mov cl, bl
sar eax, cl
push eax
function_java_lang_Integer_signum_I_I_line_4:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_signum_I_I_line_5:
pop eax
neg eax
push eax
function_java_lang_Integer_signum_I_I_line_6:
mov eax, 31
push eax
function_java_lang_Integer_signum_I_I_line_8:
pop ebx
pop eax
mov cl, bl
shr eax, cl
push eax
function_java_lang_Integer_signum_I_I_line_9:
pop ebx
pop eax
or eax, ebx
push eax
function_java_lang_Integer_signum_I_I_line_10:
pop eax
jmp function_java_lang_Integer_signum_I_I_line_exit
function_java_lang_Integer_signum_I_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [reverseBytes_I_I] (P:1 - 1;L:0 - 0)
function_java_lang_Integer_reverseBytes_I_I_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_reverseBytes_I_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_reverseBytes_I_I_line_1:
mov eax, 24
push eax
function_java_lang_Integer_reverseBytes_I_I_line_3:
pop ebx
pop eax
mov cl, bl
shr eax, cl
push eax
function_java_lang_Integer_reverseBytes_I_I_line_4:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_reverseBytes_I_I_line_5:
mov eax, 8
push eax
function_java_lang_Integer_reverseBytes_I_I_line_7:
pop ebx
pop eax
mov cl, bl
sar eax, cl
push eax
function_java_lang_Integer_reverseBytes_I_I_line_8:
mov eax, 65280
push eax
function_java_lang_Integer_reverseBytes_I_I_line_10:
pop ebx
pop eax
and eax, ebx
push eax
function_java_lang_Integer_reverseBytes_I_I_line_11:
pop ebx
pop eax
or eax, ebx
push eax
function_java_lang_Integer_reverseBytes_I_I_line_12:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_reverseBytes_I_I_line_13:
mov eax, 8
push eax
function_java_lang_Integer_reverseBytes_I_I_line_15:
pop ebx
pop eax
mov cl, bl
shl eax, cl
push eax
function_java_lang_Integer_reverseBytes_I_I_line_16:
mov eax, 16711680
push eax
function_java_lang_Integer_reverseBytes_I_I_line_18:
pop ebx
pop eax
and eax, ebx
push eax
function_java_lang_Integer_reverseBytes_I_I_line_19:
pop ebx
pop eax
or eax, ebx
push eax
function_java_lang_Integer_reverseBytes_I_I_line_20:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_reverseBytes_I_I_line_21:
mov eax, 24
push eax
function_java_lang_Integer_reverseBytes_I_I_line_23:
pop ebx
pop eax
mov cl, bl
shl eax, cl
push eax
function_java_lang_Integer_reverseBytes_I_I_line_24:
pop ebx
pop eax
or eax, ebx
push eax
function_java_lang_Integer_reverseBytes_I_I_line_25:
pop eax
jmp function_java_lang_Integer_reverseBytes_I_I_line_exit
function_java_lang_Integer_reverseBytes_I_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [hashCode__I] (P:1 - 1;L:0 - 0)
function_java_lang_Integer_hashCode__I_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_hashCode__I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_hashCode__I_line_1:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_Integer_hashCode__I_line_4:
pop eax
jmp function_java_lang_Integer_hashCode__I_line_exit
function_java_lang_Integer_hashCode__I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [toString_II_Ljava_lang_String] (P:2 - 2;L:3 - 3)
function_java_lang_Integer_toString_II_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
sub esp, 4*3
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
mov dword [esp+4*2], 0
function_java_lang_Integer_toString_II_Ljava_lang_String_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_1:
mov eax, 2
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_2:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_Integer_toString_II_Ljava_lang_String_line_11
function_java_lang_Integer_toString_II_Ljava_lang_String_line_5:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_6:
mov eax, 36
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_8:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_Integer_toString_II_Ljava_lang_String_line_14
function_java_lang_Integer_toString_II_Ljava_lang_String_line_11:
mov eax, 10
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_13:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_14:
mov eax, 33
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_16:
pop ecx
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_18:
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*1], eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_19:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_20:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_Integer_toString_II_Ljava_lang_String_line_27
function_java_lang_Integer_toString_II_Ljava_lang_String_line_23:
mov eax, 1
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_24:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_Integer_toString_II_Ljava_lang_String_line_28
function_java_lang_Integer_toString_II_Ljava_lang_String_line_27:
mov eax, 0
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_28:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_29:
mov eax, 32
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_31:
pop eax
mov dword [ebp-4*3], eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_33:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_34:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_Integer_toString_II_Ljava_lang_String_line_62
function_java_lang_Integer_toString_II_Ljava_lang_String_line_37:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_38:
pop eax
neg eax
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_39:
pop eax
mov dword [ebp+4*3], eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_40:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_Integer_toString_II_Ljava_lang_String_line_62
function_java_lang_Integer_toString_II_Ljava_lang_String_line_43:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_44:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_46:
mov eax, dword [ebp-4*3]
push eax
mov eax, 255
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*3], eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_49:
mov eax, dword [java_lang_Integer_digits]
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_52:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_53:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_54:
pop ebx
pop eax
idiv ebx
xchg eax, edx
xor edx, edx
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_55:
pop eax
neg eax
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_56:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_57:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_toString_II_Ljava_lang_String_line_58:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_59:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_60:
pop ebx
pop eax
idiv ebx
xor edx, edx
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_61:
pop eax
mov dword [ebp+4*3], eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_62:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_63:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_64:
pop eax
neg eax
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_65:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_Integer_toString_II_Ljava_lang_String_line_43
function_java_lang_Integer_toString_II_Ljava_lang_String_line_68:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_69:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_71:
mov eax, dword [java_lang_Integer_digits]
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_74:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_75:
pop eax
neg eax
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_76:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_77:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_toString_II_Ljava_lang_String_line_78:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_79:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_Integer_toString_II_Ljava_lang_String_line_91
function_java_lang_Integer_toString_II_Ljava_lang_String_line_82:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_83:
mov eax, dword [ebp-4*3]
push eax
mov eax, 255
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*3], eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_86:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_88:
mov eax, 45
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_90:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_toString_II_Ljava_lang_String_line_91:
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_94:
pop eax
push eax
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_95:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_96:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_98:
mov eax, 33
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_100:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_102:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_Integer_toString_II_Ljava_lang_String_line_103:
call function_java_lang_String_$init$__CII_V_line_start
add esp, 4*4
function_java_lang_Integer_toString_II_Ljava_lang_String_line_106:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_Integer_toString_II_Ljava_lang_String_line_exit
function_java_lang_Integer_toString_II_Ljava_lang_String_line_exit:
push eax
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [toHexString_I_Ljava_lang_String] (P:1 - 1;L:0 - 0)
function_java_lang_Integer_toHexString_I_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_toHexString_I_Ljava_lang_String_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_toHexString_I_Ljava_lang_String_line_1:
mov eax, 4
push eax
function_java_lang_Integer_toHexString_I_Ljava_lang_String_line_2:
call function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_start
add esp, 4*2
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_Integer_toHexString_I_Ljava_lang_String_line_5:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_Integer_toHexString_I_Ljava_lang_String_line_exit
function_java_lang_Integer_toHexString_I_Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [toOctalString_I_Ljava_lang_String] (P:1 - 1;L:0 - 0)
function_java_lang_Integer_toOctalString_I_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_toOctalString_I_Ljava_lang_String_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_toOctalString_I_Ljava_lang_String_line_1:
mov eax, 3
push eax
function_java_lang_Integer_toOctalString_I_Ljava_lang_String_line_2:
call function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_start
add esp, 4*2
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_Integer_toOctalString_I_Ljava_lang_String_line_5:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_Integer_toOctalString_I_Ljava_lang_String_line_exit
function_java_lang_Integer_toOctalString_I_Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [toBinaryString_I_Ljava_lang_String] (P:1 - 1;L:0 - 0)
function_java_lang_Integer_toBinaryString_I_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_toBinaryString_I_Ljava_lang_String_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_toBinaryString_I_Ljava_lang_String_line_1:
mov eax, 1
push eax
function_java_lang_Integer_toBinaryString_I_Ljava_lang_String_line_2:
call function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_start
add esp, 4*2
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_Integer_toBinaryString_I_Ljava_lang_String_line_5:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_Integer_toBinaryString_I_Ljava_lang_String_line_exit
function_java_lang_Integer_toBinaryString_I_Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [toUnsignedString_II_Ljava_lang_String] (P:2 - 2;L:4 - 4)
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
sub esp, 4*4
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
mov dword [esp+4*2], 0
mov dword [esp+4*3], 0
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_0:
mov eax, 32
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_2:
pop ecx
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_4:
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*1], eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_5:
mov eax, 32
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_7:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_8:
mov eax, 1
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_9:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_10:
pop ebx
pop eax
mov cl, bl
shl eax, cl
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_11:
pop eax
mov dword [ebp-4*3], eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_13:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_15:
mov eax, 1
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_16:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_17:
pop eax
mov dword [ebp-4*4], eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_19:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_20:
mov eax, dword [ebp-4*2]
push eax
mov eax, 255
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*2], eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_23:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_24:
mov eax, dword [java_lang_Integer_digits]
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_27:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_28:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_30:
pop ebx
pop eax
and eax, ebx
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_31:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_32:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_33:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_34:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_35:
pop ebx
pop eax
mov cl, bl
shr eax, cl
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_36:
pop eax
mov dword [ebp+4*3], eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_37:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_38:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_19
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_41:
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_44:
pop eax
push eax
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_45:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_46:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_47:
mov eax, 32
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_49:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_50:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_51:
call function_java_lang_String_$init$__CII_V_line_start
add esp, 4*4
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_54:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_exit
function_java_lang_Integer_toUnsignedString_II_Ljava_lang_String_line_exit:
push eax
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [toString_I_Ljava_lang_String] (P:1 - 1;L:0 - 0)
function_java_lang_Integer_toString_I_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_toString_I_Ljava_lang_String_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_toString_I_Ljava_lang_String_line_1:
mov eax, 10
push eax
function_java_lang_Integer_toString_I_Ljava_lang_String_line_3:
call function_java_lang_Integer_toString_II_Ljava_lang_String_line_start
add esp, 4*2
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_Integer_toString_I_Ljava_lang_String_line_6:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_Integer_toString_I_Ljava_lang_String_line_exit
function_java_lang_Integer_toString_I_Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [parseInt_Ljava_lang_StringI_I] (P:2 - 2;L:9 - 9)
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_start:
push ebp
mov ebp, esp
sub esp, 4*9
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
mov dword [esp+4*2], 0
mov dword [esp+4*3], 0
mov dword [esp+4*4], 0
mov dword [esp+4*5], 0
mov dword [esp+4*6], 0
mov dword [esp+4*7], 0
mov dword [esp+4*8], 0
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_1:
pop eax
cmp eax, 0
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_6
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_4:
mov eax, -1
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_5:
pop eax
jmp function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_exit
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_6:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_7:
mov eax, 2
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_8:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_13
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_11:
mov eax, -1
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_12:
pop eax
jmp function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_exit
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_13:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_14:
mov eax, 36
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_16:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_21
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_19:
mov eax, -1
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_20:
pop eax
jmp function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_exit
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_21:
mov eax, 0
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_22:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_23:
mov eax, 0
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_24:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_25:
mov eax, 0
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_26:
pop eax
mov dword [ebp-4*3], eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_28:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_29:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:length__I
add eax, 4*5
call dword [eax] ;java_lang_String.length__I
add esp, 4*1
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_32:
pop eax
mov dword [ebp-4*4], eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_34:
mov eax, -2147483647
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_36:
pop eax
mov dword [ebp-4*5], eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_38:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_40:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_162
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_43:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_44:
mov eax, 0
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_45:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:charAt_I_C
add eax, 4*7
call dword [eax] ;java_lang_String.charAt_I_C
add esp, 4*2
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_48:
pop eax
mov dword [ebp-4*8], eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_50:
mov eax, dword [ebp-4*8]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_52:
mov eax, 48
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_54:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_93
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_57:
mov eax, dword [ebp-4*8]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_59:
mov eax, 45
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_61:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_73
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_64:
mov eax, 1
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_65:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_66:
mov eax, -2147483648
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_68:
pop eax
mov dword [ebp-4*5], eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_70:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_82
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_73:
mov eax, dword [ebp-4*8]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_75:
mov eax, 43
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_77:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_82
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_80:
mov eax, -1
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_81:
pop eax
jmp function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_exit
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_82:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_84:
mov eax, 1
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_85:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_90
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_88:
mov eax, -1
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_89:
pop eax
jmp function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_exit
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_90:
mov eax, dword [ebp-4*3]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*3], eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_93:
mov eax, dword [ebp-4*5]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_95:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_96:
pop ebx
pop eax
idiv ebx
xor edx, edx
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_97:
pop eax
mov dword [ebp-4*6], eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_99:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_152
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_102:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_103:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_105:
mov eax, dword [ebp-4*3]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*3], eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_108:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:charAt_I_C
add eax, 4*7
call dword [eax] ;java_lang_String.charAt_I_C
add esp, 4*2
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_111:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_112:
call function_java_lang_Character_digit_CI_I_line_start
add esp, 4*2
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_115:
pop eax
mov dword [ebp-4*7], eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_117:
mov eax, dword [ebp-4*7]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_119:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_124
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_122:
mov eax, -1
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_123:
pop eax
jmp function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_exit
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_124:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_125:
mov eax, dword [ebp-4*6]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_127:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_132
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_130:
mov eax, -1
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_131:
pop eax
jmp function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_exit
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_132:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_133:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_134:
pop ebx
pop eax
imul eax, ebx
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_135:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_136:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_137:
mov eax, dword [ebp-4*5]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_139:
mov eax, dword [ebp-4*7]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_141:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_142:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_147
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_145:
mov eax, -1
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_146:
pop eax
jmp function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_exit
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_147:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_148:
mov eax, dword [ebp-4*7]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_150:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_151:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_152:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_154:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_156:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_102
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_159:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_164
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_162:
mov eax, -1
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_163:
pop eax
jmp function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_exit
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_164:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_165:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_172
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_168:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_169:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_174
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_172:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_173:
pop eax
neg eax
push eax
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_174:
pop eax
jmp function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_exit
function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [parseInt_Ljava_lang_String_I] (P:1 - 1;L:0 - 0)
function_java_lang_Integer_parseInt_Ljava_lang_String_I_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_parseInt_Ljava_lang_String_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_parseInt_Ljava_lang_String_I_line_1:
mov eax, 10
push eax
function_java_lang_Integer_parseInt_Ljava_lang_String_I_line_3:
call function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_start
add esp, 4*2
push eax
function_java_lang_Integer_parseInt_Ljava_lang_String_I_line_6:
pop eax
jmp function_java_lang_Integer_parseInt_Ljava_lang_String_I_line_exit
function_java_lang_Integer_parseInt_Ljava_lang_String_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [valueOf_Ljava_lang_StringI_Ljava_lang_Integer] (P:2 - 2;L:0 - 0)
function_java_lang_Integer_valueOf_Ljava_lang_StringI_Ljava_lang_Integer_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_valueOf_Ljava_lang_StringI_Ljava_lang_Integer_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Integer_valueOf_Ljava_lang_StringI_Ljava_lang_Integer_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_valueOf_Ljava_lang_StringI_Ljava_lang_Integer_line_2:
call function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_start
add esp, 4*2
push eax
function_java_lang_Integer_valueOf_Ljava_lang_StringI_Ljava_lang_Integer_line_5:
call function_java_lang_Integer_valueOf_I_Ljava_lang_Integer_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_Integer_valueOf_Ljava_lang_StringI_Ljava_lang_Integer_line_8:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_Integer_valueOf_Ljava_lang_StringI_Ljava_lang_Integer_line_exit
function_java_lang_Integer_valueOf_Ljava_lang_StringI_Ljava_lang_Integer_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [valueOf_Ljava_lang_String_Ljava_lang_Integer] (P:1 - 1;L:0 - 0)
function_java_lang_Integer_valueOf_Ljava_lang_String_Ljava_lang_Integer_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_valueOf_Ljava_lang_String_Ljava_lang_Integer_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Integer_valueOf_Ljava_lang_String_Ljava_lang_Integer_line_1:
mov eax, 10
push eax
function_java_lang_Integer_valueOf_Ljava_lang_String_Ljava_lang_Integer_line_3:
call function_java_lang_Integer_parseInt_Ljava_lang_StringI_I_line_start
add esp, 4*2
push eax
function_java_lang_Integer_valueOf_Ljava_lang_String_Ljava_lang_Integer_line_6:
call function_java_lang_Integer_valueOf_I_Ljava_lang_Integer_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_Integer_valueOf_Ljava_lang_String_Ljava_lang_Integer_line_9:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_Integer_valueOf_Ljava_lang_String_Ljava_lang_Integer_line_exit
function_java_lang_Integer_valueOf_Ljava_lang_String_Ljava_lang_Integer_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$destroy$] (P:1 - 1;L:0 - 0)
function_java_lang_Integer_$destroy$_line_start:
push ebp
mov ebp, esp
mov ebx, [ebp+4*2]
function_java_lang_Integer_$destroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [$cldestroy$] (P:0 - 0;L:0 - 0)
function_java_lang_Integer_$cldestroy$_line_start:
push ebp
mov ebp, esp
function_java_lang_Integer_$cldestroy$_line_0:
mov eax, [java_lang_Integer_digits]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
function_java_lang_Integer_$cldestroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;=================================================
;Starting function [$init$__V] (P:1 - 1;L:0 - 0)
function_java_lang_StringBuilder_$init$__V_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_$init$__V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_$init$__V_line_1:
mov eax, 16
push eax
function_java_lang_StringBuilder_$init$__V_line_3:
call function_java_lang_StringBuilder_$init$_I_V_line_start
add esp, 4*2
function_java_lang_StringBuilder_$init$__V_line_6:
jmp function_java_lang_StringBuilder_$init$__V_line_exit
function_java_lang_StringBuilder_$init$__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$init$_I_V] (P:2 - 2;L:0 - 0)
function_java_lang_StringBuilder_$init$_I_V_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_$init$_I_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_$init$_I_V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_java_lang_StringBuilder_$init$_I_V_line_4:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_$init$_I_V_line_5:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_$init$_I_V_line_6:
pop ecx
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
push eax
function_java_lang_StringBuilder_$init$_I_V_line_8:
pop eax
pop ebx
push ebx
push eax
mov eax, dword [ebx+8]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
pop ebx
mov dword [ebx+8], eax
function_java_lang_StringBuilder_$init$_I_V_line_11:
jmp function_java_lang_StringBuilder_$init$_I_V_line_exit
function_java_lang_StringBuilder_$init$_I_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$init$_Ljava_lang_StringBuilder_V] (P:2 - 2;L:0 - 0)
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_4:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_5:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_6:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_9:
pop eax
pop ebx
mov dword [ebx+12], eax
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_12:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_13:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_14:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_17:
mov eax, 16
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_19:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_20:
pop ecx
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_22:
pop eax
pop ebx
push ebx
push eax
mov eax, dword [ebx+8]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
pop ebx
mov dword [ebx+8], eax
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_25:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_26:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_29:
mov eax, 0
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_30:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_31:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_34:
mov eax, 0
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_35:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_36:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_39:
call function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_start
add esp, 4*5
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_42:
jmp function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_exit
function_java_lang_StringBuilder_$init$_Ljava_lang_StringBuilder_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$init$_Ljava_lang_String_V] (P:2 - 2;L:0 - 0)
function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_4:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_5:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_6:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:length__I
add eax, 4*5
call dword [eax] ;java_lang_String.length__I
add esp, 4*1
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_9:
pop eax
pop ebx
mov dword [ebx+12], eax
function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_12:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_13:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_14:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_17:
mov eax, 16
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_19:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_20:
pop ecx
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_22:
pop eax
pop ebx
push ebx
push eax
mov eax, dword [ebx+8]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
pop ebx
mov dword [ebx+8], eax
function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_25:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_26:
mov eax, 0
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_27:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_28:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_31:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_32:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_35:
mov eax, 0
push eax
function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_36:
mov eax, dword [esp+4*4]
mov eax, dword [eax] ;VFC:getChars_II_CI_V
add eax, 4*14
call dword [eax] ;java_lang_String.getChars_II_CI_V
add esp, 4*5
function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_39:
jmp function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_exit
function_java_lang_StringBuilder_$init$_Ljava_lang_String_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [enlargeBuffer_I_V] (P:2 - 2;L:2 - 2)
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_start:
push ebp
mov ebp, esp
sub esp, 4*2
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_1:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_4:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_5:
mov eax, 1
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_6:
pop ebx
pop eax
mov cl, bl
sar eax, cl
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_7:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_8:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_11:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_12:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_13:
mov eax, 2
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_14:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_15:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_16:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_17:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_18:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_StringBuilder_enlargeBuffer_I_V_line_25
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_21:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_22:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_StringBuilder_enlargeBuffer_I_V_line_26
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_25:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_26:
pop ecx
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_28:
mov eax, dword [ebp-4*2]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*2], eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_29:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_30:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_33:
mov eax, 0
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_34:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_35:
mov eax, 0
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_36:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_37:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_40:
call function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_start
add esp, 4*5
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_43:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_44:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_45:
pop eax
pop ebx
push ebx
push eax
mov eax, dword [ebx+8]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
pop ebx
mov dword [ebx+8], eax
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_48:
jmp function_java_lang_StringBuilder_enlargeBuffer_I_V_line_exit
function_java_lang_StringBuilder_enlargeBuffer_I_V_line_exit:
push eax
mov eax, dword [ebp-4*2]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [appendNull__V] (P:1 - 1;L:1 - 1)
function_java_lang_StringBuilder_appendNull__V_line_start:
push ebp
mov ebp, esp
sub esp, 4*1
mov dword [esp+4*0], 0
function_java_lang_StringBuilder_appendNull__V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_appendNull__V_line_1:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_appendNull__V_line_4:
mov eax, 4
push eax
function_java_lang_StringBuilder_appendNull__V_line_5:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_appendNull__V_line_6:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_StringBuilder_appendNull__V_line_7:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_appendNull__V_line_8:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_appendNull__V_line_9:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_appendNull__V_line_12:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_StringBuilder_appendNull__V_line_13:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_StringBuilder_appendNull__V_line_21
function_java_lang_StringBuilder_appendNull__V_line_16:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_appendNull__V_line_17:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_appendNull__V_line_18:
call function_java_lang_StringBuilder_enlargeBuffer_I_V_line_start
add esp, 4*2
function_java_lang_StringBuilder_appendNull__V_line_21:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_appendNull__V_line_22:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_appendNull__V_line_25:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_appendNull__V_line_26:
pop eax
push eax
push eax
function_java_lang_StringBuilder_appendNull__V_line_27:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_appendNull__V_line_30:
pop ebx
pop eax
push eax
push ebx
push eax
function_java_lang_StringBuilder_appendNull__V_line_31:
mov eax, 1
push eax
function_java_lang_StringBuilder_appendNull__V_line_32:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_appendNull__V_line_33:
pop eax
pop ebx
mov dword [ebx+12], eax
function_java_lang_StringBuilder_appendNull__V_line_36:
mov eax, 110
push eax
function_java_lang_StringBuilder_appendNull__V_line_38:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_StringBuilder_appendNull__V_line_39:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_appendNull__V_line_40:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_appendNull__V_line_43:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_appendNull__V_line_44:
pop eax
push eax
push eax
function_java_lang_StringBuilder_appendNull__V_line_45:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_appendNull__V_line_48:
pop ebx
pop eax
push eax
push ebx
push eax
function_java_lang_StringBuilder_appendNull__V_line_49:
mov eax, 1
push eax
function_java_lang_StringBuilder_appendNull__V_line_50:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_appendNull__V_line_51:
pop eax
pop ebx
mov dword [ebx+12], eax
function_java_lang_StringBuilder_appendNull__V_line_54:
mov eax, 117
push eax
function_java_lang_StringBuilder_appendNull__V_line_56:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_StringBuilder_appendNull__V_line_57:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_appendNull__V_line_58:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_appendNull__V_line_61:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_appendNull__V_line_62:
pop eax
push eax
push eax
function_java_lang_StringBuilder_appendNull__V_line_63:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_appendNull__V_line_66:
pop ebx
pop eax
push eax
push ebx
push eax
function_java_lang_StringBuilder_appendNull__V_line_67:
mov eax, 1
push eax
function_java_lang_StringBuilder_appendNull__V_line_68:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_appendNull__V_line_69:
pop eax
pop ebx
mov dword [ebx+12], eax
function_java_lang_StringBuilder_appendNull__V_line_72:
mov eax, 108
push eax
function_java_lang_StringBuilder_appendNull__V_line_74:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_StringBuilder_appendNull__V_line_75:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_appendNull__V_line_76:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_appendNull__V_line_79:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_appendNull__V_line_80:
pop eax
push eax
push eax
function_java_lang_StringBuilder_appendNull__V_line_81:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_appendNull__V_line_84:
pop ebx
pop eax
push eax
push ebx
push eax
function_java_lang_StringBuilder_appendNull__V_line_85:
mov eax, 1
push eax
function_java_lang_StringBuilder_appendNull__V_line_86:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_appendNull__V_line_87:
pop eax
pop ebx
mov dword [ebx+12], eax
function_java_lang_StringBuilder_appendNull__V_line_90:
mov eax, 108
push eax
function_java_lang_StringBuilder_appendNull__V_line_92:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_StringBuilder_appendNull__V_line_93:
jmp function_java_lang_StringBuilder_appendNull__V_line_exit
function_java_lang_StringBuilder_appendNull__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [append0__C_V] (P:2 - 2;L:1 - 1)
function_java_lang_StringBuilder_append0__C_V_line_start:
push ebp
mov ebp, esp
sub esp, 4*1
mov dword [esp+4*0], 0
function_java_lang_StringBuilder_append0__C_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append0__C_V_line_1:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_append0__C_V_line_4:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_append0__C_V_line_5:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_StringBuilder_append0__C_V_line_6:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_append0__C_V_line_7:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_StringBuilder_append0__C_V_line_8:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_append0__C_V_line_9:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append0__C_V_line_10:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_append0__C_V_line_13:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_StringBuilder_append0__C_V_line_14:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_StringBuilder_append0__C_V_line_22
function_java_lang_StringBuilder_append0__C_V_line_17:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append0__C_V_line_18:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_append0__C_V_line_19:
call function_java_lang_StringBuilder_enlargeBuffer_I_V_line_start
add esp, 4*2
function_java_lang_StringBuilder_append0__C_V_line_22:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_append0__C_V_line_23:
mov eax, 0
push eax
function_java_lang_StringBuilder_append0__C_V_line_24:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append0__C_V_line_25:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_append0__C_V_line_28:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append0__C_V_line_29:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_append0__C_V_line_32:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_append0__C_V_line_33:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_StringBuilder_append0__C_V_line_34:
call function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_start
add esp, 4*5
function_java_lang_StringBuilder_append0__C_V_line_37:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append0__C_V_line_38:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_append0__C_V_line_39:
pop eax
pop ebx
mov dword [ebx+12], eax
function_java_lang_StringBuilder_append0__C_V_line_42:
jmp function_java_lang_StringBuilder_append0__C_V_line_exit
function_java_lang_StringBuilder_append0__C_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [append0__CII_V] (P:4 - 4;L:1 - 1)
function_java_lang_StringBuilder_append0__CII_V_line_start:
push ebp
mov ebp, esp
sub esp, 4*1
mov dword [esp+4*0], 0
function_java_lang_StringBuilder_append0__CII_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_1:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_2:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_3:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jg  function_java_lang_StringBuilder_append0__CII_V_line_10
function_java_lang_StringBuilder_append0__CII_V_line_6:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_7:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_StringBuilder_append0__CII_V_line_11
function_java_lang_StringBuilder_append0__CII_V_line_10:
jmp function_java_lang_StringBuilder_append0__CII_V_line_exit
function_java_lang_StringBuilder_append0__CII_V_line_11:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_12:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_StringBuilder_append0__CII_V_line_23
function_java_lang_StringBuilder_append0__CII_V_line_15:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_16:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_17:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_18:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_append0__CII_V_line_19:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_20:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_StringBuilder_append0__CII_V_line_24
function_java_lang_StringBuilder_append0__CII_V_line_23:
jmp function_java_lang_StringBuilder_append0__CII_V_line_exit
function_java_lang_StringBuilder_append0__CII_V_line_24:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_25:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_28:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_29:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_append0__CII_V_line_30:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_StringBuilder_append0__CII_V_line_32:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_34:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_35:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_38:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_39:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_StringBuilder_append0__CII_V_line_48
function_java_lang_StringBuilder_append0__CII_V_line_42:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_43:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_45:
call function_java_lang_StringBuilder_enlargeBuffer_I_V_line_start
add esp, 4*2
function_java_lang_StringBuilder_append0__CII_V_line_48:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_49:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_50:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_51:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_54:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_55:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_58:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_59:
call function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_start
add esp, 4*5
function_java_lang_StringBuilder_append0__CII_V_line_62:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_63:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_append0__CII_V_line_65:
pop eax
pop ebx
mov dword [ebx+12], eax
function_java_lang_StringBuilder_append0__CII_V_line_68:
jmp function_java_lang_StringBuilder_append0__CII_V_line_exit
function_java_lang_StringBuilder_append0__CII_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [append0_C_V] (P:2 - 2;L:0 - 0)
function_java_lang_StringBuilder_append0_C_V_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_append0_C_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append0_C_V_line_1:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_append0_C_V_line_4:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append0_C_V_line_5:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_append0_C_V_line_8:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_StringBuilder_append0_C_V_line_9:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_StringBuilder_append0_C_V_line_22
function_java_lang_StringBuilder_append0_C_V_line_12:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append0_C_V_line_13:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append0_C_V_line_14:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_append0_C_V_line_17:
mov eax, 1
push eax
function_java_lang_StringBuilder_append0_C_V_line_18:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_append0_C_V_line_19:
call function_java_lang_StringBuilder_enlargeBuffer_I_V_line_start
add esp, 4*2
function_java_lang_StringBuilder_append0_C_V_line_22:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append0_C_V_line_23:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_append0_C_V_line_26:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append0_C_V_line_27:
pop eax
push eax
push eax
function_java_lang_StringBuilder_append0_C_V_line_28:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_append0_C_V_line_31:
pop ebx
pop eax
push eax
push ebx
push eax
function_java_lang_StringBuilder_append0_C_V_line_32:
mov eax, 1
push eax
function_java_lang_StringBuilder_append0_C_V_line_33:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_append0_C_V_line_34:
pop eax
pop ebx
mov dword [ebx+12], eax
function_java_lang_StringBuilder_append0_C_V_line_37:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_append0_C_V_line_38:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_StringBuilder_append0_C_V_line_39:
jmp function_java_lang_StringBuilder_append0_C_V_line_exit
function_java_lang_StringBuilder_append0_C_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [append0_Ljava_lang_String_V] (P:2 - 2;L:2 - 2)
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_start:
push ebp
mov ebp, esp
sub esp, 4*2
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_1:
pop eax
cmp eax, 0
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_9
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_4:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_5:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:appendNull__V
add eax, 4*6
call dword [eax] ;java_lang_StringBuilder.appendNull__V
add esp, 4*1
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_8:
jmp function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_exit
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_9:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_10:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:length__I
add eax, 4*5
call dword [eax] ;java_lang_String.length__I
add esp, 4*1
push eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_13:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_14:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_15:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_18:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_19:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_20:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_21:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_22:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_23:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_26:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_27:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_35
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_30:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_31:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_32:
call function_java_lang_StringBuilder_enlargeBuffer_I_V_line_start
add esp, 4*2
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_35:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_36:
mov eax, 0
push eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_37:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_38:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_39:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_42:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_43:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_46:
mov eax, dword [esp+4*4]
mov eax, dword [eax] ;VFC:getChars_II_CI_V
add eax, 4*14
call dword [eax] ;java_lang_String.getChars_II_CI_V
add esp, 4*5
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_49:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_50:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_51:
pop eax
pop ebx
mov dword [ebx+12], eax
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_54:
jmp function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_exit
function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [delete0_II_V] (P:3 - 3;L:1 - 1)
function_java_lang_StringBuilder_delete0_II_V_line_start:
push ebp
mov ebp, esp
sub esp, 4*1
mov dword [esp+4*0], 0
function_java_lang_StringBuilder_delete0_II_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_1:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_StringBuilder_delete0_II_V_line_66
function_java_lang_StringBuilder_delete0_II_V_line_4:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_5:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_6:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_9:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_StringBuilder_delete0_II_V_line_17
function_java_lang_StringBuilder_delete0_II_V_line_12:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_13:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_16:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_StringBuilder_delete0_II_V_line_17:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_18:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_19:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_StringBuilder_delete0_II_V_line_23
function_java_lang_StringBuilder_delete0_II_V_line_22:
jmp function_java_lang_StringBuilder_delete0_II_V_line_exit
function_java_lang_StringBuilder_delete0_II_V_line_23:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_24:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_25:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_StringBuilder_delete0_II_V_line_66
function_java_lang_StringBuilder_delete0_II_V_line_28:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_29:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_32:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_33:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_delete0_II_V_line_34:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_StringBuilder_delete0_II_V_line_35:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_36:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_StringBuilder_delete0_II_V_line_53
function_java_lang_StringBuilder_delete0_II_V_line_39:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_40:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_43:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_44:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_45:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_48:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_49:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_50:
call function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_start
add esp, 4*5
function_java_lang_StringBuilder_delete0_II_V_line_53:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_54:
pop eax
push eax
push eax
function_java_lang_StringBuilder_delete0_II_V_line_55:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_58:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_59:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_delete0_II_V_line_60:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_delete0_II_V_line_61:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_delete0_II_V_line_62:
pop eax
pop ebx
mov dword [ebx+12], eax
function_java_lang_StringBuilder_delete0_II_V_line_65:
jmp function_java_lang_StringBuilder_delete0_II_V_line_exit
function_java_lang_StringBuilder_delete0_II_V_line_66:
jmp function_java_lang_StringBuilder_delete0_II_V_line_exit
function_java_lang_StringBuilder_delete0_II_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [deleteCharAt0_I_V] (P:2 - 2;L:1 - 1)
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_start:
push ebp
mov ebp, esp
sub esp, 4*1
mov dword [esp+4*0], 0
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_1:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_StringBuilder_deleteCharAt0_I_V_line_12
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_4:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_5:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_6:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_9:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_StringBuilder_deleteCharAt0_I_V_line_13
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_12:
jmp function_java_lang_StringBuilder_deleteCharAt0_I_V_line_exit
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_13:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_14:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_17:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_18:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_19:
mov eax, 1
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_20:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_21:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_22:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_23:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_StringBuilder_deleteCharAt0_I_V_line_42
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_26:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_27:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_30:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_31:
mov eax, 1
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_32:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_33:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_34:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_37:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_38:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_39:
call function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_start
add esp, 4*5
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_42:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_43:
pop eax
push eax
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_44:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_47:
mov eax, 1
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_48:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_49:
pop eax
pop ebx
mov dword [ebx+12], eax
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_52:
jmp function_java_lang_StringBuilder_deleteCharAt0_I_V_line_exit
function_java_lang_StringBuilder_deleteCharAt0_I_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [ensureCapacity_I_V] (P:2 - 2;L:1 - 1)
function_java_lang_StringBuilder_ensureCapacity_I_V_line_start:
push ebp
mov ebp, esp
sub esp, 4*1
mov dword [esp+4*0], 0
function_java_lang_StringBuilder_ensureCapacity_I_V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_ensureCapacity_I_V_line_1:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_ensureCapacity_I_V_line_2:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_ensureCapacity_I_V_line_5:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_StringBuilder_ensureCapacity_I_V_line_6:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_StringBuilder_ensureCapacity_I_V_line_33
function_java_lang_StringBuilder_ensureCapacity_I_V_line_9:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_ensureCapacity_I_V_line_10:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_ensureCapacity_I_V_line_13:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_StringBuilder_ensureCapacity_I_V_line_14:
mov eax, 1
push eax
function_java_lang_StringBuilder_ensureCapacity_I_V_line_15:
pop ebx
pop eax
mov cl, bl
shl eax, cl
push eax
function_java_lang_StringBuilder_ensureCapacity_I_V_line_16:
mov eax, 2
push eax
function_java_lang_StringBuilder_ensureCapacity_I_V_line_17:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_ensureCapacity_I_V_line_18:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_StringBuilder_ensureCapacity_I_V_line_19:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_ensureCapacity_I_V_line_20:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_ensureCapacity_I_V_line_21:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_ensureCapacity_I_V_line_22:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_StringBuilder_ensureCapacity_I_V_line_29
function_java_lang_StringBuilder_ensureCapacity_I_V_line_25:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_ensureCapacity_I_V_line_26:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_StringBuilder_ensureCapacity_I_V_line_30
function_java_lang_StringBuilder_ensureCapacity_I_V_line_29:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_ensureCapacity_I_V_line_30:
call function_java_lang_StringBuilder_enlargeBuffer_I_V_line_start
add esp, 4*2
function_java_lang_StringBuilder_ensureCapacity_I_V_line_33:
jmp function_java_lang_StringBuilder_ensureCapacity_I_V_line_exit
function_java_lang_StringBuilder_ensureCapacity_I_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [getChars_II_CI_V] (P:5 - 5;L:0 - 0)
function_java_lang_StringBuilder_getChars_II_CI_V_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_getChars_II_CI_V_line_0:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_getChars_II_CI_V_line_1:
mov eax, dword [ebp+4*6]
push eax
function_java_lang_StringBuilder_getChars_II_CI_V_line_2:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_getChars_II_CI_V_line_5:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jg  function_java_lang_StringBuilder_getChars_II_CI_V_line_21
function_java_lang_StringBuilder_getChars_II_CI_V_line_8:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_getChars_II_CI_V_line_9:
mov eax, dword [ebp+4*6]
push eax
function_java_lang_StringBuilder_getChars_II_CI_V_line_10:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_getChars_II_CI_V_line_13:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jg  function_java_lang_StringBuilder_getChars_II_CI_V_line_21
function_java_lang_StringBuilder_getChars_II_CI_V_line_16:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_getChars_II_CI_V_line_17:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_getChars_II_CI_V_line_18:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_StringBuilder_getChars_II_CI_V_line_22
function_java_lang_StringBuilder_getChars_II_CI_V_line_21:
jmp function_java_lang_StringBuilder_getChars_II_CI_V_line_exit
function_java_lang_StringBuilder_getChars_II_CI_V_line_22:
mov eax, dword [ebp+4*6]
push eax
function_java_lang_StringBuilder_getChars_II_CI_V_line_23:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_getChars_II_CI_V_line_26:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_getChars_II_CI_V_line_27:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_getChars_II_CI_V_line_28:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_getChars_II_CI_V_line_30:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_getChars_II_CI_V_line_31:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_getChars_II_CI_V_line_32:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_getChars_II_CI_V_line_33:
call function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_start
add esp, 4*5
function_java_lang_StringBuilder_getChars_II_CI_V_line_36:
jmp function_java_lang_StringBuilder_getChars_II_CI_V_line_exit
function_java_lang_StringBuilder_getChars_II_CI_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [insert0_I_C_V] (P:3 - 3;L:0 - 0)
function_java_lang_StringBuilder_insert0_I_C_V_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_insert0_I_C_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_insert0_I_C_V_line_1:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_StringBuilder_insert0_I_C_V_line_12
function_java_lang_StringBuilder_insert0_I_C_V_line_4:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_insert0_I_C_V_line_5:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert0_I_C_V_line_6:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_insert0_I_C_V_line_9:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_StringBuilder_insert0_I_C_V_line_13
function_java_lang_StringBuilder_insert0_I_C_V_line_12:
jmp function_java_lang_StringBuilder_insert0_I_C_V_line_exit
function_java_lang_StringBuilder_insert0_I_C_V_line_13:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert0_I_C_V_line_14:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_StringBuilder_insert0_I_C_V_line_15:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_StringBuilder_insert0_I_C_V_line_45
function_java_lang_StringBuilder_insert0_I_C_V_line_18:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert0_I_C_V_line_19:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert0_I_C_V_line_20:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_StringBuilder_insert0_I_C_V_line_21:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_insert0_I_C_V_line_22:
call function_java_lang_StringBuilder_move_II_V_line_start
add esp, 4*3
function_java_lang_StringBuilder_insert0_I_C_V_line_25:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert0_I_C_V_line_26:
mov eax, 0
push eax
function_java_lang_StringBuilder_insert0_I_C_V_line_27:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert0_I_C_V_line_28:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_insert0_I_C_V_line_29:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert0_I_C_V_line_30:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_StringBuilder_insert0_I_C_V_line_31:
call function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_start
add esp, 4*5
function_java_lang_StringBuilder_insert0_I_C_V_line_34:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert0_I_C_V_line_35:
pop eax
push eax
push eax
function_java_lang_StringBuilder_insert0_I_C_V_line_36:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_insert0_I_C_V_line_39:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert0_I_C_V_line_40:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_StringBuilder_insert0_I_C_V_line_41:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_insert0_I_C_V_line_42:
pop eax
pop ebx
mov dword [ebx+12], eax
function_java_lang_StringBuilder_insert0_I_C_V_line_45:
jmp function_java_lang_StringBuilder_insert0_I_C_V_line_exit
function_java_lang_StringBuilder_insert0_I_C_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [insert0_I_CII_V] (P:5 - 5;L:0 - 0)
function_java_lang_StringBuilder_insert0_I_CII_V_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_insert0_I_CII_V_line_0:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_1:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_StringBuilder_insert0_I_CII_V_line_65
function_java_lang_StringBuilder_insert0_I_CII_V_line_4:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_5:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_7:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jg  function_java_lang_StringBuilder_insert0_I_CII_V_line_65
function_java_lang_StringBuilder_insert0_I_CII_V_line_10:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_11:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_StringBuilder_insert0_I_CII_V_line_64
function_java_lang_StringBuilder_insert0_I_CII_V_line_14:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_16:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_StringBuilder_insert0_I_CII_V_line_64
function_java_lang_StringBuilder_insert0_I_CII_V_line_19:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_21:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_22:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_23:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_24:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_25:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jg  function_java_lang_StringBuilder_insert0_I_CII_V_line_64
function_java_lang_StringBuilder_insert0_I_CII_V_line_28:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_30:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_StringBuilder_insert0_I_CII_V_line_63
function_java_lang_StringBuilder_insert0_I_CII_V_line_33:
mov eax, dword [ebp+4*6]
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_34:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_36:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_37:
call function_java_lang_StringBuilder_move_II_V_line_start
add esp, 4*3
function_java_lang_StringBuilder_insert0_I_CII_V_line_40:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_41:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_42:
mov eax, dword [ebp+4*6]
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_43:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_46:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_47:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_49:
call function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_start
add esp, 4*5
function_java_lang_StringBuilder_insert0_I_CII_V_line_52:
mov eax, dword [ebp+4*6]
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_53:
pop eax
push eax
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_54:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_57:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_59:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_60:
pop eax
pop ebx
mov dword [ebx+12], eax
function_java_lang_StringBuilder_insert0_I_CII_V_line_63:
jmp function_java_lang_StringBuilder_insert0_I_CII_V_line_exit
function_java_lang_StringBuilder_insert0_I_CII_V_line_64:
jmp function_java_lang_StringBuilder_insert0_I_CII_V_line_exit
function_java_lang_StringBuilder_insert0_I_CII_V_line_65:
jmp function_java_lang_StringBuilder_insert0_I_CII_V_line_exit
function_java_lang_StringBuilder_insert0_I_CII_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [insert0_IC_V] (P:3 - 3;L:0 - 0)
function_java_lang_StringBuilder_insert0_IC_V_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_insert0_IC_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_insert0_IC_V_line_1:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_StringBuilder_insert0_IC_V_line_12
function_java_lang_StringBuilder_insert0_IC_V_line_4:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_insert0_IC_V_line_5:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert0_IC_V_line_6:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_insert0_IC_V_line_9:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_StringBuilder_insert0_IC_V_line_13
function_java_lang_StringBuilder_insert0_IC_V_line_12:
jmp function_java_lang_StringBuilder_insert0_IC_V_line_exit
function_java_lang_StringBuilder_insert0_IC_V_line_13:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert0_IC_V_line_14:
mov eax, 1
push eax
function_java_lang_StringBuilder_insert0_IC_V_line_15:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_insert0_IC_V_line_16:
call function_java_lang_StringBuilder_move_II_V_line_start
add esp, 4*3
function_java_lang_StringBuilder_insert0_IC_V_line_19:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert0_IC_V_line_20:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_insert0_IC_V_line_23:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_insert0_IC_V_line_24:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert0_IC_V_line_25:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_StringBuilder_insert0_IC_V_line_26:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert0_IC_V_line_27:
pop eax
push eax
push eax
function_java_lang_StringBuilder_insert0_IC_V_line_28:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_insert0_IC_V_line_31:
mov eax, 1
push eax
function_java_lang_StringBuilder_insert0_IC_V_line_32:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_insert0_IC_V_line_33:
pop eax
pop ebx
mov dword [ebx+12], eax
function_java_lang_StringBuilder_insert0_IC_V_line_36:
jmp function_java_lang_StringBuilder_insert0_IC_V_line_exit
function_java_lang_StringBuilder_insert0_IC_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [insert0_ILjava_lang_String_V] (P:3 - 3;L:1 - 1)
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_start:
push ebp
mov ebp, esp
sub esp, 4*1
mov dword [esp+4*0], 0
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_1:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_58
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_4:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_5:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_6:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_9:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jg  function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_58
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_12:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_13:
pop eax
cmp eax, 0
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_19
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_16:
mov eax, dword [stringmap_33c587]
push eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_18:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp+4*2], eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_19:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_20:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:length__I
add eax, 4*5
call dword [eax] ;java_lang_String.length__I
add esp, 4*1
push eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_23:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_24:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_25:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_59
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_28:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_29:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_30:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_31:
call function_java_lang_StringBuilder_move_II_V_line_start
add esp, 4*3
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_34:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_35:
mov eax, 0
push eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_36:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_37:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_38:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_41:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_42:
mov eax, dword [esp+4*4]
mov eax, dword [eax] ;VFC:getChars_II_CI_V
add eax, 4*14
call dword [eax] ;java_lang_String.getChars_II_CI_V
add esp, 4*5
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_45:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_46:
pop eax
push eax
push eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_47:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_50:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_51:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_52:
pop eax
pop ebx
mov dword [ebx+12], eax
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_55:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_59
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_58:
jmp function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_exit
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_59:
jmp function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_exit
function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [move_II_V] (P:3 - 3;L:4 - 4)
function_java_lang_StringBuilder_move_II_V_line_start:
push ebp
mov ebp, esp
sub esp, 4*4
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
mov dword [esp+4*2], 0
mov dword [esp+4*3], 0
function_java_lang_StringBuilder_move_II_V_line_0:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_move_II_V_line_1:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_move_II_V_line_4:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_StringBuilder_move_II_V_line_5:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_move_II_V_line_6:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_move_II_V_line_9:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_move_II_V_line_10:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_move_II_V_line_11:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_StringBuilder_move_II_V_line_36
function_java_lang_StringBuilder_move_II_V_line_14:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_move_II_V_line_15:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_move_II_V_line_18:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_move_II_V_line_19:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_move_II_V_line_20:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_move_II_V_line_23:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_move_II_V_line_24:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_move_II_V_line_25:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_move_II_V_line_26:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_move_II_V_line_27:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_move_II_V_line_30:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_move_II_V_line_31:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_move_II_V_line_32:
call function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_start
add esp, 4*5
function_java_lang_StringBuilder_move_II_V_line_35:
jmp function_java_lang_StringBuilder_move_II_V_line_exit
function_java_lang_StringBuilder_move_II_V_line_36:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_move_II_V_line_37:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_move_II_V_line_40:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_move_II_V_line_41:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_move_II_V_line_42:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_StringBuilder_move_II_V_line_43:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_move_II_V_line_44:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_move_II_V_line_47:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_StringBuilder_move_II_V_line_48:
mov eax, 1
push eax
function_java_lang_StringBuilder_move_II_V_line_49:
pop ebx
pop eax
mov cl, bl
shl eax, cl
push eax
function_java_lang_StringBuilder_move_II_V_line_50:
mov eax, 2
push eax
function_java_lang_StringBuilder_move_II_V_line_51:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_move_II_V_line_52:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_StringBuilder_move_II_V_line_54:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_move_II_V_line_55:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_StringBuilder_move_II_V_line_57:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_StringBuilder_move_II_V_line_64
function_java_lang_StringBuilder_move_II_V_line_60:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_move_II_V_line_61:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_StringBuilder_move_II_V_line_66
function_java_lang_StringBuilder_move_II_V_line_64:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_StringBuilder_move_II_V_line_66:
pop eax
mov dword [ebp-4*3], eax
function_java_lang_StringBuilder_move_II_V_line_68:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_StringBuilder_move_II_V_line_70:
pop ecx
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
push eax
function_java_lang_StringBuilder_move_II_V_line_72:
mov eax, dword [ebp-4*4]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*4], eax
function_java_lang_StringBuilder_move_II_V_line_74:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_move_II_V_line_75:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_move_II_V_line_78:
mov eax, 0
push eax
function_java_lang_StringBuilder_move_II_V_line_79:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_StringBuilder_move_II_V_line_81:
mov eax, 0
push eax
function_java_lang_StringBuilder_move_II_V_line_82:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_move_II_V_line_83:
call function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_start
add esp, 4*5
function_java_lang_StringBuilder_move_II_V_line_86:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_move_II_V_line_87:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_move_II_V_line_90:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_move_II_V_line_91:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_StringBuilder_move_II_V_line_93:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_move_II_V_line_94:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_move_II_V_line_95:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_move_II_V_line_96:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_move_II_V_line_97:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_move_II_V_line_100:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_move_II_V_line_101:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_move_II_V_line_102:
call function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_start
add esp, 4*5
function_java_lang_StringBuilder_move_II_V_line_105:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_move_II_V_line_106:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_StringBuilder_move_II_V_line_108:
pop eax
pop ebx
push ebx
push eax
mov eax, dword [ebx+8]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
pop ebx
mov dword [ebx+8], eax
function_java_lang_StringBuilder_move_II_V_line_111:
jmp function_java_lang_StringBuilder_move_II_V_line_exit
function_java_lang_StringBuilder_move_II_V_line_exit:
push eax
mov eax, dword [ebp-4*4]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [replace0_IILjava_lang_String_V] (P:4 - 4;L:2 - 2)
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_start:
push ebp
mov ebp, esp
sub esp, 4*2
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_0:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_1:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_120
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_4:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_5:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_6:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_9:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_17
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_12:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_13:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_16:
pop eax
mov dword [ebp+4*3], eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_17:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_18:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_19:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_103
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_22:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_23:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:length__I
add eax, 4*5
call dword [eax] ;java_lang_String.length__I
add esp, 4*1
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_26:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_28:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_29:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_30:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_31:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_33:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_34:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_36:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_38:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_66
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_41:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_42:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_45:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_46:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_47:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_50:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_51:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_53:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_54:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_55:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_58:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_59:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_60:
call function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_start
add esp, 4*5
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_63:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_79
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_66:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_68:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_79
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_71:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_72:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_74:
pop eax
neg eax
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_75:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_76:
call function_java_lang_StringBuilder_move_II_V_line_start
add esp, 4*3
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_79:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_80:
mov eax, 0
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_81:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_83:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_84:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_87:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_88:
mov eax, dword [esp+4*4]
mov eax, dword [eax] ;VFC:getChars_II_CI_V
add eax, 4*14
call dword [eax] ;java_lang_String.getChars_II_CI_V
add esp, 4*5
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_91:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_92:
pop eax
push eax
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_93:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_96:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_98:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_99:
pop eax
pop ebx
mov dword [ebx+12], eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_102:
jmp function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_exit
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_103:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_104:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_105:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_120
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_108:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_109:
pop eax
cmp eax, 0
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_113
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_112:
jmp function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_exit
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_113:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_114:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_115:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_116:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:insert0_ILjava_lang_String_V
add eax, 4*18
call dword [eax] ;java_lang_StringBuilder.insert0_ILjava_lang_String_V
add esp, 4*3
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_119:
jmp function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_exit
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_120:
jmp function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_exit
function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [reverse0__V] (P:1 - 1;L:2 - 2)
function_java_lang_StringBuilder_reverse0__V_line_start:
push ebp
mov ebp, esp
sub esp, 4*2
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
function_java_lang_StringBuilder_reverse0__V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_reverse0__V_line_1:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_reverse0__V_line_4:
mov eax, 2
push eax
function_java_lang_StringBuilder_reverse0__V_line_5:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_StringBuilder_reverse0__V_line_9
function_java_lang_StringBuilder_reverse0__V_line_8:
jmp function_java_lang_StringBuilder_reverse0__V_line_exit
function_java_lang_StringBuilder_reverse0__V_line_9:
mov eax, 0
push eax
function_java_lang_StringBuilder_reverse0__V_line_10:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_StringBuilder_reverse0__V_line_11:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_StringBuilder_reverse0__V_line_57
function_java_lang_StringBuilder_reverse0__V_line_14:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_reverse0__V_line_15:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_reverse0__V_line_18:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_reverse0__V_line_19:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_reverse0__V_line_22:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_reverse0__V_line_23:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_reverse0__V_line_24:
mov eax, 1
push eax
function_java_lang_StringBuilder_reverse0__V_line_25:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_reverse0__V_line_26:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_StringBuilder_reverse0__V_line_27:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_StringBuilder_reverse0__V_line_28:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_reverse0__V_line_29:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_reverse0__V_line_32:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_reverse0__V_line_33:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_reverse0__V_line_36:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_reverse0__V_line_37:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_reverse0__V_line_38:
mov eax, 1
push eax
function_java_lang_StringBuilder_reverse0__V_line_39:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_reverse0__V_line_40:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_reverse0__V_line_41:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_reverse0__V_line_44:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_reverse0__V_line_45:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_StringBuilder_reverse0__V_line_46:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_StringBuilder_reverse0__V_line_47:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_reverse0__V_line_48:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_reverse0__V_line_51:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_reverse0__V_line_52:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_StringBuilder_reverse0__V_line_53:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_StringBuilder_reverse0__V_line_54:
mov eax, dword [ebp-4*1]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*1], eax
function_java_lang_StringBuilder_reverse0__V_line_57:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_reverse0__V_line_58:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_reverse0__V_line_59:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_reverse0__V_line_62:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_StringBuilder_reverse0__V_line_14
function_java_lang_StringBuilder_reverse0__V_line_65:
jmp function_java_lang_StringBuilder_reverse0__V_line_exit
function_java_lang_StringBuilder_reverse0__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [length__I] (P:1 - 1;L:0 - 0)
function_java_lang_StringBuilder_length__I_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_length__I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_length__I_line_1:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_length__I_line_4:
pop eax
jmp function_java_lang_StringBuilder_length__I_line_exit
function_java_lang_StringBuilder_length__I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [capacity__I] (P:1 - 1;L:0 - 0)
function_java_lang_StringBuilder_capacity__I_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_capacity__I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_capacity__I_line_1:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_capacity__I_line_4:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_StringBuilder_capacity__I_line_5:
pop eax
jmp function_java_lang_StringBuilder_capacity__I_line_exit
function_java_lang_StringBuilder_capacity__I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [getValue___C] (P:1 - 1;L:0 - 0)
function_java_lang_StringBuilder_getValue___C_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_getValue___C_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_getValue___C_line_1:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_getValue___C_line_4:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_getValue___C_line_exit
function_java_lang_StringBuilder_getValue___C_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [charAt_I_C] (P:2 - 2;L:0 - 0)
function_java_lang_StringBuilder_charAt_I_C_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_charAt_I_C_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_charAt_I_C_line_1:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_StringBuilder_charAt_I_C_line_12
function_java_lang_StringBuilder_charAt_I_C_line_4:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_charAt_I_C_line_5:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_charAt_I_C_line_6:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_charAt_I_C_line_9:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_StringBuilder_charAt_I_C_line_14
function_java_lang_StringBuilder_charAt_I_C_line_12:
mov eax, 0
push eax
function_java_lang_StringBuilder_charAt_I_C_line_13:
pop eax
jmp function_java_lang_StringBuilder_charAt_I_C_line_exit
function_java_lang_StringBuilder_charAt_I_C_line_14:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_charAt_I_C_line_15:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_charAt_I_C_line_18:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_charAt_I_C_line_19:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_StringBuilder_charAt_I_C_line_20:
pop eax
jmp function_java_lang_StringBuilder_charAt_I_C_line_exit
function_java_lang_StringBuilder_charAt_I_C_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [setCharAt_IC_V] (P:3 - 3;L:0 - 0)
function_java_lang_StringBuilder_setCharAt_IC_V_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_setCharAt_IC_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_setCharAt_IC_V_line_1:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_StringBuilder_setCharAt_IC_V_line_12
function_java_lang_StringBuilder_setCharAt_IC_V_line_4:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_setCharAt_IC_V_line_5:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_setCharAt_IC_V_line_6:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_setCharAt_IC_V_line_9:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_StringBuilder_setCharAt_IC_V_line_13
function_java_lang_StringBuilder_setCharAt_IC_V_line_12:
jmp function_java_lang_StringBuilder_setCharAt_IC_V_line_exit
function_java_lang_StringBuilder_setCharAt_IC_V_line_13:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_setCharAt_IC_V_line_14:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_setCharAt_IC_V_line_17:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_setCharAt_IC_V_line_18:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_setCharAt_IC_V_line_19:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_StringBuilder_setCharAt_IC_V_line_20:
jmp function_java_lang_StringBuilder_setCharAt_IC_V_line_exit
function_java_lang_StringBuilder_setCharAt_IC_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [setLength_I_V] (P:2 - 2;L:1 - 1)
function_java_lang_StringBuilder_setLength_I_V_line_start:
push ebp
mov ebp, esp
sub esp, 4*1
mov dword [esp+4*0], 0
function_java_lang_StringBuilder_setLength_I_V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_setLength_I_V_line_1:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_StringBuilder_setLength_I_V_line_5
function_java_lang_StringBuilder_setLength_I_V_line_4:
jmp function_java_lang_StringBuilder_setLength_I_V_line_exit
function_java_lang_StringBuilder_setLength_I_V_line_5:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_setLength_I_V_line_6:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_setLength_I_V_line_7:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_setLength_I_V_line_10:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_StringBuilder_setLength_I_V_line_11:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_StringBuilder_setLength_I_V_line_22
function_java_lang_StringBuilder_setLength_I_V_line_14:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_setLength_I_V_line_15:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_setLength_I_V_line_16:
call function_java_lang_StringBuilder_enlargeBuffer_I_V_line_start
add esp, 4*2
function_java_lang_StringBuilder_setLength_I_V_line_19:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_StringBuilder_setLength_I_V_line_53
function_java_lang_StringBuilder_setLength_I_V_line_22:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_setLength_I_V_line_23:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_setLength_I_V_line_26:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_setLength_I_V_line_27:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_StringBuilder_setLength_I_V_line_53
function_java_lang_StringBuilder_setLength_I_V_line_30:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_setLength_I_V_line_31:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_setLength_I_V_line_34:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_StringBuilder_setLength_I_V_line_35:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_StringBuilder_setLength_I_V_line_48
function_java_lang_StringBuilder_setLength_I_V_line_38:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_setLength_I_V_line_39:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_setLength_I_V_line_42:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_setLength_I_V_line_43:
mov eax, 0
push eax
function_java_lang_StringBuilder_setLength_I_V_line_44:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_StringBuilder_setLength_I_V_line_45:
mov eax, dword [ebp-4*1]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*1], eax
function_java_lang_StringBuilder_setLength_I_V_line_48:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_setLength_I_V_line_49:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_setLength_I_V_line_50:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_StringBuilder_setLength_I_V_line_38
function_java_lang_StringBuilder_setLength_I_V_line_53:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_setLength_I_V_line_54:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_setLength_I_V_line_55:
pop eax
pop ebx
mov dword [ebx+12], eax
function_java_lang_StringBuilder_setLength_I_V_line_58:
jmp function_java_lang_StringBuilder_setLength_I_V_line_exit
function_java_lang_StringBuilder_setLength_I_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [substring_I_Ljava_lang_String] (P:2 - 2;L:0 - 0)
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_1:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_47
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_4:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_5:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_6:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_9:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jg  function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_47
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_12:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_13:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_14:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_17:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_28
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_20:
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_23:
pop eax
push eax
push eax
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_24:
call function_java_lang_String_$init$__V_line_start
add esp, 4*1
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_27:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_exit
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_28:
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_31:
pop eax
push eax
push eax
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_32:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_33:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_36:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_37:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_38:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_41:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_42:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_43:
call function_java_lang_String_$init$__CII_V_line_start
add esp, 4*4
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_46:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_exit
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_47:
mov eax, 0
push eax
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_48:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_exit
function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [substring_II_Ljava_lang_String] (P:3 - 3;L:0 - 0)
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_1:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_46
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_4:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_5:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_6:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jg  function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_46
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_9:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_10:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_11:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_14:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jg  function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_46
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_17:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_18:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_19:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_30
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_22:
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_25:
pop eax
push eax
push eax
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_26:
call function_java_lang_String_$init$__V_line_start
add esp, 4*1
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_29:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_exit
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_30:
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_33:
pop eax
push eax
push eax
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_34:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_35:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_38:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_39:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_40:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_41:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_42:
call function_java_lang_String_$init$__CII_V_line_start
add esp, 4*4
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_45:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_exit
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_46:
mov eax, 0
push eax
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_47:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_exit
function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [toString__Ljava_lang_String] (P:1 - 1;L:0 - 0)
function_java_lang_StringBuilder_toString__Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_toString__Ljava_lang_String_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_toString__Ljava_lang_String_line_1:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_toString__Ljava_lang_String_line_4:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_StringBuilder_toString__Ljava_lang_String_line_10
function_java_lang_StringBuilder_toString__Ljava_lang_String_line_7:
mov eax, dword [stringmap_0]
push eax
function_java_lang_StringBuilder_toString__Ljava_lang_String_line_9:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_toString__Ljava_lang_String_line_exit
function_java_lang_StringBuilder_toString__Ljava_lang_String_line_10:
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_StringBuilder_toString__Ljava_lang_String_line_13:
pop eax
push eax
push eax
function_java_lang_StringBuilder_toString__Ljava_lang_String_line_14:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_toString__Ljava_lang_String_line_15:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_toString__Ljava_lang_String_line_18:
mov eax, 0
push eax
function_java_lang_StringBuilder_toString__Ljava_lang_String_line_19:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_toString__Ljava_lang_String_line_20:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_toString__Ljava_lang_String_line_23:
call function_java_lang_String_$init$__CII_V_line_start
add esp, 4*4
function_java_lang_StringBuilder_toString__Ljava_lang_String_line_26:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_toString__Ljava_lang_String_line_exit
function_java_lang_StringBuilder_toString__Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [indexOf_Ljava_lang_String_I] (P:2 - 2;L:0 - 0)
function_java_lang_StringBuilder_indexOf_Ljava_lang_String_I_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_indexOf_Ljava_lang_String_I_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_String_I_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_String_I_line_2:
mov eax, 0
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_String_I_line_3:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:indexOf_Ljava_lang_StringI_I
add eax, 4*31
call dword [eax] ;java_lang_StringBuilder.indexOf_Ljava_lang_StringI_I
add esp, 4*3
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_String_I_line_6:
pop eax
jmp function_java_lang_StringBuilder_indexOf_Ljava_lang_String_I_line_exit
function_java_lang_StringBuilder_indexOf_Ljava_lang_String_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [indexOf_Ljava_lang_StringI_I] (P:3 - 3;L:6 - 6)
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_start:
push ebp
mov ebp, esp
sub esp, 4*6
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
mov dword [esp+4*2], 0
mov dword [esp+4*3], 0
mov dword [esp+4*4], 0
mov dword [esp+4*5], 0
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_1:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_6
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_4:
mov eax, 0
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_5:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_6:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_7:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:length__I
add eax, 4*5
call dword [eax] ;java_lang_String.length__I
add esp, 4*1
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_10:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_11:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_12:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_143
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_15:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_16:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_17:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_18:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_19:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_22:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_27
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_25:
mov eax, -1
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_26:
pop eax
jmp function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_exit
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_27:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_28:
mov eax, 0
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_29:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:charAt_I_C
add eax, 4*7
call dword [eax] ;java_lang_String.charAt_I_C
add esp, 4*2
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_32:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_34:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_35:
pop eax
mov dword [ebp-4*3], eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_37:
mov eax, 0
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_38:
pop eax
mov dword [ebp-4*4], eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_40:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_64
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_43:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_44:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_47:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_49:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_50:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_52:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_61
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_55:
mov eax, 1
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_56:
pop eax
mov dword [ebp-4*4], eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_58:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_73
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_61:
mov eax, dword [ebp-4*3]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*3], eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_64:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_66:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_67:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_70:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_43
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_73:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_75:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_89
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_78:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_79:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_81:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_82:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_83:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_86:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_91
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_89:
mov eax, -1
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_90:
pop eax
jmp function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_exit
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_91:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_93:
pop eax
mov dword [ebp-4*5], eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_95:
mov eax, 0
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_96:
pop eax
mov dword [ebp-4*6], eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_98:
mov eax, dword [ebp-4*6]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*6], eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_101:
mov eax, dword [ebp-4*6]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_103:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_104:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_126
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_107:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_108:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_111:
mov eax, dword [ebp-4*5]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*5], eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_114:
mov eax, dword [ebp-4*5]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_116:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_117:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_118:
mov eax, dword [ebp-4*6]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_120:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:charAt_I_C
add eax, 4*7
call dword [eax] ;java_lang_String.charAt_I_C
add esp, 4*2
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_123:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_98
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_126:
mov eax, dword [ebp-4*6]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_128:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_129:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_135
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_132:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_134:
pop eax
jmp function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_exit
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_135:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_137:
mov eax, 1
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_138:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_139:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_140:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_34
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_143:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_144:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_145:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_148:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_155
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_151:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_152:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_159
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_155:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_156:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_163
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_159:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_160:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_163:
pop eax
jmp function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_exit
function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [lastIndexOf_Ljava_lang_String_I] (P:2 - 2;L:0 - 0)
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_String_I_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_String_I_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_String_I_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_String_I_line_2:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_String_I_line_3:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_String_I_line_6:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:lastIndexOf_Ljava_lang_StringI_I
add eax, 4*33
call dword [eax] ;java_lang_StringBuilder.lastIndexOf_Ljava_lang_StringI_I
add esp, 4*3
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_String_I_line_9:
pop eax
jmp function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_String_I_line_exit
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_String_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [lastIndexOf_Ljava_lang_StringI_I] (P:3 - 3;L:6 - 6)
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_start:
push ebp
mov ebp, esp
sub esp, 4*6
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
mov dword [esp+4*2], 0
mov dword [esp+4*3], 0
mov dword [esp+4*4], 0
mov dword [esp+4*5], 0
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_1:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:length__I
add eax, 4*5
call dword [eax] ;java_lang_String.length__I
add esp, 4*1
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_4:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_5:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_6:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_7:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_10:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jg  function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_156
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_13:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_14:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_156
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_17:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_18:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_139
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_21:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_22:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_23:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_26:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_27:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_28:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_38
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_31:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_32:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_35:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_36:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_37:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_38:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_39:
mov eax, 0
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_40:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:charAt_I_C
add eax, 4*7
call dword [eax] ;java_lang_String.charAt_I_C
add esp, 4*2
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_43:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_45:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_46:
pop eax
mov dword [ebp-4*3], eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_48:
mov eax, 0
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_49:
pop eax
mov dword [ebp-4*4], eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_51:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_75
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_54:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_55:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_58:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_60:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_61:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_63:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_72
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_66:
mov eax, 1
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_67:
pop eax
mov dword [ebp-4*4], eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_69:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_80
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_72:
mov eax, dword [ebp-4*3]
push eax
mov eax, 255
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*3], eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_75:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_77:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_54
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_80:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_82:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_87
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_85:
mov eax, -1
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_86:
pop eax
jmp function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_exit
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_87:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_89:
pop eax
mov dword [ebp-4*5], eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_91:
mov eax, 0
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_92:
pop eax
mov dword [ebp-4*6], eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_94:
mov eax, dword [ebp-4*6]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*6], eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_97:
mov eax, dword [ebp-4*6]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_99:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_100:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_122
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_103:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_104:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_107:
mov eax, dword [ebp-4*5]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*5], eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_110:
mov eax, dword [ebp-4*5]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_112:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_113:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_114:
mov eax, dword [ebp-4*6]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_116:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:charAt_I_C
add eax, 4*7
call dword [eax] ;java_lang_String.charAt_I_C
add esp, 4*2
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_119:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_94
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_122:
mov eax, dword [ebp-4*6]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_124:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_125:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_131
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_128:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_130:
pop eax
jmp function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_exit
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_131:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_133:
mov eax, 1
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_134:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_135:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_136:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_45
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_139:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_140:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_141:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_144:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_151
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_147:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_148:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_155
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_151:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_152:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_155:
pop eax
jmp function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_exit
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_156:
mov eax, -1
push eax
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_157:
pop eax
jmp function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_exit
function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [trimToSize__V] (P:1 - 1;L:1 - 1)
function_java_lang_StringBuilder_trimToSize__V_line_start:
push ebp
mov ebp, esp
sub esp, 4*1
mov dword [esp+4*0], 0
function_java_lang_StringBuilder_trimToSize__V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_trimToSize__V_line_1:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_trimToSize__V_line_4:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_trimToSize__V_line_5:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_trimToSize__V_line_8:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_StringBuilder_trimToSize__V_line_9:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_StringBuilder_trimToSize__V_line_38
function_java_lang_StringBuilder_trimToSize__V_line_12:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_trimToSize__V_line_13:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_trimToSize__V_line_16:
pop ecx
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
push eax
function_java_lang_StringBuilder_trimToSize__V_line_18:
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*1], eax
function_java_lang_StringBuilder_trimToSize__V_line_19:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_trimToSize__V_line_20:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_trimToSize__V_line_23:
mov eax, 0
push eax
function_java_lang_StringBuilder_trimToSize__V_line_24:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_trimToSize__V_line_25:
mov eax, 0
push eax
function_java_lang_StringBuilder_trimToSize__V_line_26:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_trimToSize__V_line_27:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_trimToSize__V_line_30:
call function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_start
add esp, 4*5
function_java_lang_StringBuilder_trimToSize__V_line_33:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_trimToSize__V_line_34:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_StringBuilder_trimToSize__V_line_35:
pop eax
pop ebx
push ebx
push eax
mov eax, dword [ebx+8]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
pop ebx
mov dword [ebx+8], eax
function_java_lang_StringBuilder_trimToSize__V_line_38:
jmp function_java_lang_StringBuilder_trimToSize__V_line_exit
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
mov eax, 0
mov dword [ebp-4*1], eax
function_java_lang_StringBuilder_trimToSize__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [append_Z_Ljava_lang_StringBuilder] (P:2 - 2;L:0 - 0)
function_java_lang_StringBuilder_append_Z_Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_append_Z_Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append_Z_Ljava_lang_StringBuilder_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_append_Z_Ljava_lang_StringBuilder_line_2:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_StringBuilder_append_Z_Ljava_lang_StringBuilder_line_10
function_java_lang_StringBuilder_append_Z_Ljava_lang_StringBuilder_line_5:
mov eax, dword [stringmap_36758e]
push eax
function_java_lang_StringBuilder_append_Z_Ljava_lang_StringBuilder_line_7:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_StringBuilder_append_Z_Ljava_lang_StringBuilder_line_12
function_java_lang_StringBuilder_append_Z_Ljava_lang_StringBuilder_line_10:
mov eax, dword [stringmap_5cb1923]
push eax
function_java_lang_StringBuilder_append_Z_Ljava_lang_StringBuilder_line_12:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:append0_Ljava_lang_String_V
add eax, 4*10
call dword [eax] ;java_lang_StringBuilder.append0_Ljava_lang_String_V
add esp, 4*2
function_java_lang_StringBuilder_append_Z_Ljava_lang_StringBuilder_line_15:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append_Z_Ljava_lang_StringBuilder_line_16:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_append_Z_Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_append_Z_Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [append_C_Ljava_lang_StringBuilder] (P:2 - 2;L:0 - 0)
function_java_lang_StringBuilder_append_C_Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_append_C_Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append_C_Ljava_lang_StringBuilder_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_append_C_Ljava_lang_StringBuilder_line_2:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:append0_C_V
add eax, 4*9
call dword [eax] ;java_lang_StringBuilder.append0_C_V
add esp, 4*2
function_java_lang_StringBuilder_append_C_Ljava_lang_StringBuilder_line_5:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append_C_Ljava_lang_StringBuilder_line_6:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_append_C_Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_append_C_Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [append_I_Ljava_lang_StringBuilder] (P:2 - 2;L:0 - 0)
function_java_lang_StringBuilder_append_I_Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_append_I_Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append_I_Ljava_lang_StringBuilder_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_append_I_Ljava_lang_StringBuilder_line_2:
call function_java_lang_Integer_toString_I_Ljava_lang_String_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_StringBuilder_append_I_Ljava_lang_StringBuilder_line_5:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:append0_Ljava_lang_String_V
add eax, 4*10
call dword [eax] ;java_lang_StringBuilder.append0_Ljava_lang_String_V
add esp, 4*2
function_java_lang_StringBuilder_append_I_Ljava_lang_StringBuilder_line_8:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append_I_Ljava_lang_StringBuilder_line_9:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_append_I_Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_append_I_Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [append_F_Ljava_lang_StringBuilder] (P:2 - 2;L:0 - 0)
function_java_lang_StringBuilder_append_F_Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_append_F_Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append_F_Ljava_lang_StringBuilder_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_append_F_Ljava_lang_StringBuilder_line_2:
call function_java_lang_Float_toString_F_Ljava_lang_String_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_StringBuilder_append_F_Ljava_lang_StringBuilder_line_5:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:append0_Ljava_lang_String_V
add eax, 4*10
call dword [eax] ;java_lang_StringBuilder.append0_Ljava_lang_String_V
add esp, 4*2
function_java_lang_StringBuilder_append_F_Ljava_lang_StringBuilder_line_8:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append_F_Ljava_lang_StringBuilder_line_9:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_append_F_Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_append_F_Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [append_D_Ljava_lang_StringBuilder] (P:2 - 3;L:0 - 0)
function_java_lang_StringBuilder_append_D_Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_append_D_Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_append_D_Ljava_lang_StringBuilder_line_1:
mov eax, dword [ebp+4*3]
mov edx, dword [ebp+4*2]
push eax
push edx
function_java_lang_StringBuilder_append_D_Ljava_lang_StringBuilder_line_2:
call function_java_lang_Double_toString_D_Ljava_lang_String_line_start
add esp, 4*2
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_StringBuilder_append_D_Ljava_lang_StringBuilder_line_5:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:append0_Ljava_lang_String_V
add eax, 4*10
call dword [eax] ;java_lang_StringBuilder.append0_Ljava_lang_String_V
add esp, 4*2
function_java_lang_StringBuilder_append_D_Ljava_lang_StringBuilder_line_8:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_append_D_Ljava_lang_StringBuilder_line_9:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_append_D_Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_append_D_Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [append_Ljava_lang_Object_Ljava_lang_StringBuilder] (P:2 - 2;L:0 - 0)
function_java_lang_StringBuilder_append_Ljava_lang_Object_Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_append_Ljava_lang_Object_Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_append_Ljava_lang_Object_Ljava_lang_StringBuilder_line_1:
pop eax
cmp eax, 0
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_StringBuilder_append_Ljava_lang_Object_Ljava_lang_StringBuilder_line_11
function_java_lang_StringBuilder_append_Ljava_lang_Object_Ljava_lang_StringBuilder_line_4:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append_Ljava_lang_Object_Ljava_lang_StringBuilder_line_5:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:appendNull__V
add eax, 4*6
call dword [eax] ;java_lang_StringBuilder.appendNull__V
add esp, 4*1
function_java_lang_StringBuilder_append_Ljava_lang_Object_Ljava_lang_StringBuilder_line_8:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_StringBuilder_append_Ljava_lang_Object_Ljava_lang_StringBuilder_line_19
function_java_lang_StringBuilder_append_Ljava_lang_Object_Ljava_lang_StringBuilder_line_11:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append_Ljava_lang_Object_Ljava_lang_StringBuilder_line_12:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_append_Ljava_lang_Object_Ljava_lang_StringBuilder_line_13:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:toString__Ljava_lang_String
add eax, 4*2
call dword [eax] ;java_lang_Object.toString__Ljava_lang_String
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_StringBuilder_append_Ljava_lang_Object_Ljava_lang_StringBuilder_line_16:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:append0_Ljava_lang_String_V
add eax, 4*10
call dword [eax] ;java_lang_StringBuilder.append0_Ljava_lang_String_V
add esp, 4*2
function_java_lang_StringBuilder_append_Ljava_lang_Object_Ljava_lang_StringBuilder_line_19:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append_Ljava_lang_Object_Ljava_lang_StringBuilder_line_20:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_append_Ljava_lang_Object_Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_append_Ljava_lang_Object_Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [append_Ljava_lang_String_Ljava_lang_StringBuilder] (P:2 - 2;L:0 - 0)
function_java_lang_StringBuilder_append_Ljava_lang_String_Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_append_Ljava_lang_String_Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append_Ljava_lang_String_Ljava_lang_StringBuilder_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_append_Ljava_lang_String_Ljava_lang_StringBuilder_line_2:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:append0_Ljava_lang_String_V
add eax, 4*10
call dword [eax] ;java_lang_StringBuilder.append0_Ljava_lang_String_V
add esp, 4*2
function_java_lang_StringBuilder_append_Ljava_lang_String_Ljava_lang_StringBuilder_line_5:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append_Ljava_lang_String_Ljava_lang_StringBuilder_line_6:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_append_Ljava_lang_String_Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_append_Ljava_lang_String_Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [append__C_Ljava_lang_StringBuilder] (P:2 - 2;L:0 - 0)
function_java_lang_StringBuilder_append__C_Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_append__C_Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append__C_Ljava_lang_StringBuilder_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_append__C_Ljava_lang_StringBuilder_line_2:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:append0__C_V
add eax, 4*7
call dword [eax] ;java_lang_StringBuilder.append0__C_V
add esp, 4*2
function_java_lang_StringBuilder_append__C_Ljava_lang_StringBuilder_line_5:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append__C_Ljava_lang_StringBuilder_line_6:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_append__C_Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_append__C_Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [append__CII_Ljava_lang_StringBuilder] (P:4 - 4;L:0 - 0)
function_java_lang_StringBuilder_append__CII_Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_append__CII_Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_append__CII_Ljava_lang_StringBuilder_line_1:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_append__CII_Ljava_lang_StringBuilder_line_2:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append__CII_Ljava_lang_StringBuilder_line_3:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_append__CII_Ljava_lang_StringBuilder_line_4:
mov eax, dword [esp+4*3]
mov eax, dword [eax] ;VFC:append0__CII_V
add eax, 4*8
call dword [eax] ;java_lang_StringBuilder.append0__CII_V
add esp, 4*4
function_java_lang_StringBuilder_append__CII_Ljava_lang_StringBuilder_line_7:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_append__CII_Ljava_lang_StringBuilder_line_8:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_append__CII_Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_append__CII_Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [append_Ljava_lang_StringBuilder_Ljava_lang_StringBuilder] (P:2 - 2;L:0 - 0)
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilder_Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilder_Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilder_Ljava_lang_StringBuilder_line_1:
pop eax
cmp eax, 0
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_StringBuilder_append_Ljava_lang_StringBuilder_Ljava_lang_StringBuilder_line_11
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilder_Ljava_lang_StringBuilder_line_4:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilder_Ljava_lang_StringBuilder_line_5:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:appendNull__V
add eax, 4*6
call dword [eax] ;java_lang_StringBuilder.appendNull__V
add esp, 4*1
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilder_Ljava_lang_StringBuilder_line_8:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_StringBuilder_append_Ljava_lang_StringBuilder_Ljava_lang_StringBuilder_line_24
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilder_Ljava_lang_StringBuilder_line_11:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilder_Ljava_lang_StringBuilder_line_12:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilder_Ljava_lang_StringBuilder_line_13:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilder_Ljava_lang_StringBuilder_line_16:
mov eax, 0
push eax
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilder_Ljava_lang_StringBuilder_line_17:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilder_Ljava_lang_StringBuilder_line_18:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilder_Ljava_lang_StringBuilder_line_21:
mov eax, dword [esp+4*3]
mov eax, dword [eax] ;VFC:append0__CII_V
add eax, 4*8
call dword [eax] ;java_lang_StringBuilder.append0__CII_V
add esp, 4*4
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilder_Ljava_lang_StringBuilder_line_24:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilder_Ljava_lang_StringBuilder_line_25:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_append_Ljava_lang_StringBuilder_Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilder_Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [append_Ljava_lang_StringBuilderII_Ljava_lang_StringBuilder] (P:4 - 4;L:0 - 0)
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilderII_Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilderII_Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilderII_Ljava_lang_StringBuilder_line_1:
pop eax
cmp eax, 0
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_StringBuilder_append_Ljava_lang_StringBuilderII_Ljava_lang_StringBuilder_line_11
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilderII_Ljava_lang_StringBuilder_line_4:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilderII_Ljava_lang_StringBuilder_line_5:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:appendNull__V
add eax, 4*6
call dword [eax] ;java_lang_StringBuilder.appendNull__V
add esp, 4*1
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilderII_Ljava_lang_StringBuilder_line_8:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_StringBuilder_append_Ljava_lang_StringBuilderII_Ljava_lang_StringBuilder_line_21
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilderII_Ljava_lang_StringBuilder_line_11:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilderII_Ljava_lang_StringBuilder_line_12:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilderII_Ljava_lang_StringBuilder_line_13:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilderII_Ljava_lang_StringBuilder_line_16:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilderII_Ljava_lang_StringBuilder_line_17:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilderII_Ljava_lang_StringBuilder_line_18:
mov eax, dword [esp+4*3]
mov eax, dword [eax] ;VFC:append0__CII_V
add eax, 4*8
call dword [eax] ;java_lang_StringBuilder.append0__CII_V
add esp, 4*4
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilderII_Ljava_lang_StringBuilder_line_21:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilderII_Ljava_lang_StringBuilder_line_22:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_append_Ljava_lang_StringBuilderII_Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_append_Ljava_lang_StringBuilderII_Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [delete_II_Ljava_lang_StringBuilder] (P:3 - 3;L:0 - 0)
function_java_lang_StringBuilder_delete_II_Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_delete_II_Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_delete_II_Ljava_lang_StringBuilder_line_1:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_delete_II_Ljava_lang_StringBuilder_line_2:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_delete_II_Ljava_lang_StringBuilder_line_3:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:delete0_II_V
add eax, 4*11
call dword [eax] ;java_lang_StringBuilder.delete0_II_V
add esp, 4*3
function_java_lang_StringBuilder_delete_II_Ljava_lang_StringBuilder_line_6:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_delete_II_Ljava_lang_StringBuilder_line_7:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_delete_II_Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_delete_II_Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [deleteCharAt_I_Ljava_lang_StringBuilder] (P:2 - 2;L:0 - 0)
function_java_lang_StringBuilder_deleteCharAt_I_Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_deleteCharAt_I_Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_deleteCharAt_I_Ljava_lang_StringBuilder_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_deleteCharAt_I_Ljava_lang_StringBuilder_line_2:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:deleteCharAt0_I_V
add eax, 4*12
call dword [eax] ;java_lang_StringBuilder.deleteCharAt0_I_V
add esp, 4*2
function_java_lang_StringBuilder_deleteCharAt_I_Ljava_lang_StringBuilder_line_5:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_deleteCharAt_I_Ljava_lang_StringBuilder_line_6:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_deleteCharAt_I_Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_deleteCharAt_I_Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [insert_IZ_Ljava_lang_StringBuilder] (P:3 - 3;L:0 - 0)
function_java_lang_StringBuilder_insert_IZ_Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_insert_IZ_Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert_IZ_Ljava_lang_StringBuilder_line_1:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_insert_IZ_Ljava_lang_StringBuilder_line_2:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert_IZ_Ljava_lang_StringBuilder_line_3:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_StringBuilder_insert_IZ_Ljava_lang_StringBuilder_line_11
function_java_lang_StringBuilder_insert_IZ_Ljava_lang_StringBuilder_line_6:
mov eax, dword [stringmap_36758e]
push eax
function_java_lang_StringBuilder_insert_IZ_Ljava_lang_StringBuilder_line_8:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_StringBuilder_insert_IZ_Ljava_lang_StringBuilder_line_13
function_java_lang_StringBuilder_insert_IZ_Ljava_lang_StringBuilder_line_11:
mov eax, dword [stringmap_5cb1923]
push eax
function_java_lang_StringBuilder_insert_IZ_Ljava_lang_StringBuilder_line_13:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:insert0_ILjava_lang_String_V
add eax, 4*18
call dword [eax] ;java_lang_StringBuilder.insert0_ILjava_lang_String_V
add esp, 4*3
function_java_lang_StringBuilder_insert_IZ_Ljava_lang_StringBuilder_line_16:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert_IZ_Ljava_lang_StringBuilder_line_17:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_insert_IZ_Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_insert_IZ_Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [insert_IC_Ljava_lang_StringBuilder] (P:3 - 3;L:0 - 0)
function_java_lang_StringBuilder_insert_IC_Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_insert_IC_Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert_IC_Ljava_lang_StringBuilder_line_1:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_insert_IC_Ljava_lang_StringBuilder_line_2:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert_IC_Ljava_lang_StringBuilder_line_3:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:insert0_IC_V
add eax, 4*17
call dword [eax] ;java_lang_StringBuilder.insert0_IC_V
add esp, 4*3
function_java_lang_StringBuilder_insert_IC_Ljava_lang_StringBuilder_line_6:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert_IC_Ljava_lang_StringBuilder_line_7:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_insert_IC_Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_insert_IC_Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [insert_II_Ljava_lang_StringBuilder] (P:3 - 3;L:0 - 0)
function_java_lang_StringBuilder_insert_II_Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_insert_II_Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert_II_Ljava_lang_StringBuilder_line_1:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_insert_II_Ljava_lang_StringBuilder_line_2:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert_II_Ljava_lang_StringBuilder_line_3:
call function_java_lang_Integer_toString_I_Ljava_lang_String_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_StringBuilder_insert_II_Ljava_lang_StringBuilder_line_6:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:insert0_ILjava_lang_String_V
add eax, 4*18
call dword [eax] ;java_lang_StringBuilder.insert0_ILjava_lang_String_V
add esp, 4*3
function_java_lang_StringBuilder_insert_II_Ljava_lang_StringBuilder_line_9:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert_II_Ljava_lang_StringBuilder_line_10:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_insert_II_Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_insert_II_Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [insert_IJ_Ljava_lang_StringBuilder] (P:3 - 4;L:0 - 0)
function_java_lang_StringBuilder_insert_IJ_Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_insert_IJ_Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_insert_IJ_Ljava_lang_StringBuilder_line_1:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert_IJ_Ljava_lang_StringBuilder_line_2:
mov eax, dword [ebp+4*3]
mov edx, dword [ebp+4*2]
push eax
push edx
function_java_lang_StringBuilder_insert_IJ_Ljava_lang_StringBuilder_line_3:
call function_java_lang_Long_toString_J_Ljava_lang_String_line_start
add esp, 4*2
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_StringBuilder_insert_IJ_Ljava_lang_StringBuilder_line_6:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:insert0_ILjava_lang_String_V
add eax, 4*18
call dword [eax] ;java_lang_StringBuilder.insert0_ILjava_lang_String_V
add esp, 4*3
function_java_lang_StringBuilder_insert_IJ_Ljava_lang_StringBuilder_line_9:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_insert_IJ_Ljava_lang_StringBuilder_line_10:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_insert_IJ_Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_insert_IJ_Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [insert_IF_Ljava_lang_StringBuilder] (P:3 - 3;L:0 - 0)
function_java_lang_StringBuilder_insert_IF_Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_insert_IF_Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert_IF_Ljava_lang_StringBuilder_line_1:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_insert_IF_Ljava_lang_StringBuilder_line_2:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert_IF_Ljava_lang_StringBuilder_line_3:
call function_java_lang_Float_toString_F_Ljava_lang_String_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_StringBuilder_insert_IF_Ljava_lang_StringBuilder_line_6:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:insert0_ILjava_lang_String_V
add eax, 4*18
call dword [eax] ;java_lang_StringBuilder.insert0_ILjava_lang_String_V
add esp, 4*3
function_java_lang_StringBuilder_insert_IF_Ljava_lang_StringBuilder_line_9:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert_IF_Ljava_lang_StringBuilder_line_10:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_insert_IF_Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_insert_IF_Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [insert_ID_Ljava_lang_StringBuilder] (P:3 - 4;L:0 - 0)
function_java_lang_StringBuilder_insert_ID_Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_insert_ID_Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_insert_ID_Ljava_lang_StringBuilder_line_1:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert_ID_Ljava_lang_StringBuilder_line_2:
mov eax, dword [ebp+4*3]
mov edx, dword [ebp+4*2]
push eax
push edx
function_java_lang_StringBuilder_insert_ID_Ljava_lang_StringBuilder_line_3:
call function_java_lang_Double_toString_D_Ljava_lang_String_line_start
add esp, 4*2
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_StringBuilder_insert_ID_Ljava_lang_StringBuilder_line_6:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:insert0_ILjava_lang_String_V
add eax, 4*18
call dword [eax] ;java_lang_StringBuilder.insert0_ILjava_lang_String_V
add esp, 4*3
function_java_lang_StringBuilder_insert_ID_Ljava_lang_StringBuilder_line_9:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_insert_ID_Ljava_lang_StringBuilder_line_10:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_insert_ID_Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_insert_ID_Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [insert_ILjava_lang_Object_Ljava_lang_StringBuilder] (P:3 - 3;L:0 - 0)
function_java_lang_StringBuilder_insert_ILjava_lang_Object_Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_insert_ILjava_lang_Object_Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert_ILjava_lang_Object_Ljava_lang_StringBuilder_line_1:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_insert_ILjava_lang_Object_Ljava_lang_StringBuilder_line_2:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert_ILjava_lang_Object_Ljava_lang_StringBuilder_line_3:
pop eax
cmp eax, 0
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_StringBuilder_insert_ILjava_lang_Object_Ljava_lang_StringBuilder_line_11
function_java_lang_StringBuilder_insert_ILjava_lang_Object_Ljava_lang_StringBuilder_line_6:
mov eax, dword [stringmap_33c587]
push eax
function_java_lang_StringBuilder_insert_ILjava_lang_Object_Ljava_lang_StringBuilder_line_8:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_StringBuilder_insert_ILjava_lang_Object_Ljava_lang_StringBuilder_line_15
function_java_lang_StringBuilder_insert_ILjava_lang_Object_Ljava_lang_StringBuilder_line_11:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert_ILjava_lang_Object_Ljava_lang_StringBuilder_line_12:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:toString__Ljava_lang_String
add eax, 4*2
call dword [eax] ;java_lang_Object.toString__Ljava_lang_String
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_StringBuilder_insert_ILjava_lang_Object_Ljava_lang_StringBuilder_line_15:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:insert0_ILjava_lang_String_V
add eax, 4*18
call dword [eax] ;java_lang_StringBuilder.insert0_ILjava_lang_String_V
add esp, 4*3
function_java_lang_StringBuilder_insert_ILjava_lang_Object_Ljava_lang_StringBuilder_line_18:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert_ILjava_lang_Object_Ljava_lang_StringBuilder_line_19:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_insert_ILjava_lang_Object_Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_insert_ILjava_lang_Object_Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [insert_ILjava_lang_String_Ljava_lang_StringBuilder] (P:3 - 3;L:0 - 0)
function_java_lang_StringBuilder_insert_ILjava_lang_String_Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_insert_ILjava_lang_String_Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert_ILjava_lang_String_Ljava_lang_StringBuilder_line_1:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_insert_ILjava_lang_String_Ljava_lang_StringBuilder_line_2:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert_ILjava_lang_String_Ljava_lang_StringBuilder_line_3:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:insert0_ILjava_lang_String_V
add eax, 4*18
call dword [eax] ;java_lang_StringBuilder.insert0_ILjava_lang_String_V
add esp, 4*3
function_java_lang_StringBuilder_insert_ILjava_lang_String_Ljava_lang_StringBuilder_line_6:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert_ILjava_lang_String_Ljava_lang_StringBuilder_line_7:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_insert_ILjava_lang_String_Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_insert_ILjava_lang_String_Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [insert_I_C_Ljava_lang_StringBuilder] (P:3 - 3;L:0 - 0)
function_java_lang_StringBuilder_insert_I_C_Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_insert_I_C_Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert_I_C_Ljava_lang_StringBuilder_line_1:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_insert_I_C_Ljava_lang_StringBuilder_line_2:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert_I_C_Ljava_lang_StringBuilder_line_3:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:insert0_I_C_V
add eax, 4*15
call dword [eax] ;java_lang_StringBuilder.insert0_I_C_V
add esp, 4*3
function_java_lang_StringBuilder_insert_I_C_Ljava_lang_StringBuilder_line_6:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert_I_C_Ljava_lang_StringBuilder_line_7:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_insert_I_C_Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_insert_I_C_Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [insert_I_CII_Ljava_lang_StringBuilder] (P:5 - 5;L:0 - 0)
function_java_lang_StringBuilder_insert_I_CII_Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_insert_I_CII_Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*6]
push eax
function_java_lang_StringBuilder_insert_I_CII_Ljava_lang_StringBuilder_line_1:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_insert_I_CII_Ljava_lang_StringBuilder_line_2:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_insert_I_CII_Ljava_lang_StringBuilder_line_3:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_insert_I_CII_Ljava_lang_StringBuilder_line_4:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_insert_I_CII_Ljava_lang_StringBuilder_line_6:
mov eax, dword [esp+4*4]
mov eax, dword [eax] ;VFC:insert0_I_CII_V
add eax, 4*16
call dword [eax] ;java_lang_StringBuilder.insert0_I_CII_V
add esp, 4*5
function_java_lang_StringBuilder_insert_I_CII_Ljava_lang_StringBuilder_line_9:
mov eax, dword [ebp+4*6]
push eax
function_java_lang_StringBuilder_insert_I_CII_Ljava_lang_StringBuilder_line_10:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_insert_I_CII_Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_insert_I_CII_Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [replace_IILjava_lang_String_Ljava_lang_StringBuilder] (P:4 - 4;L:0 - 0)
function_java_lang_StringBuilder_replace_IILjava_lang_String_Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_replace_IILjava_lang_String_Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_replace_IILjava_lang_String_Ljava_lang_StringBuilder_line_1:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_StringBuilder_replace_IILjava_lang_String_Ljava_lang_StringBuilder_line_2:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_StringBuilder_replace_IILjava_lang_String_Ljava_lang_StringBuilder_line_3:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_replace_IILjava_lang_String_Ljava_lang_StringBuilder_line_4:
mov eax, dword [esp+4*3]
mov eax, dword [eax] ;VFC:replace0_IILjava_lang_String_V
add eax, 4*20
call dword [eax] ;java_lang_StringBuilder.replace0_IILjava_lang_String_V
add esp, 4*4
function_java_lang_StringBuilder_replace_IILjava_lang_String_Ljava_lang_StringBuilder_line_7:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_StringBuilder_replace_IILjava_lang_String_Ljava_lang_StringBuilder_line_8:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_replace_IILjava_lang_String_Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_replace_IILjava_lang_String_Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [reverse__Ljava_lang_StringBuilder] (P:1 - 1;L:0 - 0)
function_java_lang_StringBuilder_reverse__Ljava_lang_StringBuilder_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_reverse__Ljava_lang_StringBuilder_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_reverse__Ljava_lang_StringBuilder_line_1:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:reverse0__V
add eax, 4*21
call dword [eax] ;java_lang_StringBuilder.reverse0__V
add esp, 4*1
function_java_lang_StringBuilder_reverse__Ljava_lang_StringBuilder_line_4:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_reverse__Ljava_lang_StringBuilder_line_5:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_StringBuilder_reverse__Ljava_lang_StringBuilder_line_exit
function_java_lang_StringBuilder_reverse__Ljava_lang_StringBuilder_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [hashCode__I] (P:1 - 1;L:2 - 2)
function_java_lang_StringBuilder_hashCode__I_line_start:
push ebp
mov ebp, esp
sub esp, 4*2
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
function_java_lang_StringBuilder_hashCode__I_line_0:
mov eax, 31
push eax
function_java_lang_StringBuilder_hashCode__I_line_2:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_StringBuilder_hashCode__I_line_3:
mov eax, 1
push eax
function_java_lang_StringBuilder_hashCode__I_line_4:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_StringBuilder_hashCode__I_line_5:
mov eax, 31
push eax
function_java_lang_StringBuilder_hashCode__I_line_7:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_hashCode__I_line_8:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_StringBuilder_hashCode__I_line_11:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_hashCode__I_line_12:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_StringBuilder_hashCode__I_line_13:
mov eax, 31
push eax
function_java_lang_StringBuilder_hashCode__I_line_15:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_StringBuilder_hashCode__I_line_16:
pop ebx
pop eax
imul eax, ebx
push eax
function_java_lang_StringBuilder_hashCode__I_line_17:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_StringBuilder_hashCode__I_line_18:
call function_java_lang_Object_hashCode__I_line_start
add esp, 4*1
push eax
function_java_lang_StringBuilder_hashCode__I_line_21:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_StringBuilder_hashCode__I_line_22:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_StringBuilder_hashCode__I_line_23:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_StringBuilder_hashCode__I_line_24:
pop eax
jmp function_java_lang_StringBuilder_hashCode__I_line_exit
function_java_lang_StringBuilder_hashCode__I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$destroy$] (P:1 - 1;L:0 - 0)
function_java_lang_StringBuilder_$destroy$_line_start:
push ebp
mov ebp, esp
mov ebx, [ebp+4*2]
mov eax, [ebx+8]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
function_java_lang_StringBuilder_$destroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [$cldestroy$] (P:0 - 0;L:0 - 0)
function_java_lang_StringBuilder_$cldestroy$_line_start:
push ebp
mov ebp, esp
function_java_lang_StringBuilder_$cldestroy$_line_0:
function_java_lang_StringBuilder_$cldestroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;=================================================
;Starting function [$init$__V] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_rt_windows_WindowsImportUtil_$init$__V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_rt_windows_WindowsImportUtil_$init$__V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_rt_windows_WindowsImportUtil_$init$__V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_pusty_f0xC_rt_windows_WindowsImportUtil_$init$__V_line_4:
jmp function_pusty_f0xC_rt_windows_WindowsImportUtil_$init$__V_line_exit
function_pusty_f0xC_rt_windows_WindowsImportUtil_$init$__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [MessageBoxA_IIII_Z] (P:4 - 4;L:0 - 0)
;Starting function [MessageBox_ILjava_lang_StringLjava_lang_StringI_Z] (P:4 - 4;L:0 - 0)
function_pusty_f0xC_rt_windows_WindowsImportUtil_MessageBox_ILjava_lang_StringLjava_lang_StringI_Z_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_rt_windows_WindowsImportUtil_MessageBox_ILjava_lang_StringLjava_lang_StringI_Z_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_rt_windows_WindowsImportUtil_MessageBox_ILjava_lang_StringLjava_lang_StringI_Z_line_1:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_rt_windows_WindowsImportUtil_MessageBox_ILjava_lang_StringLjava_lang_StringI_Z_line_2:
call function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_pusty_f0xC_rt_windows_WindowsImportUtil_MessageBox_ILjava_lang_StringLjava_lang_StringI_Z_line_5:
call function_pusty_f0xC_imports_InternalObject_con2int_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_rt_windows_WindowsImportUtil_MessageBox_ILjava_lang_StringLjava_lang_StringI_Z_line_8:
mov eax, dword [ebp+4*4]
push eax
function_pusty_f0xC_rt_windows_WindowsImportUtil_MessageBox_ILjava_lang_StringLjava_lang_StringI_Z_line_9:
call function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_pusty_f0xC_rt_windows_WindowsImportUtil_MessageBox_ILjava_lang_StringLjava_lang_StringI_Z_line_12:
call function_pusty_f0xC_imports_InternalObject_con2int_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_rt_windows_WindowsImportUtil_MessageBox_ILjava_lang_StringLjava_lang_StringI_Z_line_15:
mov eax, dword [ebp+4*5]
push eax
function_pusty_f0xC_rt_windows_WindowsImportUtil_MessageBox_ILjava_lang_StringLjava_lang_StringI_Z_line_16:
call dword [MessageBoxA]
push eax
function_pusty_f0xC_rt_windows_WindowsImportUtil_MessageBox_ILjava_lang_StringLjava_lang_StringI_Z_line_19:
pop eax
jmp function_pusty_f0xC_rt_windows_WindowsImportUtil_MessageBox_ILjava_lang_StringLjava_lang_StringI_Z_line_exit
function_pusty_f0xC_rt_windows_WindowsImportUtil_MessageBox_ILjava_lang_StringLjava_lang_StringI_Z_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$destroy$] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_rt_windows_WindowsImportUtil_$destroy$_line_start:
push ebp
mov ebp, esp
mov ebx, [ebp+4*2]
function_pusty_f0xC_rt_windows_WindowsImportUtil_$destroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [$cldestroy$] (P:0 - 0;L:0 - 0)
function_pusty_f0xC_rt_windows_WindowsImportUtil_$cldestroy$_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_rt_windows_WindowsImportUtil_$cldestroy$_line_0:
function_pusty_f0xC_rt_windows_WindowsImportUtil_$cldestroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;=================================================
;Starting function [$init$_I_V] (P:2 - 2;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio$FILE_$init$_I_V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio$FILE_$init$_I_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_libc_CStdio$FILE_$init$_I_V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_pusty_f0xC_imports_libc_CStdio$FILE_$init$_I_V_line_4:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_libc_CStdio$FILE_$init$_I_V_line_5:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio$FILE_$init$_I_V_line_6:
pop eax
pop ebx
mov dword [ebx+8], eax
function_pusty_f0xC_imports_libc_CStdio$FILE_$init$_I_V_line_9:
jmp function_pusty_f0xC_imports_libc_CStdio$FILE_$init$_I_V_line_exit
function_pusty_f0xC_imports_libc_CStdio$FILE_$init$_I_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [getFD__I] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio$FILE_getFD__I_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio$FILE_getFD__I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio$FILE_getFD__I_line_1:
pop ebx
mov eax, dword [ebx+8]
push eax
function_pusty_f0xC_imports_libc_CStdio$FILE_getFD__I_line_4:
pop eax
jmp function_pusty_f0xC_imports_libc_CStdio$FILE_getFD__I_line_exit
function_pusty_f0xC_imports_libc_CStdio$FILE_getFD__I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [setFD_I_V] (P:2 - 2;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio$FILE_setFD_I_V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio$FILE_setFD_I_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_libc_CStdio$FILE_setFD_I_V_line_1:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio$FILE_setFD_I_V_line_2:
pop eax
pop ebx
mov dword [ebx+8], eax
function_pusty_f0xC_imports_libc_CStdio$FILE_setFD_I_V_line_5:
jmp function_pusty_f0xC_imports_libc_CStdio$FILE_setFD_I_V_line_exit
function_pusty_f0xC_imports_libc_CStdio$FILE_setFD_I_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$destroy$] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio$FILE_$destroy$_line_start:
push ebp
mov ebp, esp
mov ebx, [ebp+4*2]
function_pusty_f0xC_imports_libc_CStdio$FILE_$destroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [$cldestroy$] (P:0 - 0;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio$FILE_$cldestroy$_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio$FILE_$cldestroy$_line_0:
function_pusty_f0xC_imports_libc_CStdio$FILE_$cldestroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;=================================================
;Starting function [$init$_F_V] (P:2 - 2;L:0 - 0)
function_java_lang_Float_$init$_F_V_line_start:
push ebp
mov ebp, esp
function_java_lang_Float_$init$_F_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Float_$init$_F_V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_java_lang_Float_$init$_F_V_line_4:
jmp function_java_lang_Float_$init$_F_V_line_exit
function_java_lang_Float_$init$_F_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [valueOf_F_Ljava_lang_Float] (P:1 - 1;L:0 - 0)
function_java_lang_Float_valueOf_F_Ljava_lang_Float_line_start:
push ebp
mov ebp, esp
function_java_lang_Float_valueOf_F_Ljava_lang_Float_line_0:
mov eax, java_lang_Float_class
push eax
mov eax, 8
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_Float_valueOf_F_Ljava_lang_Float_line_3:
pop eax
push eax
push eax
function_java_lang_Float_valueOf_F_Ljava_lang_Float_line_4:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Float_valueOf_F_Ljava_lang_Float_line_5:
call function_java_lang_Float_$init$_F_V_line_start
add esp, 4*2
function_java_lang_Float_valueOf_F_Ljava_lang_Float_line_8:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_Float_valueOf_F_Ljava_lang_Float_line_exit
function_java_lang_Float_valueOf_F_Ljava_lang_Float_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [toString__Ljava_lang_String] (P:1 - 1;L:0 - 0)
function_java_lang_Float_toString__Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_Float_toString__Ljava_lang_String_line_0:
mov eax, dword [stringmap_85c2f798]
push eax
function_java_lang_Float_toString__Ljava_lang_String_line_2:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_Float_toString__Ljava_lang_String_line_exit
function_java_lang_Float_toString__Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [toString_F_Ljava_lang_String] (P:1 - 1;L:0 - 0)
function_java_lang_Float_toString_F_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_Float_toString_F_Ljava_lang_String_line_0:
mov eax, dword [stringmap_85c2f798]
push eax
function_java_lang_Float_toString_F_Ljava_lang_String_line_2:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_Float_toString_F_Ljava_lang_String_line_exit
function_java_lang_Float_toString_F_Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$destroy$] (P:1 - 1;L:0 - 0)
function_java_lang_Float_$destroy$_line_start:
push ebp
mov ebp, esp
mov ebx, [ebp+4*2]
function_java_lang_Float_$destroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [$cldestroy$] (P:0 - 0;L:0 - 0)
function_java_lang_Float_$cldestroy$_line_start:
push ebp
mov ebp, esp
function_java_lang_Float_$cldestroy$_line_0:
function_java_lang_Float_$cldestroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;=================================================
;Starting function [$init$_J_V] (P:2 - 3;L:0 - 0)
function_java_lang_Long_$init$_J_V_line_start:
push ebp
mov ebp, esp
function_java_lang_Long_$init$_J_V_line_0:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_Long_$init$_J_V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_java_lang_Long_$init$_J_V_line_4:
jmp function_java_lang_Long_$init$_J_V_line_exit
function_java_lang_Long_$init$_J_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [toString_J_Ljava_lang_String] (P:1 - 2;L:0 - 0)
function_java_lang_Long_toString_J_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_Long_toString_J_Ljava_lang_String_line_0:
mov eax, dword [ebp+4*3]
mov edx, dword [ebp+4*2]
push eax
push edx
function_java_lang_Long_toString_J_Ljava_lang_String_line_1:
mov eax, 4294967295
mov edx, 0
push eax
push edx
function_java_lang_Long_toString_J_Ljava_lang_String_line_4:
pop ecx
pop ebx
pop edx
pop eax
and eax, ebx
and edx, ecx
push eax
push edx
function_java_lang_Long_toString_J_Ljava_lang_String_line_5:
pop edx
pop eax
push eax
function_java_lang_Long_toString_J_Ljava_lang_String_line_6:
call function_java_lang_Integer_toString_I_Ljava_lang_String_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_Long_toString_J_Ljava_lang_String_line_9:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_Long_toString_J_Ljava_lang_String_line_exit
function_java_lang_Long_toString_J_Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$destroy$] (P:1 - 1;L:0 - 0)
function_java_lang_Long_$destroy$_line_start:
push ebp
mov ebp, esp
mov ebx, [ebp+4*2]
function_java_lang_Long_$destroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [$cldestroy$] (P:0 - 0;L:0 - 0)
function_java_lang_Long_$cldestroy$_line_start:
push ebp
mov ebp, esp
function_java_lang_Long_$cldestroy$_line_0:
function_java_lang_Long_$cldestroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;=================================================
;Starting function [$init$__V] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_InternalObject_$init$__V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_InternalObject_$init$__V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_InternalObject_$init$__V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_pusty_f0xC_imports_InternalObject_$init$__V_line_4:
jmp function_pusty_f0xC_imports_InternalObject_$init$__V_line_exit
function_pusty_f0xC_imports_InternalObject_$init$__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [getRef_Ljava_lang_Object_S] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_InternalObject_getRef_Ljava_lang_Object_S_line_start:
mov ebx, [esp+4*1]
xor eax, eax
mov ax, [ebx+4]
function_pusty_f0xC_imports_InternalObject_getRef_Ljava_lang_Object_S_line_exit:
push eax
pop eax
ret

;Starting function [getSize_Ljava_lang_Object_S] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_InternalObject_getSize_Ljava_lang_Object_S_line_start:
mov ebx, [esp+4*1]
xor eax, eax
mov ax, [ebx+6]
function_pusty_f0xC_imports_InternalObject_getSize_Ljava_lang_Object_S_line_exit:
push eax
pop eax
ret

;Starting function [getID_Ljava_lang_Object_I] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_InternalObject_getID_Ljava_lang_Object_I_line_start:
mov ebx, [esp+4*1]
mov eax, [ebx+0]
function_pusty_f0xC_imports_InternalObject_getID_Ljava_lang_Object_I_line_exit:
push eax
pop eax
ret

;Starting function [getMem_Ljava_lang_ObjectI_B] (P:2 - 2;L:0 - 0)
function_pusty_f0xC_imports_InternalObject_getMem_Ljava_lang_ObjectI_B_line_start:
mov ebx, [esp+4*2]
add ebx, [esp+4*1]
xor eax, eax
mov al, [ebx]
function_pusty_f0xC_imports_InternalObject_getMem_Ljava_lang_ObjectI_B_line_exit:
push eax
pop eax
ret

;Starting function [setRef_Ljava_lang_ObjectS_V] (P:2 - 2;L:0 - 0)
function_pusty_f0xC_imports_InternalObject_setRef_Ljava_lang_ObjectS_V_line_start:
mov ebx, [esp+4*2]
mov ecx, [esp+4*1]
mov [ebx+4], cx
function_pusty_f0xC_imports_InternalObject_setRef_Ljava_lang_ObjectS_V_line_exit:
push eax
pop eax
ret

;Starting function [setSize_Ljava_lang_ObjectS_V] (P:2 - 2;L:0 - 0)
function_pusty_f0xC_imports_InternalObject_setSize_Ljava_lang_ObjectS_V_line_start:
mov ebx, [esp+4*2]
mov ecx, [esp+4*1]
mov [ebx+6], cx
function_pusty_f0xC_imports_InternalObject_setSize_Ljava_lang_ObjectS_V_line_exit:
push eax
pop eax
ret

;Starting function [setID_Ljava_lang_ObjectI_V] (P:2 - 2;L:0 - 0)
function_pusty_f0xC_imports_InternalObject_setID_Ljava_lang_ObjectI_V_line_start:
mov ebx, [esp+4*2]
mov ecx, [esp+4*1]
mov [ebx+0], ecx
function_pusty_f0xC_imports_InternalObject_setID_Ljava_lang_ObjectI_V_line_exit:
push eax
pop eax
ret

;Starting function [setMem_Ljava_lang_ObjectIB_V] (P:3 - 3;L:0 - 0)
function_pusty_f0xC_imports_InternalObject_setMem_Ljava_lang_ObjectIB_V_line_start:
mov eax, [esp+4*3]
add eax, [esp+4*2]
mov ebx, [esp+4*1]
mov [eax], bl
function_pusty_f0xC_imports_InternalObject_setMem_Ljava_lang_ObjectIB_V_line_exit:
push eax
pop eax
ret

;Starting function [destroy_Ljava_lang_Object_V] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_InternalObject_destroy_Ljava_lang_Object_V_line_start:
push ebp
mov ebp, esp
mov eax, [ebp+4*2]
push eax
mov eax, [eax+0]
call dword [eax+4*0]
add esp, 4
function_pusty_f0xC_imports_InternalObject_destroy_Ljava_lang_Object_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [int2obj_I_Ljava_lang_Object] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_InternalObject_int2obj_I_Ljava_lang_Object_line_start:
mov eax, [esp+4*1]
function_pusty_f0xC_imports_InternalObject_int2obj_I_Ljava_lang_Object_line_exit:
push eax
pop eax
ret

;Starting function [obj2int_Ljava_lang_Object_I] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_InternalObject_obj2int_Ljava_lang_Object_I_line_start:
mov eax, [esp+4*1]
function_pusty_f0xC_imports_InternalObject_obj2int_Ljava_lang_Object_I_line_exit:
push eax
pop eax
ret

;Starting function [obj2str_Ljava_lang_Object_I] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_InternalObject_obj2str_Ljava_lang_Object_I_line_start:
mov ebx, [esp+4*1]
mov eax, [ebx+0]
mov eax, [eax+4*1]
function_pusty_f0xC_imports_InternalObject_obj2str_Ljava_lang_Object_I_line_exit:
push eax
pop eax
ret

;Starting function [con2int_Ljava_lang_Object_I] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_InternalObject_con2int_Ljava_lang_Object_I_line_start:
mov ebx, [esp+4*1]
lea eax, [ebx+12]
function_pusty_f0xC_imports_InternalObject_con2int_Ljava_lang_Object_I_line_exit:
push eax
pop eax
ret

;Starting function [$destroy$] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_InternalObject_$destroy$_line_start:
push ebp
mov ebp, esp
mov ebx, [ebp+4*2]
function_pusty_f0xC_imports_InternalObject_$destroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [$cldestroy$] (P:0 - 0;L:0 - 0)
function_pusty_f0xC_imports_InternalObject_$cldestroy$_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_InternalObject_$cldestroy$_line_0:
function_pusty_f0xC_imports_InternalObject_$cldestroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;=================================================
;Starting function [$init$_I_V] (P:2 - 2;L:0 - 0)
function_pusty_f0xC_imports_GarbageCollector_$init$_I_V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_GarbageCollector_$init$_I_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_GarbageCollector_$init$_I_V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_pusty_f0xC_imports_GarbageCollector_$init$_I_V_line_4:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_GarbageCollector_$init$_I_V_line_5:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_GarbageCollector_$init$_I_V_line_6:
pop eax
pop ebx
mov dword [ebx+12], eax
function_pusty_f0xC_imports_GarbageCollector_$init$_I_V_line_9:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_GarbageCollector_$init$_I_V_line_10:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_GarbageCollector_$init$_I_V_line_11:
mov eax, 2
push eax
function_pusty_f0xC_imports_GarbageCollector_$init$_I_V_line_12:
pop ebx
pop eax
imul eax, ebx
push eax
function_pusty_f0xC_imports_GarbageCollector_$init$_I_V_line_13:
pop ecx
mov eax, array_class
push ecx
push eax
imul eax, ecx, 4
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
push eax
function_pusty_f0xC_imports_GarbageCollector_$init$_I_V_line_15:
pop eax
pop ebx
push ebx
push eax
mov eax, dword [ebx+8]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
pop ebx
mov dword [ebx+8], eax
function_pusty_f0xC_imports_GarbageCollector_$init$_I_V_line_18:
jmp function_pusty_f0xC_imports_GarbageCollector_$init$_I_V_line_exit
function_pusty_f0xC_imports_GarbageCollector_$init$_I_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [add_Ljava_lang_ObjectI_Z] (P:3 - 3;L:2 - 2)
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_start:
push ebp
call function_pusty_f0xC_imports_Internal_garbage_disable_I_V_line_start
mov ebp, esp
sub esp, 4*2
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_0:
mov eax, 0
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_1:
pop eax
mov dword [ebp-4*1], eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_2:
jmp function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_65
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_5:
mov eax, dword [ebp-4*1]
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_6:
mov eax, 2
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_7:
pop ebx
pop eax
imul eax, ebx
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_8:
pop eax
mov dword [ebp-4*2], eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_10:
mov eax, dword [ebp+4*4]
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_11:
pop ebx
mov eax, dword [ebx+8]
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_14:
mov eax, dword [ebp-4*2]
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_16:
mov eax, 0
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_17:
pop ebx
pop eax
add eax, ebx
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_18:
pop ecx
pop ebx
imul ecx, ecx, 4
add ebx, ecx
add ebx, 12
mov eax, [ebx]
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_19:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
jne function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_62
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_22:
mov eax, dword [ebp+4*4]
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_23:
pop ebx
mov eax, dword [ebx+8]
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_26:
mov eax, dword [ebp-4*2]
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_28:
mov eax, 0
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_29:
pop ebx
pop eax
add eax, ebx
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_30:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_31:
call function_pusty_f0xC_imports_InternalObject_obj2int_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_34:
pop eax
pop ecx
pop ebx
imul ecx, ecx, 4
add ebx, ecx
add ebx, 12
mov [ebx], eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_35:
mov eax, dword [ebp+4*4]
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_36:
pop ebx
mov eax, dword [ebx+8]
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_39:
mov eax, dword [ebp-4*2]
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_41:
mov eax, 1
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_42:
pop ebx
pop eax
add eax, ebx
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_43:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_44:
pop eax
pop ecx
pop ebx
imul ecx, ecx, 4
add ebx, ecx
add ebx, 12
mov [ebx], eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_45:
mov eax, dword [ebp+4*4]
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_46:
pop ebx
mov eax, dword [ebx+8]
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_49:
mov eax, dword [ebp-4*2]
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_51:
mov eax, 0
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_52:
pop ebx
pop eax
add eax, ebx
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_53:
pop ecx
pop ebx
imul ecx, ecx, 4
add ebx, ecx
add ebx, 12
mov eax, [ebx]
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_54:
call function_pusty_f0xC_imports_InternalObject_int2obj_I_Ljava_lang_Object_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_57:
call function_pusty_f0xC_imports_Internal_printGBReg_Ljava_lang_Object_V_line_start
add esp, 4*1
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_60:
mov eax, 1
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_61:
pop eax
jmp function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_exit
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_62:
mov eax, dword [ebp-4*1]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*1], eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_65:
mov eax, dword [ebp-4*1]
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_66:
mov eax, dword [ebp+4*4]
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_67:
pop ebx
mov eax, dword [ebx+12]
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_70:
pop ebx
pop eax
cmp eax, ebx
jl  function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_5
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_73:
mov eax, 0
push eax
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_74:
pop eax
jmp function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_exit
function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_enable_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [collect_I_V] (P:2 - 2;L:2 - 2)
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_start:
push ebp
call function_pusty_f0xC_imports_Internal_garbage_disable_I_V_line_start
mov ebp, esp
sub esp, 4*2
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_0:
mov eax, 0
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_1:
pop eax
mov dword [ebp-4*1], eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_2:
jmp function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_85
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_5:
mov eax, dword [ebp-4*1]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_6:
mov eax, 2
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_7:
pop ebx
pop eax
imul eax, ebx
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_8:
pop eax
mov dword [ebp-4*2], eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_9:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_10:
pop ebx
mov eax, dword [ebx+8]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_13:
mov eax, dword [ebp-4*2]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_14:
mov eax, 0
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_15:
pop ebx
pop eax
add eax, ebx
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_16:
pop ecx
pop ebx
imul ecx, ecx, 4
add ebx, ecx
add ebx, 12
mov eax, [ebx]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_17:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
je  function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_82
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_20:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_21:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_22:
pop ebx
mov eax, dword [ebx+8]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_25:
mov eax, dword [ebp-4*2]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_26:
mov eax, 1
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_27:
pop ebx
pop eax
add eax, ebx
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_28:
pop ecx
pop ebx
imul ecx, ecx, 4
add ebx, ecx
add ebx, 12
mov eax, [ebx]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_29:
pop ebx
pop eax
cmp eax, ebx
jge function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_36
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_32:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_33:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
jne function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_82
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_36:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_37:
pop ebx
mov eax, dword [ebx+8]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_40:
mov eax, dword [ebp-4*2]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_41:
mov eax, 0
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_42:
pop ebx
pop eax
add eax, ebx
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_43:
pop ecx
pop ebx
imul ecx, ecx, 4
add ebx, ecx
add ebx, 12
mov eax, [ebx]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_44:
call function_pusty_f0xC_imports_InternalObject_int2obj_I_Ljava_lang_Object_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_47:
call function_pusty_f0xC_imports_Internal_printGBFree_Ljava_lang_Object_V_line_start
add esp, 4*1
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_50:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_51:
pop ebx
mov eax, dword [ebx+8]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_54:
mov eax, dword [ebp-4*2]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_55:
mov eax, 0
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_56:
pop ebx
pop eax
add eax, ebx
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_57:
pop ecx
pop ebx
imul ecx, ecx, 4
add ebx, ecx
add ebx, 12
mov eax, [ebx]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_58:
call function_pusty_f0xC_imports_InternalObject_int2obj_I_Ljava_lang_Object_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_61:
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
add esp, 4*1
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_64:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_65:
pop ebx
mov eax, dword [ebx+8]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_68:
mov eax, dword [ebp-4*2]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_69:
mov eax, 0
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_70:
pop ebx
pop eax
add eax, ebx
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_71:
mov eax, 0
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_72:
pop eax
pop ecx
pop ebx
imul ecx, ecx, 4
add ebx, ecx
add ebx, 12
mov [ebx], eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_73:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_74:
pop ebx
mov eax, dword [ebx+8]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_77:
mov eax, dword [ebp-4*2]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_78:
mov eax, 1
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_79:
pop ebx
pop eax
add eax, ebx
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_80:
mov eax, 0
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_81:
pop eax
pop ecx
pop ebx
imul ecx, ecx, 4
add ebx, ecx
add ebx, 12
mov [ebx], eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_82:
mov eax, dword [ebp-4*1]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*1], eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_85:
mov eax, dword [ebp-4*1]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_86:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_87:
pop ebx
mov eax, dword [ebx+12]
push eax
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_90:
pop ebx
pop eax
cmp eax, ebx
jl  function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_5
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_93:
jmp function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_exit
function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_enable_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$destroy$] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_GarbageCollector_$destroy$_line_start:
push ebp
mov ebp, esp
mov ebx, [ebp+4*2]
mov eax, [ebx+8]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
function_pusty_f0xC_imports_GarbageCollector_$destroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [$cldestroy$] (P:0 - 0;L:0 - 0)
function_pusty_f0xC_imports_GarbageCollector_$cldestroy$_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_GarbageCollector_$cldestroy$_line_0:
function_pusty_f0xC_imports_GarbageCollector_$cldestroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;=================================================
;Starting function [$init$__V] (P:1 - 1;L:0 - 0)
function_java_io_OutputStream_$init$__V_line_start:
push ebp
mov ebp, esp
function_java_io_OutputStream_$init$__V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_io_OutputStream_$init$__V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_java_io_OutputStream_$init$__V_line_4:
jmp function_java_io_OutputStream_$init$__V_line_exit
function_java_io_OutputStream_$init$__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [write_I_V] (P:2 - 2;L:0 - 0)
function_java_io_OutputStream_write_I_V_line_start:
push ebp
mov ebp, esp
function_java_io_OutputStream_write_I_V_line_0:
jmp function_java_io_OutputStream_write_I_V_line_exit
function_java_io_OutputStream_write_I_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [write__B_V] (P:2 - 2;L:0 - 0)
function_java_io_OutputStream_write__B_V_line_start:
push ebp
mov ebp, esp
function_java_io_OutputStream_write__B_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_io_OutputStream_write__B_V_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_io_OutputStream_write__B_V_line_2:
mov eax, 0
push eax
function_java_io_OutputStream_write__B_V_line_3:
mov eax, dword [ebp+4*2]
push eax
function_java_io_OutputStream_write__B_V_line_4:
pop ebx
mov eax, [ebx+8]
push eax
function_java_io_OutputStream_write__B_V_line_5:
mov eax, dword [esp+4*3]
mov eax, dword [eax] ;VFC:write__BII_V
add eax, 4*7
call dword [eax] ;java_io_OutputStream.write__BII_V
add esp, 4*4
function_java_io_OutputStream_write__B_V_line_8:
jmp function_java_io_OutputStream_write__B_V_line_exit
function_java_io_OutputStream_write__B_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [write__BII_V] (P:4 - 4;L:2 - 2)
function_java_io_OutputStream_write__BII_V_line_start:
push ebp
mov ebp, esp
sub esp, 4*2
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
function_java_io_OutputStream_write__BII_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_io_OutputStream_write__BII_V_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_io_OutputStream_write__BII_V_line_2:
pop ebx
pop eax
add eax, ebx
push eax
function_java_io_OutputStream_write__BII_V_line_3:
pop eax
mov dword [ebp-4*1], eax
function_java_io_OutputStream_write__BII_V_line_5:
mov eax, dword [ebp+4*3]
push eax
function_java_io_OutputStream_write__BII_V_line_6:
pop eax
mov dword [ebp-4*2], eax
function_java_io_OutputStream_write__BII_V_line_8:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_io_OutputStream_write__BII_V_line_22
function_java_io_OutputStream_write__BII_V_line_11:
mov eax, dword [ebp+4*5]
push eax
function_java_io_OutputStream_write__BII_V_line_12:
mov eax, dword [ebp+4*4]
push eax
function_java_io_OutputStream_write__BII_V_line_13:
mov eax, dword [ebp-4*2]
push eax
function_java_io_OutputStream_write__BII_V_line_15:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_io_OutputStream_write__BII_V_line_16:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:write_I_V
add eax, 4*5
call dword [eax] ;java_io_OutputStream.write_I_V
add esp, 4*2
function_java_io_OutputStream_write__BII_V_line_19:
mov eax, dword [ebp-4*2]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*2], eax
function_java_io_OutputStream_write__BII_V_line_22:
mov eax, dword [ebp-4*2]
push eax
function_java_io_OutputStream_write__BII_V_line_24:
mov eax, dword [ebp-4*1]
push eax
function_java_io_OutputStream_write__BII_V_line_26:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_io_OutputStream_write__BII_V_line_11
function_java_io_OutputStream_write__BII_V_line_29:
jmp function_java_io_OutputStream_write__BII_V_line_exit
function_java_io_OutputStream_write__BII_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [flush__V] (P:1 - 1;L:0 - 0)
function_java_io_OutputStream_flush__V_line_start:
push ebp
mov ebp, esp
function_java_io_OutputStream_flush__V_line_0:
jmp function_java_io_OutputStream_flush__V_line_exit
function_java_io_OutputStream_flush__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [close__V] (P:1 - 1;L:0 - 0)
function_java_io_OutputStream_close__V_line_start:
push ebp
mov ebp, esp
function_java_io_OutputStream_close__V_line_0:
jmp function_java_io_OutputStream_close__V_line_exit
function_java_io_OutputStream_close__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$destroy$] (P:1 - 1;L:0 - 0)
function_java_io_OutputStream_$destroy$_line_start:
push ebp
mov ebp, esp
mov ebx, [ebp+4*2]
function_java_io_OutputStream_$destroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [$cldestroy$] (P:0 - 0;L:0 - 0)
function_java_io_OutputStream_$cldestroy$_line_start:
push ebp
mov ebp, esp
function_java_io_OutputStream_$cldestroy$_line_0:
function_java_io_OutputStream_$cldestroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;=================================================
;Starting function [$init$_Ljava_io_OutputStream_V] (P:2 - 2;L:0 - 0)
function_java_io_PrintStream_$init$_Ljava_io_OutputStream_V_line_start:
push ebp
mov ebp, esp
function_java_io_PrintStream_$init$_Ljava_io_OutputStream_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_$init$_Ljava_io_OutputStream_V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_java_io_PrintStream_$init$_Ljava_io_OutputStream_V_line_4:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_$init$_Ljava_io_OutputStream_V_line_5:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_$init$_Ljava_io_OutputStream_V_line_6:
pop eax
pop ebx
push ebx
push eax
mov eax, dword [ebx+8]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
pop ebx
mov dword [ebx+8], eax
function_java_io_PrintStream_$init$_Ljava_io_OutputStream_V_line_9:
jmp function_java_io_PrintStream_$init$_Ljava_io_OutputStream_V_line_exit
function_java_io_PrintStream_$init$_Ljava_io_OutputStream_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [flush__V] (P:1 - 1;L:0 - 0)
function_java_io_PrintStream_flush__V_line_start:
push ebp
mov ebp, esp
function_java_io_PrintStream_flush__V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_flush__V_line_1:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_io_PrintStream_flush__V_line_4:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:flush__V
add eax, 4*8
call dword [eax] ;java_io_OutputStream.flush__V
add esp, 4*1
function_java_io_PrintStream_flush__V_line_7:
jmp function_java_io_PrintStream_flush__V_line_exit
function_java_io_PrintStream_flush__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [write_I_V] (P:2 - 2;L:0 - 0)
function_java_io_PrintStream_write_I_V_line_start:
push ebp
mov ebp, esp
function_java_io_PrintStream_write_I_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_write_I_V_line_1:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_io_PrintStream_write_I_V_line_4:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_write_I_V_line_5:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:write_I_V
add eax, 4*5
call dword [eax] ;java_io_OutputStream.write_I_V
add esp, 4*2
function_java_io_PrintStream_write_I_V_line_8:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_write_I_V_line_9:
mov eax, 10
push eax
function_java_io_PrintStream_write_I_V_line_11:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_io_PrintStream_write_I_V_line_21
function_java_io_PrintStream_write_I_V_line_14:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_write_I_V_line_15:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_io_PrintStream_write_I_V_line_18:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:flush__V
add eax, 4*8
call dword [eax] ;java_io_OutputStream.flush__V
add esp, 4*1
function_java_io_PrintStream_write_I_V_line_21:
jmp function_java_io_PrintStream_write_I_V_line_exit
function_java_io_PrintStream_write_I_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [write__BII_V] (P:4 - 4;L:0 - 0)
function_java_io_PrintStream_write__BII_V_line_start:
push ebp
mov ebp, esp
function_java_io_PrintStream_write__BII_V_line_0:
mov eax, dword [ebp+4*5]
push eax
function_java_io_PrintStream_write__BII_V_line_1:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_io_PrintStream_write__BII_V_line_4:
mov eax, dword [ebp+4*4]
push eax
function_java_io_PrintStream_write__BII_V_line_5:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_write__BII_V_line_6:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_write__BII_V_line_7:
mov eax, dword [esp+4*3]
mov eax, dword [eax] ;VFC:write__BII_V
add eax, 4*7
call dword [eax] ;java_io_OutputStream.write__BII_V
add esp, 4*4
function_java_io_PrintStream_write__BII_V_line_10:
mov eax, dword [ebp+4*5]
push eax
function_java_io_PrintStream_write__BII_V_line_11:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_io_PrintStream_write__BII_V_line_14:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:flush__V
add eax, 4*8
call dword [eax] ;java_io_OutputStream.flush__V
add esp, 4*1
function_java_io_PrintStream_write__BII_V_line_17:
jmp function_java_io_PrintStream_write__BII_V_line_exit
function_java_io_PrintStream_write__BII_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [write__C_V] (P:2 - 2;L:2 - 2)
function_java_io_PrintStream_write__C_V_line_start:
push ebp
mov ebp, esp
sub esp, 4*2
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
function_java_io_PrintStream_write__C_V_line_0:
mov eax, 0
push eax
function_java_io_PrintStream_write__C_V_line_1:
pop eax
mov dword [ebp-4*1], eax
function_java_io_PrintStream_write__C_V_line_2:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_io_PrintStream_write__C_V_line_18
function_java_io_PrintStream_write__C_V_line_5:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_write__C_V_line_6:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_io_PrintStream_write__C_V_line_9:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_write__C_V_line_10:
mov eax, dword [ebp-4*1]
push eax
function_java_io_PrintStream_write__C_V_line_11:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_io_PrintStream_write__C_V_line_12:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:write_I_V
add eax, 4*5
call dword [eax] ;java_io_OutputStream.write_I_V
add esp, 4*2
function_java_io_PrintStream_write__C_V_line_15:
mov eax, dword [ebp-4*1]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*1], eax
function_java_io_PrintStream_write__C_V_line_18:
mov eax, dword [ebp-4*1]
push eax
function_java_io_PrintStream_write__C_V_line_19:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_write__C_V_line_20:
pop ebx
mov eax, [ebx+8]
push eax
function_java_io_PrintStream_write__C_V_line_21:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_io_PrintStream_write__C_V_line_5
function_java_io_PrintStream_write__C_V_line_24:
mov eax, 0
push eax
function_java_io_PrintStream_write__C_V_line_25:
pop eax
mov dword [ebp-4*1], eax
function_java_io_PrintStream_write__C_V_line_26:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_io_PrintStream_write__C_V_line_47
function_java_io_PrintStream_write__C_V_line_29:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_write__C_V_line_30:
mov eax, dword [ebp-4*1]
push eax
function_java_io_PrintStream_write__C_V_line_31:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_io_PrintStream_write__C_V_line_32:
mov eax, 10
push eax
function_java_io_PrintStream_write__C_V_line_34:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_io_PrintStream_write__C_V_line_44
function_java_io_PrintStream_write__C_V_line_37:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_write__C_V_line_38:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_io_PrintStream_write__C_V_line_41:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:flush__V
add eax, 4*8
call dword [eax] ;java_io_OutputStream.flush__V
add esp, 4*1
function_java_io_PrintStream_write__C_V_line_44:
mov eax, dword [ebp-4*1]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*1], eax
function_java_io_PrintStream_write__C_V_line_47:
mov eax, dword [ebp-4*1]
push eax
function_java_io_PrintStream_write__C_V_line_48:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_write__C_V_line_49:
pop ebx
mov eax, [ebx+8]
push eax
function_java_io_PrintStream_write__C_V_line_50:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_io_PrintStream_write__C_V_line_29
function_java_io_PrintStream_write__C_V_line_53:
jmp function_java_io_PrintStream_write__C_V_line_exit
function_java_io_PrintStream_write__C_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [write_Ljava_lang_String_V] (P:2 - 2;L:1 - 1)
function_java_io_PrintStream_write_Ljava_lang_String_V_line_start:
push ebp
mov ebp, esp
sub esp, 4*1
mov dword [esp+4*0], 0
function_java_io_PrintStream_write_Ljava_lang_String_V_line_0:
mov eax, 0
push eax
function_java_io_PrintStream_write_Ljava_lang_String_V_line_1:
pop eax
mov dword [ebp-4*1], eax
function_java_io_PrintStream_write_Ljava_lang_String_V_line_2:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_io_PrintStream_write_Ljava_lang_String_V_line_20
function_java_io_PrintStream_write_Ljava_lang_String_V_line_5:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_write_Ljava_lang_String_V_line_6:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_io_PrintStream_write_Ljava_lang_String_V_line_9:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_write_Ljava_lang_String_V_line_10:
mov eax, dword [ebp-4*1]
push eax
function_java_io_PrintStream_write_Ljava_lang_String_V_line_11:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:charAt_I_C
add eax, 4*7
call dword [eax] ;java_lang_String.charAt_I_C
add esp, 4*2
push eax
function_java_io_PrintStream_write_Ljava_lang_String_V_line_14:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:write_I_V
add eax, 4*5
call dword [eax] ;java_io_OutputStream.write_I_V
add esp, 4*2
function_java_io_PrintStream_write_Ljava_lang_String_V_line_17:
mov eax, dword [ebp-4*1]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*1], eax
function_java_io_PrintStream_write_Ljava_lang_String_V_line_20:
mov eax, dword [ebp-4*1]
push eax
function_java_io_PrintStream_write_Ljava_lang_String_V_line_21:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_write_Ljava_lang_String_V_line_22:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:length__I
add eax, 4*5
call dword [eax] ;java_lang_String.length__I
add esp, 4*1
push eax
function_java_io_PrintStream_write_Ljava_lang_String_V_line_25:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_io_PrintStream_write_Ljava_lang_String_V_line_5
function_java_io_PrintStream_write_Ljava_lang_String_V_line_28:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_write_Ljava_lang_String_V_line_29:
mov eax, 10
push eax
function_java_io_PrintStream_write_Ljava_lang_String_V_line_31:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:indexOf_I_I
add eax, 4*9
call dword [eax] ;java_lang_String.indexOf_I_I
add esp, 4*2
push eax
function_java_io_PrintStream_write_Ljava_lang_String_V_line_34:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_io_PrintStream_write_Ljava_lang_String_V_line_44
function_java_io_PrintStream_write_Ljava_lang_String_V_line_37:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_write_Ljava_lang_String_V_line_38:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_io_PrintStream_write_Ljava_lang_String_V_line_41:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:flush__V
add eax, 4*8
call dword [eax] ;java_io_OutputStream.flush__V
add esp, 4*1
function_java_io_PrintStream_write_Ljava_lang_String_V_line_44:
jmp function_java_io_PrintStream_write_Ljava_lang_String_V_line_exit
function_java_io_PrintStream_write_Ljava_lang_String_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [newLine__V] (P:1 - 1;L:0 - 0)
function_java_io_PrintStream_newLine__V_line_start:
push ebp
mov ebp, esp
function_java_io_PrintStream_newLine__V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_newLine__V_line_1:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_io_PrintStream_newLine__V_line_4:
mov eax, 10
push eax
function_java_io_PrintStream_newLine__V_line_6:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:write_I_V
add eax, 4*5
call dword [eax] ;java_io_OutputStream.write_I_V
add esp, 4*2
function_java_io_PrintStream_newLine__V_line_9:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_newLine__V_line_10:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_io_PrintStream_newLine__V_line_13:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:flush__V
add eax, 4*8
call dword [eax] ;java_io_OutputStream.flush__V
add esp, 4*1
function_java_io_PrintStream_newLine__V_line_16:
jmp function_java_io_PrintStream_newLine__V_line_exit
function_java_io_PrintStream_newLine__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [print_Z_V] (P:2 - 2;L:0 - 0)
function_java_io_PrintStream_print_Z_V_line_start:
push ebp
mov ebp, esp
function_java_io_PrintStream_print_Z_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_print_Z_V_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_print_Z_V_line_2:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_io_PrintStream_print_Z_V_line_10
function_java_io_PrintStream_print_Z_V_line_5:
mov eax, dword [stringmap_36758e]
push eax
function_java_io_PrintStream_print_Z_V_line_7:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_io_PrintStream_print_Z_V_line_12
function_java_io_PrintStream_print_Z_V_line_10:
mov eax, dword [stringmap_5cb1923]
push eax
function_java_io_PrintStream_print_Z_V_line_12:
call function_java_io_PrintStream_write_Ljava_lang_String_V_line_start
add esp, 4*2
function_java_io_PrintStream_print_Z_V_line_15:
jmp function_java_io_PrintStream_print_Z_V_line_exit
function_java_io_PrintStream_print_Z_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [print_C_V] (P:2 - 2;L:0 - 0)
function_java_io_PrintStream_print_C_V_line_start:
push ebp
mov ebp, esp
function_java_io_PrintStream_print_C_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_print_C_V_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_print_C_V_line_2:
call function_java_lang_String_valueOf_C_Ljava_lang_String_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_io_PrintStream_print_C_V_line_5:
call function_java_io_PrintStream_write_Ljava_lang_String_V_line_start
add esp, 4*2
function_java_io_PrintStream_print_C_V_line_8:
jmp function_java_io_PrintStream_print_C_V_line_exit
function_java_io_PrintStream_print_C_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [print_I_V] (P:2 - 2;L:0 - 0)
function_java_io_PrintStream_print_I_V_line_start:
push ebp
mov ebp, esp
function_java_io_PrintStream_print_I_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_print_I_V_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_print_I_V_line_2:
call function_java_lang_String_valueOf_I_Ljava_lang_String_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_io_PrintStream_print_I_V_line_5:
call function_java_io_PrintStream_write_Ljava_lang_String_V_line_start
add esp, 4*2
function_java_io_PrintStream_print_I_V_line_8:
jmp function_java_io_PrintStream_print_I_V_line_exit
function_java_io_PrintStream_print_I_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [print_J_V] (P:2 - 3;L:0 - 0)
function_java_io_PrintStream_print_J_V_line_start:
push ebp
mov ebp, esp
function_java_io_PrintStream_print_J_V_line_0:
mov eax, dword [ebp+4*4]
push eax
function_java_io_PrintStream_print_J_V_line_1:
mov eax, dword [ebp+4*3]
mov edx, dword [ebp+4*2]
push eax
push edx
function_java_io_PrintStream_print_J_V_line_2:
call function_java_lang_String_valueOf_J_Ljava_lang_String_line_start
add esp, 4*2
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_io_PrintStream_print_J_V_line_5:
call function_java_io_PrintStream_write_Ljava_lang_String_V_line_start
add esp, 4*2
function_java_io_PrintStream_print_J_V_line_8:
jmp function_java_io_PrintStream_print_J_V_line_exit
function_java_io_PrintStream_print_J_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [print_F_V] (P:2 - 2;L:0 - 0)
function_java_io_PrintStream_print_F_V_line_start:
push ebp
mov ebp, esp
function_java_io_PrintStream_print_F_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_print_F_V_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_print_F_V_line_2:
call function_java_lang_String_valueOf_F_Ljava_lang_String_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_io_PrintStream_print_F_V_line_5:
call function_java_io_PrintStream_write_Ljava_lang_String_V_line_start
add esp, 4*2
function_java_io_PrintStream_print_F_V_line_8:
jmp function_java_io_PrintStream_print_F_V_line_exit
function_java_io_PrintStream_print_F_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [print_D_V] (P:2 - 3;L:0 - 0)
function_java_io_PrintStream_print_D_V_line_start:
push ebp
mov ebp, esp
function_java_io_PrintStream_print_D_V_line_0:
mov eax, dword [ebp+4*4]
push eax
function_java_io_PrintStream_print_D_V_line_1:
mov eax, dword [ebp+4*3]
mov edx, dword [ebp+4*2]
push eax
push edx
function_java_io_PrintStream_print_D_V_line_2:
call function_java_lang_String_valueOf_D_Ljava_lang_String_line_start
add esp, 4*2
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_io_PrintStream_print_D_V_line_5:
call function_java_io_PrintStream_write_Ljava_lang_String_V_line_start
add esp, 4*2
function_java_io_PrintStream_print_D_V_line_8:
jmp function_java_io_PrintStream_print_D_V_line_exit
function_java_io_PrintStream_print_D_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [print__C_V] (P:2 - 2;L:0 - 0)
function_java_io_PrintStream_print__C_V_line_start:
push ebp
mov ebp, esp
function_java_io_PrintStream_print__C_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_print__C_V_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_print__C_V_line_2:
call function_java_io_PrintStream_write__C_V_line_start
add esp, 4*2
function_java_io_PrintStream_print__C_V_line_5:
jmp function_java_io_PrintStream_print__C_V_line_exit
function_java_io_PrintStream_print__C_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [print_Ljava_lang_String_V] (P:2 - 2;L:0 - 0)
function_java_io_PrintStream_print_Ljava_lang_String_V_line_start:
push ebp
mov ebp, esp
function_java_io_PrintStream_print_Ljava_lang_String_V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_print_Ljava_lang_String_V_line_1:
pop eax
cmp eax, 0
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_io_PrintStream_print_Ljava_lang_String_V_line_7
function_java_io_PrintStream_print_Ljava_lang_String_V_line_4:
mov eax, dword [stringmap_33c587]
push eax
function_java_io_PrintStream_print_Ljava_lang_String_V_line_6:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp+4*2], eax
function_java_io_PrintStream_print_Ljava_lang_String_V_line_7:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_print_Ljava_lang_String_V_line_8:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_print_Ljava_lang_String_V_line_9:
call function_java_io_PrintStream_write_Ljava_lang_String_V_line_start
add esp, 4*2
function_java_io_PrintStream_print_Ljava_lang_String_V_line_12:
jmp function_java_io_PrintStream_print_Ljava_lang_String_V_line_exit
function_java_io_PrintStream_print_Ljava_lang_String_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [print_Ljava_lang_Object_V] (P:2 - 2;L:0 - 0)
function_java_io_PrintStream_print_Ljava_lang_Object_V_line_start:
push ebp
mov ebp, esp
function_java_io_PrintStream_print_Ljava_lang_Object_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_print_Ljava_lang_Object_V_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_print_Ljava_lang_Object_V_line_2:
call function_java_lang_String_valueOf_Ljava_lang_Object_Ljava_lang_String_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_io_PrintStream_print_Ljava_lang_Object_V_line_5:
call function_java_io_PrintStream_write_Ljava_lang_String_V_line_start
add esp, 4*2
function_java_io_PrintStream_print_Ljava_lang_Object_V_line_8:
jmp function_java_io_PrintStream_print_Ljava_lang_Object_V_line_exit
function_java_io_PrintStream_print_Ljava_lang_Object_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [println__V] (P:1 - 1;L:0 - 0)
function_java_io_PrintStream_println__V_line_start:
push ebp
mov ebp, esp
function_java_io_PrintStream_println__V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_println__V_line_1:
call function_java_io_PrintStream_newLine__V_line_start
add esp, 4*1
function_java_io_PrintStream_println__V_line_4:
jmp function_java_io_PrintStream_println__V_line_exit
function_java_io_PrintStream_println__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [println_Z_V] (P:2 - 2;L:0 - 0)
function_java_io_PrintStream_println_Z_V_line_start:
push ebp
mov ebp, esp
function_java_io_PrintStream_println_Z_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_println_Z_V_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_println_Z_V_line_2:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:print_Z_V
add eax, 4*11
call dword [eax] ;java_io_PrintStream.print_Z_V
add esp, 4*2
function_java_io_PrintStream_println_Z_V_line_5:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_println_Z_V_line_6:
call function_java_io_PrintStream_newLine__V_line_start
add esp, 4*1
function_java_io_PrintStream_println_Z_V_line_9:
jmp function_java_io_PrintStream_println_Z_V_line_exit
function_java_io_PrintStream_println_Z_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [println_C_V] (P:2 - 2;L:0 - 0)
function_java_io_PrintStream_println_C_V_line_start:
push ebp
mov ebp, esp
function_java_io_PrintStream_println_C_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_println_C_V_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_println_C_V_line_2:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:print_C_V
add eax, 4*12
call dword [eax] ;java_io_PrintStream.print_C_V
add esp, 4*2
function_java_io_PrintStream_println_C_V_line_5:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_println_C_V_line_6:
call function_java_io_PrintStream_newLine__V_line_start
add esp, 4*1
function_java_io_PrintStream_println_C_V_line_9:
jmp function_java_io_PrintStream_println_C_V_line_exit
function_java_io_PrintStream_println_C_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [println_I_V] (P:2 - 2;L:0 - 0)
function_java_io_PrintStream_println_I_V_line_start:
push ebp
mov ebp, esp
function_java_io_PrintStream_println_I_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_println_I_V_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_println_I_V_line_2:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:print_I_V
add eax, 4*13
call dword [eax] ;java_io_PrintStream.print_I_V
add esp, 4*2
function_java_io_PrintStream_println_I_V_line_5:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_println_I_V_line_6:
call function_java_io_PrintStream_newLine__V_line_start
add esp, 4*1
function_java_io_PrintStream_println_I_V_line_9:
jmp function_java_io_PrintStream_println_I_V_line_exit
function_java_io_PrintStream_println_I_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [println_J_V] (P:2 - 3;L:0 - 0)
function_java_io_PrintStream_println_J_V_line_start:
push ebp
mov ebp, esp
function_java_io_PrintStream_println_J_V_line_0:
mov eax, dword [ebp+4*4]
push eax
function_java_io_PrintStream_println_J_V_line_1:
mov eax, dword [ebp+4*3]
mov edx, dword [ebp+4*2]
push eax
push edx
function_java_io_PrintStream_println_J_V_line_2:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:print_J_V
add eax, 4*14
call dword [eax] ;java_io_PrintStream.print_J_V
add esp, 4*3
function_java_io_PrintStream_println_J_V_line_5:
mov eax, dword [ebp+4*4]
push eax
function_java_io_PrintStream_println_J_V_line_6:
call function_java_io_PrintStream_newLine__V_line_start
add esp, 4*1
function_java_io_PrintStream_println_J_V_line_9:
jmp function_java_io_PrintStream_println_J_V_line_exit
function_java_io_PrintStream_println_J_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [println_F_V] (P:2 - 2;L:0 - 0)
function_java_io_PrintStream_println_F_V_line_start:
push ebp
mov ebp, esp
function_java_io_PrintStream_println_F_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_println_F_V_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_println_F_V_line_2:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:print_F_V
add eax, 4*15
call dword [eax] ;java_io_PrintStream.print_F_V
add esp, 4*2
function_java_io_PrintStream_println_F_V_line_5:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_println_F_V_line_6:
call function_java_io_PrintStream_newLine__V_line_start
add esp, 4*1
function_java_io_PrintStream_println_F_V_line_9:
jmp function_java_io_PrintStream_println_F_V_line_exit
function_java_io_PrintStream_println_F_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [println_D_V] (P:2 - 3;L:0 - 0)
function_java_io_PrintStream_println_D_V_line_start:
push ebp
mov ebp, esp
function_java_io_PrintStream_println_D_V_line_0:
mov eax, dword [ebp+4*4]
push eax
function_java_io_PrintStream_println_D_V_line_1:
mov eax, dword [ebp+4*3]
mov edx, dword [ebp+4*2]
push eax
push edx
function_java_io_PrintStream_println_D_V_line_2:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:print_D_V
add eax, 4*16
call dword [eax] ;java_io_PrintStream.print_D_V
add esp, 4*3
function_java_io_PrintStream_println_D_V_line_5:
mov eax, dword [ebp+4*4]
push eax
function_java_io_PrintStream_println_D_V_line_6:
call function_java_io_PrintStream_newLine__V_line_start
add esp, 4*1
function_java_io_PrintStream_println_D_V_line_9:
jmp function_java_io_PrintStream_println_D_V_line_exit
function_java_io_PrintStream_println_D_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [println__C_V] (P:2 - 2;L:0 - 0)
function_java_io_PrintStream_println__C_V_line_start:
push ebp
mov ebp, esp
function_java_io_PrintStream_println__C_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_println__C_V_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_println__C_V_line_2:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:print__C_V
add eax, 4*17
call dword [eax] ;java_io_PrintStream.print__C_V
add esp, 4*2
function_java_io_PrintStream_println__C_V_line_5:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_println__C_V_line_6:
call function_java_io_PrintStream_newLine__V_line_start
add esp, 4*1
function_java_io_PrintStream_println__C_V_line_9:
jmp function_java_io_PrintStream_println__C_V_line_exit
function_java_io_PrintStream_println__C_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [println_Ljava_lang_String_V] (P:2 - 2;L:0 - 0)
function_java_io_PrintStream_println_Ljava_lang_String_V_line_start:
push ebp
mov ebp, esp
function_java_io_PrintStream_println_Ljava_lang_String_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_println_Ljava_lang_String_V_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_println_Ljava_lang_String_V_line_2:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:print_Ljava_lang_String_V
add eax, 4*18
call dword [eax] ;java_io_PrintStream.print_Ljava_lang_String_V
add esp, 4*2
function_java_io_PrintStream_println_Ljava_lang_String_V_line_5:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_println_Ljava_lang_String_V_line_6:
call function_java_io_PrintStream_newLine__V_line_start
add esp, 4*1
function_java_io_PrintStream_println_Ljava_lang_String_V_line_9:
jmp function_java_io_PrintStream_println_Ljava_lang_String_V_line_exit
function_java_io_PrintStream_println_Ljava_lang_String_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [println_Ljava_lang_Object_V] (P:2 - 2;L:1 - 1)
function_java_io_PrintStream_println_Ljava_lang_Object_V_line_start:
push ebp
mov ebp, esp
sub esp, 4*1
mov dword [esp+4*0], 0
function_java_io_PrintStream_println_Ljava_lang_Object_V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_io_PrintStream_println_Ljava_lang_Object_V_line_1:
call function_java_lang_String_valueOf_Ljava_lang_Object_Ljava_lang_String_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_io_PrintStream_println_Ljava_lang_Object_V_line_4:
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*1], eax
function_java_io_PrintStream_println_Ljava_lang_Object_V_line_5:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_println_Ljava_lang_Object_V_line_6:
mov eax, dword [ebp-4*1]
push eax
function_java_io_PrintStream_println_Ljava_lang_Object_V_line_7:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:print_Ljava_lang_String_V
add eax, 4*18
call dword [eax] ;java_io_PrintStream.print_Ljava_lang_String_V
add esp, 4*2
function_java_io_PrintStream_println_Ljava_lang_Object_V_line_10:
mov eax, dword [ebp+4*3]
push eax
function_java_io_PrintStream_println_Ljava_lang_Object_V_line_11:
call function_java_io_PrintStream_newLine__V_line_start
add esp, 4*1
function_java_io_PrintStream_println_Ljava_lang_Object_V_line_14:
jmp function_java_io_PrintStream_println_Ljava_lang_Object_V_line_exit
function_java_io_PrintStream_println_Ljava_lang_Object_V_line_exit:
push eax
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$destroy$] (P:1 - 1;L:0 - 0)
function_java_io_PrintStream_$destroy$_line_start:
push ebp
mov ebp, esp
mov ebx, [ebp+4*2]
mov eax, [ebx+8]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
function_java_io_PrintStream_$destroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [$cldestroy$] (P:0 - 0;L:0 - 0)
function_java_io_PrintStream_$cldestroy$_line_start:
push ebp
mov ebp, esp
function_java_io_PrintStream_$cldestroy$_line_0:
function_java_io_PrintStream_$cldestroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;=================================================
;Starting function [$init$__V] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_Internal_$init$__V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_Internal_$init$__V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_$init$__V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_pusty_f0xC_imports_Internal_$init$__V_line_4:
jmp function_pusty_f0xC_imports_Internal_$init$__V_line_exit
function_pusty_f0xC_imports_Internal_$init$__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [createGB__V] (P:0 - 0;L:0 - 0)
function_pusty_f0xC_imports_Internal_createGB__V_line_start:
push ebp
call function_pusty_f0xC_imports_Internal_garbage_disable_I_V_line_start
mov ebp, esp
function_pusty_f0xC_imports_Internal_createGB__V_line_0:
mov eax, 0
push eax
function_pusty_f0xC_imports_Internal_createGB__V_line_1:
pop eax
mov dword [pusty_f0xC_imports_Internal_allocCalls], eax
function_pusty_f0xC_imports_Internal_createGB__V_line_4:
mov eax, 0
push eax
function_pusty_f0xC_imports_Internal_createGB__V_line_5:
pop eax
mov dword [pusty_f0xC_imports_Internal_allocMemory], eax
function_pusty_f0xC_imports_Internal_createGB__V_line_8:
mov eax, 0
push eax
function_pusty_f0xC_imports_Internal_createGB__V_line_9:
pop eax
mov dword [pusty_f0xC_imports_Internal_freeCalls], eax
function_pusty_f0xC_imports_Internal_createGB__V_line_12:
mov eax, 0
push eax
function_pusty_f0xC_imports_Internal_createGB__V_line_13:
pop eax
mov dword [pusty_f0xC_imports_Internal_freedMemory], eax
function_pusty_f0xC_imports_Internal_createGB__V_line_16:
mov eax, pusty_f0xC_imports_GarbageCollector_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
function_pusty_f0xC_imports_Internal_createGB__V_line_19:
pop eax
push eax
push eax
function_pusty_f0xC_imports_Internal_createGB__V_line_20:
mov eax, 64
push eax
function_pusty_f0xC_imports_Internal_createGB__V_line_22:
call function_pusty_f0xC_imports_GarbageCollector_$init$_I_V_line_start
add esp, 4*2
function_pusty_f0xC_imports_Internal_createGB__V_line_25:
mov eax, dword [pusty_f0xC_imports_Internal_gbCollector]
pop eax
mov dword [pusty_f0xC_imports_Internal_gbCollector], eax
function_pusty_f0xC_imports_Internal_createGB__V_line_28:
jmp function_pusty_f0xC_imports_Internal_createGB__V_line_exit
function_pusty_f0xC_imports_Internal_createGB__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_enable_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [deleteGB__V] (P:0 - 0;L:0 - 0)
function_pusty_f0xC_imports_Internal_deleteGB__V_line_start:
push ebp
call function_pusty_f0xC_imports_Internal_garbage_disable_I_V_line_start
mov ebp, esp
function_pusty_f0xC_imports_Internal_deleteGB__V_line_0:
mov eax, dword [pusty_f0xC_imports_Internal_gbCollector]
push eax
function_pusty_f0xC_imports_Internal_deleteGB__V_line_3:
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
add esp, 4*1
function_pusty_f0xC_imports_Internal_deleteGB__V_line_6:
jmp function_pusty_f0xC_imports_Internal_deleteGB__V_line_exit
function_pusty_f0xC_imports_Internal_deleteGB__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_enable_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [allocate_memory_II_Ljava_lang_Object] (P:2 - 2;L:2 - 2)
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start:
push ebp
call function_pusty_f0xC_imports_Internal_garbage_disable_I_V_line_start
mov ebp, esp
sub esp, 4*2
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_0:
mov eax, dword [pusty_f0xC_imports_Internal_allocCalls]
push eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_3:
mov eax, 1
push eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_4:
pop ebx
pop eax
add eax, ebx
push eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_5:
pop eax
mov dword [pusty_f0xC_imports_Internal_allocCalls], eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_8:
mov eax, dword [pusty_f0xC_imports_Internal_allocMemory]
push eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_11:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_12:
pop ebx
pop eax
add eax, ebx
push eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_13:
pop eax
mov dword [pusty_f0xC_imports_Internal_allocMemory], eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_16:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_17:
call function_pusty_f0xC_imports_LibC_malloc_I_Ljava_lang_Object_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_20:
mov eax, dword [ebp-4*1]
pop eax
mov dword [ebp-4*1], eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_21:
mov eax, 0
push eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_22:
pop eax
mov dword [ebp-4*2], eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_23:
jmp function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_35
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_26:
mov eax, dword [ebp-4*1]
push eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_27:
mov eax, dword [ebp-4*2]
push eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_28:
mov eax, 0
push eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_29:
call function_pusty_f0xC_imports_InternalObject_setMem_Ljava_lang_ObjectIB_V_line_start
add esp, 4*3
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_32:
mov eax, dword [ebp-4*2]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*2], eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_35:
mov eax, dword [ebp-4*2]
push eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_36:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_37:
pop ebx
pop eax
cmp eax, ebx
jl  function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_26
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_40:
mov eax, dword [ebp-4*1]
push eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_41:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_42:
call function_pusty_f0xC_imports_InternalObject_setID_Ljava_lang_ObjectI_V_line_start
add esp, 4*2
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_45:
mov eax, dword [ebp-4*1]
push eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_46:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_47:
pop eax
movsx eax, ax
push eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_48:
call function_pusty_f0xC_imports_InternalObject_setSize_Ljava_lang_ObjectS_V_line_start
add esp, 4*2
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_51:
mov eax, dword [ebp-4*1]
push eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_52:
mov eax, 0
push eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_53:
call function_pusty_f0xC_imports_InternalObject_setRef_Ljava_lang_ObjectS_V_line_start
add esp, 4*2
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_56:
mov eax, dword [ebp-4*1]
push eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_57:
call function_pusty_f0xC_imports_Internal_printAlloc_Ljava_lang_Object_V_line_start
add esp, 4*1
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_60:
mov eax, dword [ebp-4*1]
push eax
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_61:
pop eax
jmp function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_exit
function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_exit:
push eax
mov eax, dword [ebp-4*1]
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_enable_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [free_memory_Ljava_lang_Object_V] (P:1 - 1;L:1 - 1)
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start:
push ebp
call function_pusty_f0xC_imports_Internal_garbage_disable_I_V_line_start
mov ebp, esp
sub esp, 4*1
mov dword [esp+4*0], 0
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_1:
pop eax
cmp eax, 0
jne function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_5
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_4:
jmp function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_exit
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_5:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_6:
call function_pusty_f0xC_imports_InternalObject_getRef_Ljava_lang_Object_S_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_9:
pop eax
mov dword [ebp-4*1], eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_10:
mov eax, dword [ebp-4*1]
push eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_11:
mov eax, 1
push eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_12:
pop ebx
pop eax
sub eax, ebx
push eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_13:
pop eax
movsx eax, ax
push eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_14:
pop eax
mov dword [ebp-4*1], eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_15:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_16:
mov eax, dword [ebp-4*1]
push eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_17:
call function_pusty_f0xC_imports_InternalObject_setRef_Ljava_lang_ObjectS_V_line_start
add esp, 4*2
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_20:
mov eax, dword [ebp-4*1]
push eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_21:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
jle function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_25
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_24:
jmp function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_exit
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_25:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_26:
call function_pusty_f0xC_imports_InternalObject_getID_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_29:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
je  function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_36
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_32:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_33:
call function_pusty_f0xC_imports_InternalObject_destroy_Ljava_lang_Object_V_line_start
add esp, 4*1
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_36:
mov eax, dword [pusty_f0xC_imports_Internal_freedMemory]
push eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_39:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_40:
call function_pusty_f0xC_imports_InternalObject_getSize_Ljava_lang_Object_S_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_43:
pop ebx
pop eax
add eax, ebx
push eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_44:
pop eax
mov dword [pusty_f0xC_imports_Internal_freedMemory], eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_47:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_48:
call function_pusty_f0xC_imports_Internal_printFree_Ljava_lang_Object_V_line_start
add esp, 4*1
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_51:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_52:
call function_pusty_f0xC_imports_LibC_free_Ljava_lang_Object_V_line_start
add esp, 4*1
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_55:
mov eax, dword [pusty_f0xC_imports_Internal_freeCalls]
push eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_58:
mov eax, 1
push eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_59:
pop ebx
pop eax
add eax, ebx
push eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_60:
pop eax
mov dword [pusty_f0xC_imports_Internal_freeCalls], eax
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_63:
jmp function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_exit
function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_enable_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [inc_memory_Ljava_lang_Object_V] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start:
push ebp
call function_pusty_f0xC_imports_Internal_garbage_disable_I_V_line_start
mov ebp, esp
function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_1:
pop eax
cmp eax, 0
jne function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_5
function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_4:
jmp function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_exit
function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_5:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_6:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_7:
call function_pusty_f0xC_imports_InternalObject_getRef_Ljava_lang_Object_S_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_10:
mov eax, 1
push eax
function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_11:
pop ebx
pop eax
add eax, ebx
push eax
function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_12:
pop eax
movsx eax, ax
push eax
function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_13:
call function_pusty_f0xC_imports_InternalObject_setRef_Ljava_lang_ObjectS_V_line_start
add esp, 4*2
function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_16:
jmp function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_exit
function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_enable_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [garbage_register_Ljava_lang_ObjectI_V] (P:2 - 2;L:0 - 0)
function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_0:
mov eax, dword [pusty_f0xC_imports_Internal_gbStatus]
push eax
function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_3:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
je  function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_7
function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_6:
jmp function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_exit
function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_7:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_8:
pop eax
cmp eax, 0
jne function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_12
function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_11:
jmp function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_exit
function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_12:
mov eax, dword [pusty_f0xC_imports_Internal_gbCollector]
push eax
function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_15:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_16:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_17:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:add_Ljava_lang_ObjectI_Z
add eax, 4*5
call dword [eax] ;pusty_f0xC_imports_GarbageCollector.add_Ljava_lang_ObjectI_Z
add esp, 4*3
push eax
function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_20:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
jne function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_27
function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_23:
mov eax, 0
push eax
function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_24:
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
add esp, 4*1
function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_27:
jmp function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_exit
function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [garbage_collect_I_V] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_0:
mov eax, dword [pusty_f0xC_imports_Internal_gbStatus]
push eax
function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_3:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
je  function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_7
function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_6:
jmp function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_exit
function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_7:
mov eax, dword [pusty_f0xC_imports_Internal_gbCollector]
push eax
function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_10:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_11:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:collect_I_V
add eax, 4*6
call dword [eax] ;pusty_f0xC_imports_GarbageCollector.collect_I_V
add esp, 4*2
function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_14:
jmp function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_exit
function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [garbage_enable_I_V] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_Internal_garbage_enable_I_V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_Internal_garbage_enable_I_V_line_0:
mov eax, dword [pusty_f0xC_imports_Internal_gbStatus]
push eax
function_pusty_f0xC_imports_Internal_garbage_enable_I_V_line_3:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_garbage_enable_I_V_line_4:
pop ebx
pop eax
cmp eax, ebx
jne function_pusty_f0xC_imports_Internal_garbage_enable_I_V_line_11
function_pusty_f0xC_imports_Internal_garbage_enable_I_V_line_7:
mov eax, 0
push eax
function_pusty_f0xC_imports_Internal_garbage_enable_I_V_line_8:
pop eax
mov dword [pusty_f0xC_imports_Internal_gbStatus], eax
function_pusty_f0xC_imports_Internal_garbage_enable_I_V_line_11:
jmp function_pusty_f0xC_imports_Internal_garbage_enable_I_V_line_exit
function_pusty_f0xC_imports_Internal_garbage_enable_I_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [garbage_disable_I_V] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_Internal_garbage_disable_I_V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_Internal_garbage_disable_I_V_line_0:
mov eax, dword [pusty_f0xC_imports_Internal_gbStatus]
push eax
function_pusty_f0xC_imports_Internal_garbage_disable_I_V_line_3:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
jne function_pusty_f0xC_imports_Internal_garbage_disable_I_V_line_10
function_pusty_f0xC_imports_Internal_garbage_disable_I_V_line_6:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_garbage_disable_I_V_line_7:
pop eax
mov dword [pusty_f0xC_imports_Internal_gbStatus], eax
function_pusty_f0xC_imports_Internal_garbage_disable_I_V_line_10:
jmp function_pusty_f0xC_imports_Internal_garbage_disable_I_V_line_exit
function_pusty_f0xC_imports_Internal_garbage_disable_I_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [exit_I_V] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_Internal_exit_I_V_line_start:
push ebp
call function_pusty_f0xC_imports_Internal_garbage_disable_I_V_line_start
mov ebp, esp
function_pusty_f0xC_imports_Internal_exit_I_V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_exit_I_V_line_1:
call function_pusty_f0xC_imports_LibC_exit_I_V_line_start
add esp, 4*1
function_pusty_f0xC_imports_Internal_exit_I_V_line_4:
jmp function_pusty_f0xC_imports_Internal_exit_I_V_line_exit
function_pusty_f0xC_imports_Internal_exit_I_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_enable_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [garbage_collect_wrapper_I_V] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start:
  pushfd
  push dword [ebp]
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
  add esp, 4
  popfd
function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_exit:
push eax
pop eax
ret

;Starting function [diagnostics__V] (P:0 - 0;L:0 - 0)
function_pusty_f0xC_imports_Internal_diagnostics__V_line_start:
push ebp
call function_pusty_f0xC_imports_Internal_garbage_disable_I_V_line_start
mov ebp, esp
function_pusty_f0xC_imports_Internal_diagnostics__V_line_0:
mov eax, 2
push eax
function_pusty_f0xC_imports_Internal_diagnostics__V_line_1:
call function_pusty_f0xC_imports_LibC_getDBStr_I_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_diagnostics__V_line_4:
mov eax, 0
push eax
function_pusty_f0xC_imports_Internal_diagnostics__V_line_5:
mov eax, 0
push eax
function_pusty_f0xC_imports_Internal_diagnostics__V_line_6:
call function_pusty_f0xC_imports_LibC_printDG_III_V_line_start
add esp, 4*3
function_pusty_f0xC_imports_Internal_diagnostics__V_line_9:
mov eax, 1
push eax
function_pusty_f0xC_imports_Internal_diagnostics__V_line_10:
call function_pusty_f0xC_imports_LibC_getDBStr_I_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_diagnostics__V_line_13:
mov eax, dword [pusty_f0xC_imports_Internal_freeCalls]
push eax
function_pusty_f0xC_imports_Internal_diagnostics__V_line_16:
mov eax, dword [pusty_f0xC_imports_Internal_allocCalls]
push eax
function_pusty_f0xC_imports_Internal_diagnostics__V_line_19:
call function_pusty_f0xC_imports_LibC_printDG_III_V_line_start
add esp, 4*3
function_pusty_f0xC_imports_Internal_diagnostics__V_line_22:
mov eax, 0
push eax
function_pusty_f0xC_imports_Internal_diagnostics__V_line_23:
call function_pusty_f0xC_imports_LibC_getDBStr_I_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_diagnostics__V_line_26:
mov eax, dword [pusty_f0xC_imports_Internal_freedMemory]
push eax
function_pusty_f0xC_imports_Internal_diagnostics__V_line_29:
mov eax, dword [pusty_f0xC_imports_Internal_allocMemory]
push eax
function_pusty_f0xC_imports_Internal_diagnostics__V_line_32:
call function_pusty_f0xC_imports_LibC_printDG_III_V_line_start
add esp, 4*3
function_pusty_f0xC_imports_Internal_diagnostics__V_line_35:
mov eax, 3
push eax
function_pusty_f0xC_imports_Internal_diagnostics__V_line_36:
call function_pusty_f0xC_imports_LibC_getDBStr_I_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_diagnostics__V_line_39:
mov eax, 0
push eax
function_pusty_f0xC_imports_Internal_diagnostics__V_line_40:
mov eax, 0
push eax
function_pusty_f0xC_imports_Internal_diagnostics__V_line_41:
call function_pusty_f0xC_imports_LibC_printDG_III_V_line_start
add esp, 4*3
function_pusty_f0xC_imports_Internal_diagnostics__V_line_44:
jmp function_pusty_f0xC_imports_Internal_diagnostics__V_line_exit
function_pusty_f0xC_imports_Internal_diagnostics__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_enable_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [printAlloc_Ljava_lang_Object_V] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_Internal_printAlloc_Ljava_lang_Object_V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_Internal_printAlloc_Ljava_lang_Object_V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_printAlloc_Ljava_lang_Object_V_line_1:
pop eax
cmp eax, 0
jne function_pusty_f0xC_imports_Internal_printAlloc_Ljava_lang_Object_V_line_5
function_pusty_f0xC_imports_Internal_printAlloc_Ljava_lang_Object_V_line_4:
jmp function_pusty_f0xC_imports_Internal_printAlloc_Ljava_lang_Object_V_line_exit
function_pusty_f0xC_imports_Internal_printAlloc_Ljava_lang_Object_V_line_5:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_printAlloc_Ljava_lang_Object_V_line_6:
call function_pusty_f0xC_imports_InternalObject_getID_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_printAlloc_Ljava_lang_Object_V_line_9:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
jne function_pusty_f0xC_imports_Internal_printAlloc_Ljava_lang_Object_V_line_13
function_pusty_f0xC_imports_Internal_printAlloc_Ljava_lang_Object_V_line_12:
jmp function_pusty_f0xC_imports_Internal_printAlloc_Ljava_lang_Object_V_line_exit
function_pusty_f0xC_imports_Internal_printAlloc_Ljava_lang_Object_V_line_13:
mov eax, 5
push eax
function_pusty_f0xC_imports_Internal_printAlloc_Ljava_lang_Object_V_line_14:
call function_pusty_f0xC_imports_LibC_getDBStr_I_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_printAlloc_Ljava_lang_Object_V_line_17:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_printAlloc_Ljava_lang_Object_V_line_18:
call function_pusty_f0xC_imports_InternalObject_obj2str_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_printAlloc_Ljava_lang_Object_V_line_21:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_printAlloc_Ljava_lang_Object_V_line_22:
call function_pusty_f0xC_imports_InternalObject_obj2int_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_printAlloc_Ljava_lang_Object_V_line_25:
call function_pusty_f0xC_imports_LibC_printDB_III_V_line_start
add esp, 4*3
function_pusty_f0xC_imports_Internal_printAlloc_Ljava_lang_Object_V_line_28:
jmp function_pusty_f0xC_imports_Internal_printAlloc_Ljava_lang_Object_V_line_exit
function_pusty_f0xC_imports_Internal_printAlloc_Ljava_lang_Object_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [printFree_Ljava_lang_Object_V] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_Internal_printFree_Ljava_lang_Object_V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_Internal_printFree_Ljava_lang_Object_V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_printFree_Ljava_lang_Object_V_line_1:
pop eax
cmp eax, 0
jne function_pusty_f0xC_imports_Internal_printFree_Ljava_lang_Object_V_line_5
function_pusty_f0xC_imports_Internal_printFree_Ljava_lang_Object_V_line_4:
jmp function_pusty_f0xC_imports_Internal_printFree_Ljava_lang_Object_V_line_exit
function_pusty_f0xC_imports_Internal_printFree_Ljava_lang_Object_V_line_5:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_printFree_Ljava_lang_Object_V_line_6:
call function_pusty_f0xC_imports_InternalObject_getID_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_printFree_Ljava_lang_Object_V_line_9:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
jne function_pusty_f0xC_imports_Internal_printFree_Ljava_lang_Object_V_line_13
function_pusty_f0xC_imports_Internal_printFree_Ljava_lang_Object_V_line_12:
jmp function_pusty_f0xC_imports_Internal_printFree_Ljava_lang_Object_V_line_exit
function_pusty_f0xC_imports_Internal_printFree_Ljava_lang_Object_V_line_13:
mov eax, 4
push eax
function_pusty_f0xC_imports_Internal_printFree_Ljava_lang_Object_V_line_14:
call function_pusty_f0xC_imports_LibC_getDBStr_I_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_printFree_Ljava_lang_Object_V_line_17:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_printFree_Ljava_lang_Object_V_line_18:
call function_pusty_f0xC_imports_InternalObject_obj2str_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_printFree_Ljava_lang_Object_V_line_21:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_printFree_Ljava_lang_Object_V_line_22:
call function_pusty_f0xC_imports_InternalObject_obj2int_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_printFree_Ljava_lang_Object_V_line_25:
call function_pusty_f0xC_imports_LibC_printDB_III_V_line_start
add esp, 4*3
function_pusty_f0xC_imports_Internal_printFree_Ljava_lang_Object_V_line_28:
jmp function_pusty_f0xC_imports_Internal_printFree_Ljava_lang_Object_V_line_exit
function_pusty_f0xC_imports_Internal_printFree_Ljava_lang_Object_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [printGBReg_Ljava_lang_Object_V] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_Internal_printGBReg_Ljava_lang_Object_V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_Internal_printGBReg_Ljava_lang_Object_V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_printGBReg_Ljava_lang_Object_V_line_1:
pop eax
cmp eax, 0
jne function_pusty_f0xC_imports_Internal_printGBReg_Ljava_lang_Object_V_line_5
function_pusty_f0xC_imports_Internal_printGBReg_Ljava_lang_Object_V_line_4:
jmp function_pusty_f0xC_imports_Internal_printGBReg_Ljava_lang_Object_V_line_exit
function_pusty_f0xC_imports_Internal_printGBReg_Ljava_lang_Object_V_line_5:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_printGBReg_Ljava_lang_Object_V_line_6:
call function_pusty_f0xC_imports_InternalObject_getID_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_printGBReg_Ljava_lang_Object_V_line_9:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
jne function_pusty_f0xC_imports_Internal_printGBReg_Ljava_lang_Object_V_line_13
function_pusty_f0xC_imports_Internal_printGBReg_Ljava_lang_Object_V_line_12:
jmp function_pusty_f0xC_imports_Internal_printGBReg_Ljava_lang_Object_V_line_exit
function_pusty_f0xC_imports_Internal_printGBReg_Ljava_lang_Object_V_line_13:
mov eax, 6
push eax
function_pusty_f0xC_imports_Internal_printGBReg_Ljava_lang_Object_V_line_15:
call function_pusty_f0xC_imports_LibC_getDBStr_I_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_printGBReg_Ljava_lang_Object_V_line_18:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_printGBReg_Ljava_lang_Object_V_line_19:
call function_pusty_f0xC_imports_InternalObject_obj2str_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_printGBReg_Ljava_lang_Object_V_line_22:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_printGBReg_Ljava_lang_Object_V_line_23:
call function_pusty_f0xC_imports_InternalObject_obj2int_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_printGBReg_Ljava_lang_Object_V_line_26:
call function_pusty_f0xC_imports_LibC_printDB_III_V_line_start
add esp, 4*3
function_pusty_f0xC_imports_Internal_printGBReg_Ljava_lang_Object_V_line_29:
jmp function_pusty_f0xC_imports_Internal_printGBReg_Ljava_lang_Object_V_line_exit
function_pusty_f0xC_imports_Internal_printGBReg_Ljava_lang_Object_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [printGBFree_Ljava_lang_Object_V] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_Internal_printGBFree_Ljava_lang_Object_V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_Internal_printGBFree_Ljava_lang_Object_V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_printGBFree_Ljava_lang_Object_V_line_1:
pop eax
cmp eax, 0
jne function_pusty_f0xC_imports_Internal_printGBFree_Ljava_lang_Object_V_line_5
function_pusty_f0xC_imports_Internal_printGBFree_Ljava_lang_Object_V_line_4:
jmp function_pusty_f0xC_imports_Internal_printGBFree_Ljava_lang_Object_V_line_exit
function_pusty_f0xC_imports_Internal_printGBFree_Ljava_lang_Object_V_line_5:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_printGBFree_Ljava_lang_Object_V_line_6:
call function_pusty_f0xC_imports_InternalObject_getID_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_printGBFree_Ljava_lang_Object_V_line_9:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
jne function_pusty_f0xC_imports_Internal_printGBFree_Ljava_lang_Object_V_line_13
function_pusty_f0xC_imports_Internal_printGBFree_Ljava_lang_Object_V_line_12:
jmp function_pusty_f0xC_imports_Internal_printGBFree_Ljava_lang_Object_V_line_exit
function_pusty_f0xC_imports_Internal_printGBFree_Ljava_lang_Object_V_line_13:
mov eax, 7
push eax
function_pusty_f0xC_imports_Internal_printGBFree_Ljava_lang_Object_V_line_15:
call function_pusty_f0xC_imports_LibC_getDBStr_I_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_printGBFree_Ljava_lang_Object_V_line_18:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_printGBFree_Ljava_lang_Object_V_line_19:
call function_pusty_f0xC_imports_InternalObject_obj2str_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_printGBFree_Ljava_lang_Object_V_line_22:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_Internal_printGBFree_Ljava_lang_Object_V_line_23:
call function_pusty_f0xC_imports_InternalObject_obj2int_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_Internal_printGBFree_Ljava_lang_Object_V_line_26:
call function_pusty_f0xC_imports_LibC_printDB_III_V_line_start
add esp, 4*3
function_pusty_f0xC_imports_Internal_printGBFree_Ljava_lang_Object_V_line_29:
jmp function_pusty_f0xC_imports_Internal_printGBFree_Ljava_lang_Object_V_line_exit
function_pusty_f0xC_imports_Internal_printGBFree_Ljava_lang_Object_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [$destroy$] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_Internal_$destroy$_line_start:
push ebp
mov ebp, esp
mov ebx, [ebp+4*2]
function_pusty_f0xC_imports_Internal_$destroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [$cldestroy$] (P:0 - 0;L:0 - 0)
function_pusty_f0xC_imports_Internal_$cldestroy$_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_Internal_$cldestroy$_line_0:
mov eax, [pusty_f0xC_imports_Internal_gbCollector]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
function_pusty_f0xC_imports_Internal_$cldestroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;=================================================
;Starting function [$init$__V] (P:1 - 1;L:0 - 0)
function_example_windows_Example_$init$__V_line_start:
push ebp
mov ebp, esp
function_example_windows_Example_$init$__V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_example_windows_Example_$init$__V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_example_windows_Example_$init$__V_line_4:
jmp function_example_windows_Example_$init$__V_line_exit
function_example_windows_Example_$init$__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [main__Ljava_lang_String_V] (P:1 - 1;L:0 - 0)
function_example_windows_Example_main__Ljava_lang_String_V_line_start:
push ebp
mov ebp, esp
function_example_windows_Example_main__Ljava_lang_String_V_line_0:
mov eax, 1000
push eax
function_example_windows_Example_main__Ljava_lang_String_V_line_3:
call dword [Sleep]
function_example_windows_Example_main__Ljava_lang_String_V_line_6:
mov eax, 0
push eax
function_example_windows_Example_main__Ljava_lang_String_V_line_7:
mov eax, dword [stringmap_dd9]
push eax
function_example_windows_Example_main__Ljava_lang_String_V_line_9:
mov eax, dword [stringmap_33ae2f]
push eax
function_example_windows_Example_main__Ljava_lang_String_V_line_11:
mov eax, 1
push eax
function_example_windows_Example_main__Ljava_lang_String_V_line_12:
call function_pusty_f0xC_rt_windows_WindowsImportUtil_MessageBox_ILjava_lang_StringLjava_lang_StringI_Z_line_start
add esp, 4*4
push eax
function_example_windows_Example_main__Ljava_lang_String_V_line_15:
pop eax
function_example_windows_Example_main__Ljava_lang_String_V_line_16:
jmp function_example_windows_Example_main__Ljava_lang_String_V_line_exit
function_example_windows_Example_main__Ljava_lang_String_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$destroy$] (P:1 - 1;L:0 - 0)
function_example_windows_Example_$destroy$_line_start:
push ebp
mov ebp, esp
mov ebx, [ebp+4*2]
function_example_windows_Example_$destroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [$cldestroy$] (P:0 - 0;L:0 - 0)
function_example_windows_Example_$cldestroy$_line_start:
push ebp
mov ebp, esp
function_example_windows_Example_$cldestroy$_line_0:
function_example_windows_Example_$cldestroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;=================================================
;Starting function [toString__Ljava_lang_String] (P:1 - 1;L:0 - 0)
function_java_lang_Object_toString__Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_Object_toString__Ljava_lang_String_line_0:
mov eax, dword [stringmap_15876a41]
push eax
function_java_lang_Object_toString__Ljava_lang_String_line_2:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_Object_toString__Ljava_lang_String_line_exit
function_java_lang_Object_toString__Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [hashCode__I] (P:1 - 1;L:0 - 0)
function_java_lang_Object_hashCode__I_line_start:
push ebp
mov ebp, esp
function_java_lang_Object_hashCode__I_line_0:
mov eax, 0
push eax
function_java_lang_Object_hashCode__I_line_1:
pop eax
jmp function_java_lang_Object_hashCode__I_line_exit
function_java_lang_Object_hashCode__I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [equals_Ljava_lang_Object_Z] (P:2 - 2;L:0 - 0)
function_java_lang_Object_equals_Ljava_lang_Object_Z_line_start:
push ebp
mov ebp, esp
function_java_lang_Object_equals_Ljava_lang_Object_Z_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Object_equals_Ljava_lang_Object_Z_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Object_equals_Ljava_lang_Object_Z_line_2:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_Object_equals_Ljava_lang_Object_Z_line_7
function_java_lang_Object_equals_Ljava_lang_Object_Z_line_5:
mov eax, 1
push eax
function_java_lang_Object_equals_Ljava_lang_Object_Z_line_6:
pop eax
jmp function_java_lang_Object_equals_Ljava_lang_Object_Z_line_exit
function_java_lang_Object_equals_Ljava_lang_Object_Z_line_7:
mov eax, 0
push eax
function_java_lang_Object_equals_Ljava_lang_Object_Z_line_8:
pop eax
jmp function_java_lang_Object_equals_Ljava_lang_Object_Z_line_exit
function_java_lang_Object_equals_Ljava_lang_Object_Z_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$destroy$] (P:1 - 1;L:0 - 0)
function_java_lang_Object_$destroy$_line_start:
push ebp
mov ebp, esp
mov ebx, [ebp+4*2]
function_java_lang_Object_$destroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [$cldestroy$] (P:0 - 0;L:0 - 0)
function_java_lang_Object_$cldestroy$_line_start:
push ebp
mov ebp, esp
function_java_lang_Object_$cldestroy$_line_0:
function_java_lang_Object_$cldestroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;=================================================
;Starting function [$init$__V] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_rt_io_NativeOutputStream_$init$__V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_rt_io_NativeOutputStream_$init$__V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_rt_io_NativeOutputStream_$init$__V_line_1:
call function_java_io_OutputStream_$init$__V_line_start
add esp, 4*1
function_pusty_f0xC_rt_io_NativeOutputStream_$init$__V_line_4:
jmp function_pusty_f0xC_rt_io_NativeOutputStream_$init$__V_line_exit
function_pusty_f0xC_rt_io_NativeOutputStream_$init$__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [write_I_V] (P:2 - 2;L:0 - 0)
function_pusty_f0xC_rt_io_NativeOutputStream_write_I_V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_rt_io_NativeOutputStream_write_I_V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_rt_io_NativeOutputStream_write_I_V_line_1:
call dword [putchar]
add esp, 4*1
push eax
function_pusty_f0xC_rt_io_NativeOutputStream_write_I_V_line_4:
pop eax
function_pusty_f0xC_rt_io_NativeOutputStream_write_I_V_line_5:
jmp function_pusty_f0xC_rt_io_NativeOutputStream_write_I_V_line_exit
function_pusty_f0xC_rt_io_NativeOutputStream_write_I_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$destroy$] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_rt_io_NativeOutputStream_$destroy$_line_start:
push ebp
mov ebp, esp
mov ebx, [ebp+4*2]
function_pusty_f0xC_rt_io_NativeOutputStream_$destroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [$cldestroy$] (P:0 - 0;L:0 - 0)
function_pusty_f0xC_rt_io_NativeOutputStream_$cldestroy$_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_rt_io_NativeOutputStream_$cldestroy$_line_0:
function_pusty_f0xC_rt_io_NativeOutputStream_$cldestroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;=================================================
;Starting function [$init$__C_V] (P:2 - 2;L:1 - 1)
function_java_lang_String_$init$__C_V_line_start:
push ebp
mov ebp, esp
sub esp, 4*1
mov dword [esp+4*0], 0
function_java_lang_String_$init$__C_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_$init$__C_V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_java_lang_String_$init$__C_V_line_4:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_$init$__C_V_line_5:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_$init$__C_V_line_6:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_$init$__C_V_line_7:
pop ecx
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
push eax
function_java_lang_String_$init$__C_V_line_9:
pop eax
pop ebx
push ebx
push eax
mov eax, dword [ebx+12]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
pop ebx
mov dword [ebx+12], eax
function_java_lang_String_$init$__C_V_line_12:
mov eax, 0
push eax
function_java_lang_String_$init$__C_V_line_13:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_String_$init$__C_V_line_14:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_$init$__C_V_line_29
function_java_lang_String_$init$__C_V_line_17:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_$init$__C_V_line_18:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_$init$__C_V_line_21:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_$init$__C_V_line_22:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_$init$__C_V_line_23:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_$init$__C_V_line_24:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_$init$__C_V_line_25:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_String_$init$__C_V_line_26:
mov eax, dword [ebp-4*1]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*1], eax
function_java_lang_String_$init$__C_V_line_29:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_$init$__C_V_line_30:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_$init$__C_V_line_31:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_$init$__C_V_line_32:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_String_$init$__C_V_line_17
function_java_lang_String_$init$__C_V_line_35:
jmp function_java_lang_String_$init$__C_V_line_exit
function_java_lang_String_$init$__C_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$init$__B_V] (P:2 - 2;L:0 - 0)
function_java_lang_String_$init$__B_V_line_start:
push ebp
mov ebp, esp
function_java_lang_String_$init$__B_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_$init$__B_V_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_$init$__B_V_line_2:
mov eax, 0
push eax
function_java_lang_String_$init$__B_V_line_3:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_$init$__B_V_line_4:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_$init$__B_V_line_5:
call function_java_lang_String_$init$__BII_V_line_start
add esp, 4*4
function_java_lang_String_$init$__B_V_line_8:
jmp function_java_lang_String_$init$__B_V_line_exit
function_java_lang_String_$init$__B_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$init$__V] (P:1 - 1;L:0 - 0)
function_java_lang_String_$init$__V_line_start:
push ebp
mov ebp, esp
function_java_lang_String_$init$__V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_$init$__V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_java_lang_String_$init$__V_line_4:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_$init$__V_line_5:
mov eax, 0
push eax
function_java_lang_String_$init$__V_line_6:
pop ecx
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
push eax
function_java_lang_String_$init$__V_line_8:
pop eax
pop ebx
push ebx
push eax
mov eax, dword [ebx+12]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
pop ebx
mov dword [ebx+12], eax
function_java_lang_String_$init$__V_line_11:
jmp function_java_lang_String_$init$__V_line_exit
function_java_lang_String_$init$__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$init$_Ljava_lang_String_V] (P:2 - 2;L:0 - 0)
function_java_lang_String_$init$_Ljava_lang_String_V_line_start:
push ebp
mov ebp, esp
function_java_lang_String_$init$_Ljava_lang_String_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_$init$_Ljava_lang_String_V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_java_lang_String_$init$_Ljava_lang_String_V_line_4:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_$init$_Ljava_lang_String_V_line_5:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_$init$_Ljava_lang_String_V_line_6:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_$init$_Ljava_lang_String_V_line_9:
pop eax
pop ebx
push ebx
push eax
mov eax, dword [ebx+12]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
pop ebx
mov dword [ebx+12], eax
function_java_lang_String_$init$_Ljava_lang_String_V_line_12:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_$init$_Ljava_lang_String_V_line_13:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_$init$_Ljava_lang_String_V_line_14:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_String_$init$_Ljava_lang_String_V_line_17:
pop eax
pop ebx
mov dword [ebx+8], eax
function_java_lang_String_$init$_Ljava_lang_String_V_line_20:
jmp function_java_lang_String_$init$_Ljava_lang_String_V_line_exit
function_java_lang_String_$init$_Ljava_lang_String_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$init$__BII_V] (P:4 - 4;L:2 - 2)
function_java_lang_String_$init$__BII_V_line_start:
push ebp
mov ebp, esp
sub esp, 4*2
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
function_java_lang_String_$init$__BII_V_line_0:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_String_$init$__BII_V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_java_lang_String_$init$__BII_V_line_4:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_$init$__BII_V_line_5:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_String_$init$__BII_V_line_9
function_java_lang_String_$init$__BII_V_line_8:
jmp function_java_lang_String_$init$__BII_V_line_exit
function_java_lang_String_$init$__BII_V_line_9:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_$init$__BII_V_line_10:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_String_$init$__BII_V_line_14
function_java_lang_String_$init$__BII_V_line_13:
jmp function_java_lang_String_$init$__BII_V_line_exit
function_java_lang_String_$init$__BII_V_line_14:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_$init$__BII_V_line_15:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_$init$__BII_V_line_16:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_$init$__BII_V_line_17:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_$init$__BII_V_line_18:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_String_$init$__BII_V_line_19:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_String_$init$__BII_V_line_23
function_java_lang_String_$init$__BII_V_line_22:
jmp function_java_lang_String_$init$__BII_V_line_exit
function_java_lang_String_$init$__BII_V_line_23:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_$init$__BII_V_line_24:
pop ecx
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
push eax
function_java_lang_String_$init$__BII_V_line_26:
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*1], eax
function_java_lang_String_$init$__BII_V_line_28:
mov eax, 0
push eax
function_java_lang_String_$init$__BII_V_line_29:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_String_$init$__BII_V_line_31:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_$init$__BII_V_line_49
function_java_lang_String_$init$__BII_V_line_34:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_$init$__BII_V_line_36:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_$init$__BII_V_line_38:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_$init$__BII_V_line_39:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_$init$__BII_V_line_40:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_$init$__BII_V_line_42:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_String_$init$__BII_V_line_43:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_$init$__BII_V_line_44:
pop eax
movsx eax, al
push eax
function_java_lang_String_$init$__BII_V_line_45:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_String_$init$__BII_V_line_46:
mov eax, dword [ebp-4*2]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*2], eax
function_java_lang_String_$init$__BII_V_line_49:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_$init$__BII_V_line_51:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_$init$__BII_V_line_52:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_String_$init$__BII_V_line_34
function_java_lang_String_$init$__BII_V_line_55:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_String_$init$__BII_V_line_56:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_$init$__BII_V_line_58:
pop eax
pop ebx
push ebx
push eax
mov eax, dword [ebx+12]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
pop ebx
mov dword [ebx+12], eax
function_java_lang_String_$init$__BII_V_line_61:
jmp function_java_lang_String_$init$__BII_V_line_exit
function_java_lang_String_$init$__BII_V_line_exit:
push eax
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$init$__CII_V] (P:4 - 4;L:2 - 2)
function_java_lang_String_$init$__CII_V_line_start:
push ebp
mov ebp, esp
sub esp, 4*2
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
function_java_lang_String_$init$__CII_V_line_0:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_String_$init$__CII_V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_java_lang_String_$init$__CII_V_line_4:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_$init$__CII_V_line_5:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_String_$init$__CII_V_line_9
function_java_lang_String_$init$__CII_V_line_8:
jmp function_java_lang_String_$init$__CII_V_line_exit
function_java_lang_String_$init$__CII_V_line_9:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_$init$__CII_V_line_10:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_String_$init$__CII_V_line_14
function_java_lang_String_$init$__CII_V_line_13:
jmp function_java_lang_String_$init$__CII_V_line_exit
function_java_lang_String_$init$__CII_V_line_14:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_$init$__CII_V_line_15:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_$init$__CII_V_line_16:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_$init$__CII_V_line_17:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_$init$__CII_V_line_18:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_String_$init$__CII_V_line_19:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_String_$init$__CII_V_line_23
function_java_lang_String_$init$__CII_V_line_22:
jmp function_java_lang_String_$init$__CII_V_line_exit
function_java_lang_String_$init$__CII_V_line_23:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_$init$__CII_V_line_24:
pop ecx
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
push eax
function_java_lang_String_$init$__CII_V_line_26:
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*1], eax
function_java_lang_String_$init$__CII_V_line_28:
mov eax, 0
push eax
function_java_lang_String_$init$__CII_V_line_29:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_String_$init$__CII_V_line_31:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_$init$__CII_V_line_48
function_java_lang_String_$init$__CII_V_line_34:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_$init$__CII_V_line_36:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_$init$__CII_V_line_38:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_$init$__CII_V_line_39:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_$init$__CII_V_line_40:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_$init$__CII_V_line_42:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_String_$init$__CII_V_line_43:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_$init$__CII_V_line_44:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_String_$init$__CII_V_line_45:
mov eax, dword [ebp-4*2]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*2], eax
function_java_lang_String_$init$__CII_V_line_48:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_$init$__CII_V_line_50:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_$init$__CII_V_line_51:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_String_$init$__CII_V_line_34
function_java_lang_String_$init$__CII_V_line_54:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_String_$init$__CII_V_line_55:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_$init$__CII_V_line_57:
pop eax
pop ebx
push ebx
push eax
mov eax, dword [ebx+12]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
pop ebx
mov dword [ebx+12], eax
function_java_lang_String_$init$__CII_V_line_60:
jmp function_java_lang_String_$init$__CII_V_line_exit
function_java_lang_String_$init$__CII_V_line_exit:
push eax
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$init$_Ljava_lang_StringBuilder_V] (P:2 - 2;L:3 - 3)
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_start:
push ebp
mov ebp, esp
sub esp, 4*3
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
mov dword [esp+4*2], 0
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_4:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_5:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:getValue___C
add eax, 4*24
call dword [eax] ;java_lang_StringBuilder.getValue___C
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_8:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_9:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_10:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:length__I
add eax, 4*22
call dword [eax] ;java_lang_StringBuilder.length__I
add esp, 4*1
push eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_13:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_23
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_16:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_17:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:length__I
add eax, 4*22
call dword [eax] ;java_lang_StringBuilder.length__I
add esp, 4*1
push eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_20:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_28
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_23:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_24:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:getValue___C
add eax, 4*24
call dword [eax] ;java_lang_StringBuilder.getValue___C
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_27:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_28:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_29:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_30:
pop ecx
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
push eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_32:
mov eax, dword [ebp-4*2]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*2], eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_33:
mov eax, 0
push eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_34:
pop eax
mov dword [ebp-4*3], eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_36:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_52
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_39:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_40:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_42:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_43:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_45:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:charAt_I_C
add eax, 4*25
call dword [eax] ;java_lang_StringBuilder.charAt_I_C
add esp, 4*2
push eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_48:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_49:
mov eax, dword [ebp-4*3]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*3], eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_52:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_54:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_55:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_39
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_58:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_59:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_60:
pop eax
pop ebx
push ebx
push eax
mov eax, dword [ebx+12]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
pop ebx
mov dword [ebx+12], eax
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_63:
jmp function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_exit
function_java_lang_String_$init$_Ljava_lang_StringBuilder_V_line_exit:
push eax
mov eax, dword [ebp-4*2]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [length__I] (P:1 - 1;L:0 - 0)
function_java_lang_String_length__I_line_start:
push ebp
mov ebp, esp
function_java_lang_String_length__I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_length__I_line_1:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_length__I_line_4:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_length__I_line_5:
pop eax
jmp function_java_lang_String_length__I_line_exit
function_java_lang_String_length__I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [isEmpty__Z] (P:1 - 1;L:0 - 0)
function_java_lang_String_isEmpty__Z_line_start:
push ebp
mov ebp, esp
function_java_lang_String_isEmpty__Z_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_isEmpty__Z_line_1:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_isEmpty__Z_line_4:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_isEmpty__Z_line_5:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_String_isEmpty__Z_line_10
function_java_lang_String_isEmpty__Z_line_8:
mov eax, 1
push eax
function_java_lang_String_isEmpty__Z_line_9:
pop eax
jmp function_java_lang_String_isEmpty__Z_line_exit
function_java_lang_String_isEmpty__Z_line_10:
mov eax, 0
push eax
function_java_lang_String_isEmpty__Z_line_11:
pop eax
jmp function_java_lang_String_isEmpty__Z_line_exit
function_java_lang_String_isEmpty__Z_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [charAt_I_C] (P:2 - 2;L:0 - 0)
function_java_lang_String_charAt_I_C_line_start:
push ebp
mov ebp, esp
function_java_lang_String_charAt_I_C_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_charAt_I_C_line_1:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_String_charAt_I_C_line_13
function_java_lang_String_charAt_I_C_line_4:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_charAt_I_C_line_5:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_charAt_I_C_line_6:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_charAt_I_C_line_9:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_charAt_I_C_line_10:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_String_charAt_I_C_line_15
function_java_lang_String_charAt_I_C_line_13:
mov eax, 0
push eax
function_java_lang_String_charAt_I_C_line_14:
pop eax
jmp function_java_lang_String_charAt_I_C_line_exit
function_java_lang_String_charAt_I_C_line_15:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_charAt_I_C_line_16:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_charAt_I_C_line_19:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_charAt_I_C_line_20:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_charAt_I_C_line_21:
pop eax
jmp function_java_lang_String_charAt_I_C_line_exit
function_java_lang_String_charAt_I_C_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [getBytes___B] (P:1 - 1;L:2 - 2)
function_java_lang_String_getBytes___B_line_start:
push ebp
mov ebp, esp
sub esp, 4*2
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
function_java_lang_String_getBytes___B_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_getBytes___B_line_1:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_getBytes___B_line_4:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_getBytes___B_line_5:
pop ecx
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
push eax
function_java_lang_String_getBytes___B_line_7:
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*1], eax
function_java_lang_String_getBytes___B_line_8:
mov eax, 0
push eax
function_java_lang_String_getBytes___B_line_9:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_String_getBytes___B_line_10:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_getBytes___B_line_26
function_java_lang_String_getBytes___B_line_13:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_getBytes___B_line_14:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_getBytes___B_line_15:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_getBytes___B_line_16:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_getBytes___B_line_19:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_getBytes___B_line_20:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_getBytes___B_line_21:
pop eax
movsx eax, al
push eax
function_java_lang_String_getBytes___B_line_22:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_String_getBytes___B_line_23:
mov eax, dword [ebp-4*2]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*2], eax
function_java_lang_String_getBytes___B_line_26:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_getBytes___B_line_27:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_getBytes___B_line_28:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_getBytes___B_line_29:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_String_getBytes___B_line_13
function_java_lang_String_getBytes___B_line_32:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_getBytes___B_line_33:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_getBytes___B_line_exit
function_java_lang_String_getBytes___B_line_exit:
push eax
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [valueOf_C_Ljava_lang_String] (P:1 - 1;L:1 - 1)
function_java_lang_String_valueOf_C_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
sub esp, 4*1
mov dword [esp+4*0], 0
function_java_lang_String_valueOf_C_Ljava_lang_String_line_0:
mov eax, 1
push eax
function_java_lang_String_valueOf_C_Ljava_lang_String_line_1:
pop ecx
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
push eax
function_java_lang_String_valueOf_C_Ljava_lang_String_line_3:
pop eax
push eax
push eax
function_java_lang_String_valueOf_C_Ljava_lang_String_line_4:
mov eax, 0
push eax
function_java_lang_String_valueOf_C_Ljava_lang_String_line_5:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_valueOf_C_Ljava_lang_String_line_6:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_String_valueOf_C_Ljava_lang_String_line_7:
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*1], eax
function_java_lang_String_valueOf_C_Ljava_lang_String_line_8:
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_String_valueOf_C_Ljava_lang_String_line_11:
pop eax
push eax
push eax
function_java_lang_String_valueOf_C_Ljava_lang_String_line_12:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_valueOf_C_Ljava_lang_String_line_13:
call function_java_lang_String_$init$__C_V_line_start
add esp, 4*2
function_java_lang_String_valueOf_C_Ljava_lang_String_line_16:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_valueOf_C_Ljava_lang_String_line_exit
function_java_lang_String_valueOf_C_Ljava_lang_String_line_exit:
push eax
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [valueOf__C_Ljava_lang_String] (P:1 - 1;L:0 - 0)
function_java_lang_String_valueOf__C_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_String_valueOf__C_Ljava_lang_String_line_0:
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_String_valueOf__C_Ljava_lang_String_line_3:
pop eax
push eax
push eax
function_java_lang_String_valueOf__C_Ljava_lang_String_line_4:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_valueOf__C_Ljava_lang_String_line_5:
call function_java_lang_String_$init$__C_V_line_start
add esp, 4*2
function_java_lang_String_valueOf__C_Ljava_lang_String_line_8:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_valueOf__C_Ljava_lang_String_line_exit
function_java_lang_String_valueOf__C_Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [valueOf_Z_Ljava_lang_String] (P:1 - 1;L:0 - 0)
function_java_lang_String_valueOf_Z_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_String_valueOf_Z_Ljava_lang_String_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_valueOf_Z_Ljava_lang_String_line_1:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_String_valueOf_Z_Ljava_lang_String_line_9
function_java_lang_String_valueOf_Z_Ljava_lang_String_line_4:
mov eax, dword [stringmap_36758e]
push eax
function_java_lang_String_valueOf_Z_Ljava_lang_String_line_6:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_valueOf_Z_Ljava_lang_String_line_11
function_java_lang_String_valueOf_Z_Ljava_lang_String_line_9:
mov eax, dword [stringmap_5cb1923]
push eax
function_java_lang_String_valueOf_Z_Ljava_lang_String_line_11:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_valueOf_Z_Ljava_lang_String_line_exit
function_java_lang_String_valueOf_Z_Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [valueOf_I_Ljava_lang_String] (P:1 - 1;L:0 - 0)
function_java_lang_String_valueOf_I_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_String_valueOf_I_Ljava_lang_String_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_valueOf_I_Ljava_lang_String_line_1:
call function_java_lang_Integer_toString_I_Ljava_lang_String_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_String_valueOf_I_Ljava_lang_String_line_4:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_valueOf_I_Ljava_lang_String_line_exit
function_java_lang_String_valueOf_I_Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [valueOf_J_Ljava_lang_String] (P:1 - 2;L:0 - 0)
function_java_lang_String_valueOf_J_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_String_valueOf_J_Ljava_lang_String_line_0:
mov eax, dword [ebp+4*3]
mov edx, dword [ebp+4*2]
push eax
push edx
function_java_lang_String_valueOf_J_Ljava_lang_String_line_1:
call function_java_lang_Long_toString_J_Ljava_lang_String_line_start
add esp, 4*2
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_String_valueOf_J_Ljava_lang_String_line_4:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_valueOf_J_Ljava_lang_String_line_exit
function_java_lang_String_valueOf_J_Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [valueOf_F_Ljava_lang_String] (P:1 - 1;L:0 - 0)
function_java_lang_String_valueOf_F_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_String_valueOf_F_Ljava_lang_String_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_valueOf_F_Ljava_lang_String_line_1:
call function_java_lang_Float_toString_F_Ljava_lang_String_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_String_valueOf_F_Ljava_lang_String_line_4:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_valueOf_F_Ljava_lang_String_line_exit
function_java_lang_String_valueOf_F_Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [valueOf_D_Ljava_lang_String] (P:1 - 2;L:0 - 0)
function_java_lang_String_valueOf_D_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_String_valueOf_D_Ljava_lang_String_line_0:
mov eax, dword [ebp+4*3]
mov edx, dword [ebp+4*2]
push eax
push edx
function_java_lang_String_valueOf_D_Ljava_lang_String_line_1:
call function_java_lang_Double_toString_D_Ljava_lang_String_line_start
add esp, 4*2
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_String_valueOf_D_Ljava_lang_String_line_4:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_valueOf_D_Ljava_lang_String_line_exit
function_java_lang_String_valueOf_D_Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [indexOf_I_I] (P:2 - 2;L:0 - 0)
function_java_lang_String_indexOf_I_I_line_start:
push ebp
mov ebp, esp
function_java_lang_String_indexOf_I_I_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_indexOf_I_I_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_indexOf_I_I_line_2:
mov eax, 0
push eax
function_java_lang_String_indexOf_I_I_line_3:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:indexOf_II_I
add eax, 4*10
call dword [eax] ;java_lang_String.indexOf_II_I
add esp, 4*3
push eax
function_java_lang_String_indexOf_I_I_line_6:
pop eax
jmp function_java_lang_String_indexOf_I_I_line_exit
function_java_lang_String_indexOf_I_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [indexOf_II_I] (P:3 - 3;L:3 - 3)
function_java_lang_String_indexOf_II_I_line_start:
push ebp
mov ebp, esp
sub esp, 4*3
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
mov dword [esp+4*2], 0
function_java_lang_String_indexOf_II_I_line_0:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_indexOf_II_I_line_1:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_indexOf_II_I_line_4:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_indexOf_II_I_line_5:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_String_indexOf_II_I_line_6:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_indexOf_II_I_line_7:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_String_indexOf_II_I_line_15
function_java_lang_String_indexOf_II_I_line_10:
mov eax, 0
push eax
function_java_lang_String_indexOf_II_I_line_11:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_String_indexOf_II_I_line_12:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_indexOf_II_I_line_22
function_java_lang_String_indexOf_II_I_line_15:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_indexOf_II_I_line_16:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_indexOf_II_I_line_17:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_String_indexOf_II_I_line_22
function_java_lang_String_indexOf_II_I_line_20:
mov eax, -1
push eax
function_java_lang_String_indexOf_II_I_line_21:
pop eax
jmp function_java_lang_String_indexOf_II_I_line_exit
function_java_lang_String_indexOf_II_I_line_22:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_indexOf_II_I_line_23:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_indexOf_II_I_line_26:
mov eax, dword [ebp-4*2]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*2], eax
function_java_lang_String_indexOf_II_I_line_28:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_indexOf_II_I_line_29:
pop eax
mov dword [ebp-4*3], eax
function_java_lang_String_indexOf_II_I_line_31:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_indexOf_II_I_line_49
function_java_lang_String_indexOf_II_I_line_34:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_indexOf_II_I_line_36:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_indexOf_II_I_line_38:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_indexOf_II_I_line_39:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_indexOf_II_I_line_40:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_String_indexOf_II_I_line_46
function_java_lang_String_indexOf_II_I_line_43:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_indexOf_II_I_line_45:
pop eax
jmp function_java_lang_String_indexOf_II_I_line_exit
function_java_lang_String_indexOf_II_I_line_46:
mov eax, dword [ebp-4*3]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*3], eax
function_java_lang_String_indexOf_II_I_line_49:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_indexOf_II_I_line_51:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_indexOf_II_I_line_52:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_String_indexOf_II_I_line_34
function_java_lang_String_indexOf_II_I_line_55:
mov eax, -1
push eax
function_java_lang_String_indexOf_II_I_line_56:
pop eax
jmp function_java_lang_String_indexOf_II_I_line_exit
function_java_lang_String_indexOf_II_I_line_exit:
push eax
mov eax, dword [ebp-4*2]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [substring_I_Ljava_lang_String] (P:2 - 2;L:1 - 1)
function_java_lang_String_substring_I_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
sub esp, 4*1
mov dword [esp+4*0], 0
function_java_lang_String_substring_I_Ljava_lang_String_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_substring_I_Ljava_lang_String_line_1:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_String_substring_I_Ljava_lang_String_line_6
function_java_lang_String_substring_I_Ljava_lang_String_line_4:
mov eax, 0
push eax
function_java_lang_String_substring_I_Ljava_lang_String_line_5:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_substring_I_Ljava_lang_String_line_exit
function_java_lang_String_substring_I_Ljava_lang_String_line_6:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_substring_I_Ljava_lang_String_line_7:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_substring_I_Ljava_lang_String_line_10:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_substring_I_Ljava_lang_String_line_11:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_substring_I_Ljava_lang_String_line_12:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_String_substring_I_Ljava_lang_String_line_13:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_String_substring_I_Ljava_lang_String_line_14:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_substring_I_Ljava_lang_String_line_15:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_String_substring_I_Ljava_lang_String_line_20
function_java_lang_String_substring_I_Ljava_lang_String_line_18:
mov eax, 0
push eax
function_java_lang_String_substring_I_Ljava_lang_String_line_19:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_substring_I_Ljava_lang_String_line_exit
function_java_lang_String_substring_I_Ljava_lang_String_line_20:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_substring_I_Ljava_lang_String_line_21:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_String_substring_I_Ljava_lang_String_line_28
function_java_lang_String_substring_I_Ljava_lang_String_line_24:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_substring_I_Ljava_lang_String_line_25:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_substring_I_Ljava_lang_String_line_41
function_java_lang_String_substring_I_Ljava_lang_String_line_28:
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_String_substring_I_Ljava_lang_String_line_31:
pop eax
push eax
push eax
function_java_lang_String_substring_I_Ljava_lang_String_line_32:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_substring_I_Ljava_lang_String_line_33:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_substring_I_Ljava_lang_String_line_36:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_substring_I_Ljava_lang_String_line_37:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_substring_I_Ljava_lang_String_line_38:
call function_java_lang_String_$init$__CII_V_line_start
add esp, 4*4
function_java_lang_String_substring_I_Ljava_lang_String_line_41:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_substring_I_Ljava_lang_String_line_exit
function_java_lang_String_substring_I_Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [substring_II_Ljava_lang_String] (P:3 - 3;L:1 - 1)
function_java_lang_String_substring_II_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
sub esp, 4*1
mov dword [esp+4*0], 0
function_java_lang_String_substring_II_Ljava_lang_String_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_substring_II_Ljava_lang_String_line_1:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_String_substring_II_Ljava_lang_String_line_6
function_java_lang_String_substring_II_Ljava_lang_String_line_4:
mov eax, 0
push eax
function_java_lang_String_substring_II_Ljava_lang_String_line_5:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_substring_II_Ljava_lang_String_line_exit
function_java_lang_String_substring_II_Ljava_lang_String_line_6:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_substring_II_Ljava_lang_String_line_7:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_substring_II_Ljava_lang_String_line_8:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_substring_II_Ljava_lang_String_line_11:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_substring_II_Ljava_lang_String_line_12:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_String_substring_II_Ljava_lang_String_line_17
function_java_lang_String_substring_II_Ljava_lang_String_line_15:
mov eax, 0
push eax
function_java_lang_String_substring_II_Ljava_lang_String_line_16:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_substring_II_Ljava_lang_String_line_exit
function_java_lang_String_substring_II_Ljava_lang_String_line_17:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_substring_II_Ljava_lang_String_line_18:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_substring_II_Ljava_lang_String_line_19:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_String_substring_II_Ljava_lang_String_line_20:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_String_substring_II_Ljava_lang_String_line_21:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_substring_II_Ljava_lang_String_line_22:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_String_substring_II_Ljava_lang_String_line_27
function_java_lang_String_substring_II_Ljava_lang_String_line_25:
mov eax, 0
push eax
function_java_lang_String_substring_II_Ljava_lang_String_line_26:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_substring_II_Ljava_lang_String_line_exit
function_java_lang_String_substring_II_Ljava_lang_String_line_27:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_substring_II_Ljava_lang_String_line_28:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_String_substring_II_Ljava_lang_String_line_44
function_java_lang_String_substring_II_Ljava_lang_String_line_31:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_substring_II_Ljava_lang_String_line_32:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_substring_II_Ljava_lang_String_line_33:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_substring_II_Ljava_lang_String_line_36:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_substring_II_Ljava_lang_String_line_37:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_String_substring_II_Ljava_lang_String_line_44
function_java_lang_String_substring_II_Ljava_lang_String_line_40:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_substring_II_Ljava_lang_String_line_41:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_substring_II_Ljava_lang_String_line_57
function_java_lang_String_substring_II_Ljava_lang_String_line_44:
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_String_substring_II_Ljava_lang_String_line_47:
pop eax
push eax
push eax
function_java_lang_String_substring_II_Ljava_lang_String_line_48:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_substring_II_Ljava_lang_String_line_49:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_substring_II_Ljava_lang_String_line_52:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_substring_II_Ljava_lang_String_line_53:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_substring_II_Ljava_lang_String_line_54:
call function_java_lang_String_$init$__CII_V_line_start
add esp, 4*4
function_java_lang_String_substring_II_Ljava_lang_String_line_57:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_substring_II_Ljava_lang_String_line_exit
function_java_lang_String_substring_II_Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [getChars__CI_V] (P:3 - 3;L:0 - 0)
function_java_lang_String_getChars__CI_V_line_start:
push ebp
mov ebp, esp
function_java_lang_String_getChars__CI_V_line_0:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_getChars__CI_V_line_1:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_getChars__CI_V_line_4:
mov eax, 0
push eax
function_java_lang_String_getChars__CI_V_line_5:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_getChars__CI_V_line_6:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_getChars__CI_V_line_7:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_getChars__CI_V_line_8:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_getChars__CI_V_line_11:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_getChars__CI_V_line_12:
call function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_start
add esp, 4*5
function_java_lang_String_getChars__CI_V_line_15:
jmp function_java_lang_String_getChars__CI_V_line_exit
function_java_lang_String_getChars__CI_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [getChars_II_CI_V] (P:5 - 5;L:0 - 0)
function_java_lang_String_getChars_II_CI_V_line_start:
push ebp
mov ebp, esp
function_java_lang_String_getChars_II_CI_V_line_0:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_String_getChars_II_CI_V_line_1:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_String_getChars_II_CI_V_line_5
function_java_lang_String_getChars_II_CI_V_line_4:
jmp function_java_lang_String_getChars_II_CI_V_line_exit
function_java_lang_String_getChars_II_CI_V_line_5:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_getChars_II_CI_V_line_6:
mov eax, dword [ebp+4*6]
push eax
function_java_lang_String_getChars_II_CI_V_line_7:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_getChars_II_CI_V_line_10:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_getChars_II_CI_V_line_11:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_String_getChars_II_CI_V_line_15
function_java_lang_String_getChars_II_CI_V_line_14:
jmp function_java_lang_String_getChars_II_CI_V_line_exit
function_java_lang_String_getChars_II_CI_V_line_15:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_String_getChars_II_CI_V_line_16:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_getChars_II_CI_V_line_17:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_String_getChars_II_CI_V_line_21
function_java_lang_String_getChars_II_CI_V_line_20:
jmp function_java_lang_String_getChars_II_CI_V_line_exit
function_java_lang_String_getChars_II_CI_V_line_21:
mov eax, dword [ebp+4*6]
push eax
function_java_lang_String_getChars_II_CI_V_line_22:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_getChars_II_CI_V_line_25:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_String_getChars_II_CI_V_line_26:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_getChars_II_CI_V_line_27:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_getChars_II_CI_V_line_29:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_getChars_II_CI_V_line_30:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_String_getChars_II_CI_V_line_31:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_String_getChars_II_CI_V_line_32:
call function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_start
add esp, 4*5
function_java_lang_String_getChars_II_CI_V_line_35:
jmp function_java_lang_String_getChars_II_CI_V_line_exit
function_java_lang_String_getChars_II_CI_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [regionMatches_ILjava_lang_StringII_Z] (P:5 - 5;L:4 - 4)
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_start:
push ebp
mov ebp, esp
sub esp, 4*4
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
mov dword [esp+4*2], 0
mov dword [esp+4*3], 0
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_0:
mov eax, dword [ebp+4*6]
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_1:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_4:
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*1], eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_6:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_7:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_9:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_10:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_13:
mov eax, dword [ebp-4*3]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*3], eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_15:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_16:
pop eax
mov dword [ebp-4*4], eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_18:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_19:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_50
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_22:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_23:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_50
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_26:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_27:
mov eax, dword [ebp+4*6]
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_28:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_31:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_32:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_34:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_35:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jg  function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_50
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_38:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_39:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_40:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_43:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_44:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_46:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_47:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_73
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_50:
mov eax, 0
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_51:
pop eax
jmp function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_exit
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_52:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_54:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_56:
mov eax, dword [ebp-4*2]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*2], eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_59:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_60:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_62:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_64:
mov eax, dword [ebp-4*4]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*4], eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_67:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_68:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_73
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_71:
mov eax, 0
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_72:
pop eax
jmp function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_exit
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_73:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_75:
mov eax, dword [ebp+4*2]
push eax
mov eax, 255
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp+4*2], eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_78:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jg  function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_52
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_81:
mov eax, 1
push eax
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_82:
pop eax
jmp function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_exit
function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_exit:
push eax
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
mov eax, dword [ebp-4*3]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [startsWith_Ljava_lang_StringI_Z] (P:3 - 3;L:5 - 5)
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_start:
push ebp
mov ebp, esp
sub esp, 4*5
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
mov dword [esp+4*2], 0
mov dword [esp+4*3], 0
mov dword [esp+4*4], 0
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_0:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_1:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_4:
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*1], eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_5:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_6:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_8:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_9:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_12:
mov eax, dword [ebp-4*3]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*3], eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_14:
mov eax, 0
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_15:
pop eax
mov dword [ebp-4*4], eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_17:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_18:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_21:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_22:
pop eax
mov dword [ebp-4*5], eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_24:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_25:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_40
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_28:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_29:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_30:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_33:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_34:
mov eax, dword [ebp-4*5]
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_36:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_37:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_62
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_40:
mov eax, 0
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_41:
pop eax
jmp function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_exit
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_42:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_43:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_45:
mov eax, dword [ebp-4*2]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*2], eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_48:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_49:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_51:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_53:
mov eax, dword [ebp-4*4]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*4], eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_56:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_57:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_62
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_60:
mov eax, 0
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_61:
pop eax
jmp function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_exit
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_62:
mov eax, dword [ebp-4*5]
push eax
mov eax, 255
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*5], eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_65:
mov eax, dword [ebp-4*5]
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_67:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_42
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_70:
mov eax, 1
push eax
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_71:
pop eax
jmp function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_exit
function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_exit:
push eax
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
mov eax, dword [ebp-4*3]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [startsWith_Ljava_lang_String_Z] (P:2 - 2;L:0 - 0)
function_java_lang_String_startsWith_Ljava_lang_String_Z_line_start:
push ebp
mov ebp, esp
function_java_lang_String_startsWith_Ljava_lang_String_Z_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_startsWith_Ljava_lang_String_Z_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_startsWith_Ljava_lang_String_Z_line_2:
mov eax, 0
push eax
function_java_lang_String_startsWith_Ljava_lang_String_Z_line_3:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:startsWith_Ljava_lang_StringI_Z
add eax, 4*16
call dword [eax] ;java_lang_String.startsWith_Ljava_lang_StringI_Z
add esp, 4*3
push eax
function_java_lang_String_startsWith_Ljava_lang_String_Z_line_6:
pop eax
jmp function_java_lang_String_startsWith_Ljava_lang_String_Z_line_exit
function_java_lang_String_startsWith_Ljava_lang_String_Z_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [endsWith_Ljava_lang_String_Z] (P:2 - 2;L:0 - 0)
function_java_lang_String_endsWith_Ljava_lang_String_Z_line_start:
push ebp
mov ebp, esp
function_java_lang_String_endsWith_Ljava_lang_String_Z_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_endsWith_Ljava_lang_String_Z_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_endsWith_Ljava_lang_String_Z_line_2:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_endsWith_Ljava_lang_String_Z_line_3:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_endsWith_Ljava_lang_String_Z_line_6:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_endsWith_Ljava_lang_String_Z_line_7:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_endsWith_Ljava_lang_String_Z_line_8:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_endsWith_Ljava_lang_String_Z_line_11:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_endsWith_Ljava_lang_String_Z_line_12:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_String_endsWith_Ljava_lang_String_Z_line_13:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:startsWith_Ljava_lang_StringI_Z
add eax, 4*16
call dword [eax] ;java_lang_String.startsWith_Ljava_lang_StringI_Z
add esp, 4*3
push eax
function_java_lang_String_endsWith_Ljava_lang_String_Z_line_16:
pop eax
jmp function_java_lang_String_endsWith_Ljava_lang_String_Z_line_exit
function_java_lang_String_endsWith_Ljava_lang_String_Z_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [hashCode__I] (P:1 - 1;L:3 - 3)
function_java_lang_String_hashCode__I_line_start:
push ebp
mov ebp, esp
sub esp, 4*3
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
mov dword [esp+4*2], 0
function_java_lang_String_hashCode__I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_hashCode__I_line_1:
pop ebx
mov eax, dword [ebx+8]
push eax
function_java_lang_String_hashCode__I_line_4:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_String_hashCode__I_line_5:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_hashCode__I_line_6:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_String_hashCode__I_line_53
function_java_lang_String_hashCode__I_line_9:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_hashCode__I_line_10:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_hashCode__I_line_13:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_hashCode__I_line_14:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_String_hashCode__I_line_53
function_java_lang_String_hashCode__I_line_17:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_hashCode__I_line_18:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_hashCode__I_line_21:
mov eax, dword [ebp-4*2]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*2], eax
function_java_lang_String_hashCode__I_line_22:
mov eax, 0
push eax
function_java_lang_String_hashCode__I_line_23:
pop eax
mov dword [ebp-4*3], eax
function_java_lang_String_hashCode__I_line_24:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_hashCode__I_line_39
function_java_lang_String_hashCode__I_line_27:
mov eax, 31
push eax
function_java_lang_String_hashCode__I_line_29:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_hashCode__I_line_30:
pop ebx
pop eax
imul eax, ebx
push eax
function_java_lang_String_hashCode__I_line_31:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_hashCode__I_line_32:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_hashCode__I_line_33:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_hashCode__I_line_34:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_String_hashCode__I_line_35:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_String_hashCode__I_line_36:
mov eax, dword [ebp-4*3]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*3], eax
function_java_lang_String_hashCode__I_line_39:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_hashCode__I_line_40:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_hashCode__I_line_41:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_hashCode__I_line_44:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_hashCode__I_line_45:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_String_hashCode__I_line_27
function_java_lang_String_hashCode__I_line_48:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_hashCode__I_line_49:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_hashCode__I_line_50:
pop eax
pop ebx
mov dword [ebx+8], eax
function_java_lang_String_hashCode__I_line_53:
mov eax, dword [ebp-4*1]
push eax
mov eax, dword [ebp-4*2]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
mov eax, 0
mov dword [ebp-4*2], eax
function_java_lang_String_hashCode__I_line_54:
pop eax
jmp function_java_lang_String_hashCode__I_line_exit
function_java_lang_String_hashCode__I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [indexOf_Ljava_lang_String_I] (P:2 - 2;L:0 - 0)
function_java_lang_String_indexOf_Ljava_lang_String_I_line_start:
push ebp
mov ebp, esp
function_java_lang_String_indexOf_Ljava_lang_String_I_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_indexOf_Ljava_lang_String_I_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_indexOf_Ljava_lang_String_I_line_2:
mov eax, 0
push eax
function_java_lang_String_indexOf_Ljava_lang_String_I_line_3:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:indexOf_Ljava_lang_StringI_I
add eax, 4*20
call dword [eax] ;java_lang_String.indexOf_Ljava_lang_StringI_I
add esp, 4*3
push eax
function_java_lang_String_indexOf_Ljava_lang_String_I_line_6:
pop eax
jmp function_java_lang_String_indexOf_Ljava_lang_String_I_line_exit
function_java_lang_String_indexOf_Ljava_lang_String_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [indexOf_Ljava_lang_StringI_I] (P:3 - 3;L:0 - 0)
function_java_lang_String_indexOf_Ljava_lang_StringI_I_line_start:
push ebp
mov ebp, esp
function_java_lang_String_indexOf_Ljava_lang_StringI_I_line_0:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_indexOf_Ljava_lang_StringI_I_line_1:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_indexOf_Ljava_lang_StringI_I_line_4:
mov eax, 0
push eax
function_java_lang_String_indexOf_Ljava_lang_StringI_I_line_5:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_indexOf_Ljava_lang_StringI_I_line_6:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_indexOf_Ljava_lang_StringI_I_line_9:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_indexOf_Ljava_lang_StringI_I_line_10:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_indexOf_Ljava_lang_StringI_I_line_11:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_indexOf_Ljava_lang_StringI_I_line_14:
mov eax, 0
push eax
function_java_lang_String_indexOf_Ljava_lang_StringI_I_line_15:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_indexOf_Ljava_lang_StringI_I_line_16:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_indexOf_Ljava_lang_StringI_I_line_19:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_indexOf_Ljava_lang_StringI_I_line_20:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_indexOf_Ljava_lang_StringI_I_line_21:
call function_java_lang_String_indexOf__CII_CIII_I_line_start
add esp, 4*7
push eax
function_java_lang_String_indexOf_Ljava_lang_StringI_I_line_24:
pop eax
jmp function_java_lang_String_indexOf_Ljava_lang_StringI_I_line_exit
function_java_lang_String_indexOf_Ljava_lang_StringI_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [indexOf__CII_CIII_I] (P:7 - 7;L:6 - 6)
function_java_lang_String_indexOf__CII_CIII_I_line_start:
push ebp
mov ebp, esp
sub esp, 4*6
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
mov dword [esp+4*2], 0
mov dword [esp+4*3], 0
mov dword [esp+4*4], 0
mov dword [esp+4*5], 0
function_java_lang_String_indexOf__CII_CIII_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_2:
mov eax, dword [ebp+4*6]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_3:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_String_indexOf__CII_CIII_I_line_17
function_java_lang_String_indexOf__CII_CIII_I_line_6:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_8:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_String_indexOf__CII_CIII_I_line_15
function_java_lang_String_indexOf__CII_CIII_I_line_11:
mov eax, dword [ebp+4*6]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_12:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_indexOf__CII_CIII_I_line_16
function_java_lang_String_indexOf__CII_CIII_I_line_15:
mov eax, -1
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_16:
pop eax
jmp function_java_lang_String_indexOf__CII_CIII_I_line_exit
function_java_lang_String_indexOf__CII_CIII_I_line_17:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_19:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_String_indexOf__CII_CIII_I_line_25
function_java_lang_String_indexOf__CII_CIII_I_line_22:
mov eax, 0
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_23:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_String_indexOf__CII_CIII_I_line_25:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_27:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_String_indexOf__CII_CIII_I_line_33
function_java_lang_String_indexOf__CII_CIII_I_line_30:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_32:
pop eax
jmp function_java_lang_String_indexOf__CII_CIII_I_line_exit
function_java_lang_String_indexOf__CII_CIII_I_line_33:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_34:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_36:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_37:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_String_indexOf__CII_CIII_I_line_39:
mov eax, dword [ebp+4*7]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_40:
mov eax, dword [ebp+4*6]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_41:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_43:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_44:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_45:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_String_indexOf__CII_CIII_I_line_47:
mov eax, dword [ebp+4*7]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_48:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_50:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_51:
pop eax
mov dword [ebp-4*3], eax
function_java_lang_String_indexOf__CII_CIII_I_line_53:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_indexOf__CII_CIII_I_line_154
function_java_lang_String_indexOf__CII_CIII_I_line_56:
mov eax, dword [ebp+4*8]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_57:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_59:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_60:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_62:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_String_indexOf__CII_CIII_I_line_84
function_java_lang_String_indexOf__CII_CIII_I_line_65:
mov eax, dword [ebp-4*3]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*3], eax
function_java_lang_String_indexOf__CII_CIII_I_line_68:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_70:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_72:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jg  function_java_lang_String_indexOf__CII_CIII_I_line_84
function_java_lang_String_indexOf__CII_CIII_I_line_75:
mov eax, dword [ebp+4*8]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_76:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_78:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_79:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_81:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_String_indexOf__CII_CIII_I_line_65
function_java_lang_String_indexOf__CII_CIII_I_line_84:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_86:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_88:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jg  function_java_lang_String_indexOf__CII_CIII_I_line_151
function_java_lang_String_indexOf__CII_CIII_I_line_91:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_93:
mov eax, 1
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_94:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_95:
pop eax
mov dword [ebp-4*4], eax
function_java_lang_String_indexOf__CII_CIII_I_line_97:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_99:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_101:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_102:
mov eax, 1
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_103:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_104:
pop eax
mov dword [ebp-4*5], eax
function_java_lang_String_indexOf__CII_CIII_I_line_106:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_108:
mov eax, 1
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_109:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_110:
pop eax
mov dword [ebp-4*6], eax
function_java_lang_String_indexOf__CII_CIII_I_line_112:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_indexOf__CII_CIII_I_line_121
function_java_lang_String_indexOf__CII_CIII_I_line_115:
mov eax, dword [ebp-4*4]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*4], eax
function_java_lang_String_indexOf__CII_CIII_I_line_118:
mov eax, dword [ebp-4*6]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*6], eax
function_java_lang_String_indexOf__CII_CIII_I_line_121:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_123:
mov eax, dword [ebp-4*5]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_125:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_String_indexOf__CII_CIII_I_line_139
function_java_lang_String_indexOf__CII_CIII_I_line_128:
mov eax, dword [ebp+4*8]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_129:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_131:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_132:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_133:
mov eax, dword [ebp-4*6]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_135:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_136:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_String_indexOf__CII_CIII_I_line_115
function_java_lang_String_indexOf__CII_CIII_I_line_139:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_141:
mov eax, dword [ebp-4*5]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_143:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_String_indexOf__CII_CIII_I_line_151
function_java_lang_String_indexOf__CII_CIII_I_line_146:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_148:
mov eax, dword [ebp+4*7]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_149:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_150:
pop eax
jmp function_java_lang_String_indexOf__CII_CIII_I_line_exit
function_java_lang_String_indexOf__CII_CIII_I_line_151:
mov eax, dword [ebp-4*3]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*3], eax
function_java_lang_String_indexOf__CII_CIII_I_line_154:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_156:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_158:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_String_indexOf__CII_CIII_I_line_56
function_java_lang_String_indexOf__CII_CIII_I_line_161:
mov eax, -1
push eax
function_java_lang_String_indexOf__CII_CIII_I_line_162:
pop eax
jmp function_java_lang_String_indexOf__CII_CIII_I_line_exit
function_java_lang_String_indexOf__CII_CIII_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [lastIndexOf_Ljava_lang_String_I] (P:2 - 2;L:0 - 0)
function_java_lang_String_lastIndexOf_Ljava_lang_String_I_line_start:
push ebp
mov ebp, esp
function_java_lang_String_lastIndexOf_Ljava_lang_String_I_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_lastIndexOf_Ljava_lang_String_I_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_lastIndexOf_Ljava_lang_String_I_line_2:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_lastIndexOf_Ljava_lang_String_I_line_3:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_lastIndexOf_Ljava_lang_String_I_line_6:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_lastIndexOf_Ljava_lang_String_I_line_7:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:lastIndexOf_Ljava_lang_StringI_I
add eax, 4*22
call dword [eax] ;java_lang_String.lastIndexOf_Ljava_lang_StringI_I
add esp, 4*3
push eax
function_java_lang_String_lastIndexOf_Ljava_lang_String_I_line_10:
pop eax
jmp function_java_lang_String_lastIndexOf_Ljava_lang_String_I_line_exit
function_java_lang_String_lastIndexOf_Ljava_lang_String_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [lastIndexOf_Ljava_lang_StringI_I] (P:3 - 3;L:0 - 0)
function_java_lang_String_lastIndexOf_Ljava_lang_StringI_I_line_start:
push ebp
mov ebp, esp
function_java_lang_String_lastIndexOf_Ljava_lang_StringI_I_line_0:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_lastIndexOf_Ljava_lang_StringI_I_line_1:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_lastIndexOf_Ljava_lang_StringI_I_line_4:
mov eax, 0
push eax
function_java_lang_String_lastIndexOf_Ljava_lang_StringI_I_line_5:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_lastIndexOf_Ljava_lang_StringI_I_line_6:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_lastIndexOf_Ljava_lang_StringI_I_line_9:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_lastIndexOf_Ljava_lang_StringI_I_line_10:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_lastIndexOf_Ljava_lang_StringI_I_line_11:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_lastIndexOf_Ljava_lang_StringI_I_line_14:
mov eax, 0
push eax
function_java_lang_String_lastIndexOf_Ljava_lang_StringI_I_line_15:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_lastIndexOf_Ljava_lang_StringI_I_line_16:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_lastIndexOf_Ljava_lang_StringI_I_line_19:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_lastIndexOf_Ljava_lang_StringI_I_line_20:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_lastIndexOf_Ljava_lang_StringI_I_line_21:
call function_java_lang_String_lastIndexOf__CII_CIII_I_line_start
add esp, 4*7
push eax
function_java_lang_String_lastIndexOf_Ljava_lang_StringI_I_line_24:
pop eax
jmp function_java_lang_String_lastIndexOf_Ljava_lang_StringI_I_line_exit
function_java_lang_String_lastIndexOf_Ljava_lang_StringI_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [lastIndexOf__CII_CIII_I] (P:7 - 7;L:8 - 8)
function_java_lang_String_lastIndexOf__CII_CIII_I_line_start:
push ebp
mov ebp, esp
sub esp, 4*8
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
mov dword [esp+4*2], 0
mov dword [esp+4*3], 0
mov dword [esp+4*4], 0
mov dword [esp+4*5], 0
mov dword [esp+4*6], 0
mov dword [esp+4*7], 0
function_java_lang_String_lastIndexOf__CII_CIII_I_line_0:
mov eax, dword [ebp+4*6]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_1:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_3:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_4:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_6:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_8:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_String_lastIndexOf__CII_CIII_I_line_13
function_java_lang_String_lastIndexOf__CII_CIII_I_line_11:
mov eax, -1
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_12:
pop eax
jmp function_java_lang_String_lastIndexOf__CII_CIII_I_line_exit
function_java_lang_String_lastIndexOf__CII_CIII_I_line_13:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_15:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_17:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_String_lastIndexOf__CII_CIII_I_line_24
function_java_lang_String_lastIndexOf__CII_CIII_I_line_20:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_22:
pop eax
mov dword [ebp+4*2], eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_24:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_26:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_String_lastIndexOf__CII_CIII_I_line_32
function_java_lang_String_lastIndexOf__CII_CIII_I_line_29:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_31:
pop eax
jmp function_java_lang_String_lastIndexOf__CII_CIII_I_line_exit
function_java_lang_String_lastIndexOf__CII_CIII_I_line_32:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_34:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_36:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_37:
mov eax, 1
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_38:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_39:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_41:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_42:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_44:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_45:
pop eax
mov dword [ebp-4*3], eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_47:
mov eax, dword [ebp+4*7]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_48:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_50:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_51:
mov eax, 1
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_52:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_53:
pop eax
mov dword [ebp-4*4], eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_55:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_57:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_59:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_60:
pop eax
mov dword [ebp-4*5], eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_62:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_lastIndexOf__CII_CIII_I_line_68
function_java_lang_String_lastIndexOf__CII_CIII_I_line_65:
mov eax, dword [ebp-4*5]
push eax
mov eax, 255
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*5], eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_68:
mov eax, dword [ebp-4*5]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_70:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_72:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_String_lastIndexOf__CII_CIII_I_line_84
function_java_lang_String_lastIndexOf__CII_CIII_I_line_75:
mov eax, dword [ebp+4*8]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_76:
mov eax, dword [ebp-4*5]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_78:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_79:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_81:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_String_lastIndexOf__CII_CIII_I_line_65
function_java_lang_String_lastIndexOf__CII_CIII_I_line_84:
mov eax, dword [ebp-4*5]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_86:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_88:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_String_lastIndexOf__CII_CIII_I_line_93
function_java_lang_String_lastIndexOf__CII_CIII_I_line_91:
mov eax, -1
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_92:
pop eax
jmp function_java_lang_String_lastIndexOf__CII_CIII_I_line_exit
function_java_lang_String_lastIndexOf__CII_CIII_I_line_93:
mov eax, dword [ebp-4*5]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_95:
mov eax, 1
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_96:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_97:
pop eax
mov dword [ebp-4*6], eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_99:
mov eax, dword [ebp-4*6]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_101:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_103:
mov eax, 1
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_104:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_105:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_106:
pop eax
mov dword [ebp-4*7], eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_108:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_110:
mov eax, 1
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_111:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_112:
pop eax
mov dword [ebp-4*8], eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_114:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_lastIndexOf__CII_CIII_I_line_140
function_java_lang_String_lastIndexOf__CII_CIII_I_line_117:
mov eax, dword [ebp+4*8]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_118:
mov eax, dword [ebp-4*6]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_120:
mov eax, dword [ebp-4*6]
push eax
mov eax, 255
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*6], eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_123:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_124:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_125:
mov eax, dword [ebp-4*8]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_127:
mov eax, dword [ebp-4*8]
push eax
mov eax, 255
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*8], eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_130:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_131:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_String_lastIndexOf__CII_CIII_I_line_140
function_java_lang_String_lastIndexOf__CII_CIII_I_line_134:
mov eax, dword [ebp-4*5]
push eax
mov eax, 255
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*5], eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_137:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_lastIndexOf__CII_CIII_I_line_154
function_java_lang_String_lastIndexOf__CII_CIII_I_line_140:
mov eax, dword [ebp-4*6]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_142:
mov eax, dword [ebp-4*7]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_144:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jg  function_java_lang_String_lastIndexOf__CII_CIII_I_line_117
function_java_lang_String_lastIndexOf__CII_CIII_I_line_147:
mov eax, dword [ebp-4*7]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_149:
mov eax, dword [ebp+4*7]
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_150:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_151:
mov eax, 1
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_152:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_String_lastIndexOf__CII_CIII_I_line_153:
pop eax
jmp function_java_lang_String_lastIndexOf__CII_CIII_I_line_exit
function_java_lang_String_lastIndexOf__CII_CIII_I_line_154:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_lastIndexOf__CII_CIII_I_line_68
function_java_lang_String_lastIndexOf__CII_CIII_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [concat_Ljava_lang_String_Ljava_lang_String] (P:2 - 2;L:4 - 4)
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
sub esp, 4*4
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
mov dword [esp+4*2], 0
mov dword [esp+4*3], 0
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_1:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:length__I
add eax, 4*5
call dword [eax] ;java_lang_String.length__I
add esp, 4*1
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_4:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_5:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_6:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_11
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_9:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_10:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_exit
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_11:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_12:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_15:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_16:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_17:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_18:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_19:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_20:
pop ecx
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_22:
mov eax, dword [ebp-4*3]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*3], eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_24:
mov eax, 0
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_25:
pop eax
mov dword [ebp-4*4], eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_27:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_45
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_30:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_32:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_34:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_35:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_38:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_40:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_41:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_42:
mov eax, dword [ebp-4*4]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*4], eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_45:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_47:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_48:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_30
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_51:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_52:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_54:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_55:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:getChars__CI_V
add eax, 4*13
call dword [eax] ;java_lang_String.getChars__CI_V
add esp, 4*3
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_58:
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_61:
pop eax
push eax
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_62:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_64:
call function_java_lang_String_$init$__C_V_line_start
add esp, 4*2
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_67:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_exit
function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_exit:
push eax
mov eax, dword [ebp-4*3]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [replace_CC_Ljava_lang_String] (P:3 - 3;L:6 - 6)
function_java_lang_String_replace_CC_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
sub esp, 4*6
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
mov dword [esp+4*2], 0
mov dword [esp+4*3], 0
mov dword [esp+4*4], 0
mov dword [esp+4*5], 0
function_java_lang_String_replace_CC_Ljava_lang_String_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_2:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_String_replace_CC_Ljava_lang_String_line_127
function_java_lang_String_replace_CC_Ljava_lang_String_line_5:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_6:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_9:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_10:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_11:
mov eax, -1
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_12:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_14:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_15:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_18:
mov eax, dword [ebp-4*3]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*3], eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_20:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_replace_CC_Ljava_lang_String_line_35
function_java_lang_String_replace_CC_Ljava_lang_String_line_23:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_25:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_27:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_28:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_29:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_String_replace_CC_Ljava_lang_String_line_35
function_java_lang_String_replace_CC_Ljava_lang_String_line_32:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_replace_CC_Ljava_lang_String_line_44
function_java_lang_String_replace_CC_Ljava_lang_String_line_35:
mov eax, dword [ebp-4*2]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*2], eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_38:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_40:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_41:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_String_replace_CC_Ljava_lang_String_line_23
function_java_lang_String_replace_CC_Ljava_lang_String_line_44:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_46:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_47:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_String_replace_CC_Ljava_lang_String_line_127
function_java_lang_String_replace_CC_Ljava_lang_String_line_50:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_51:
pop ecx
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_53:
mov eax, dword [ebp-4*4]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*4], eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_55:
mov eax, 0
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_56:
pop eax
mov dword [ebp-4*5], eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_58:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_replace_CC_Ljava_lang_String_line_74
function_java_lang_String_replace_CC_Ljava_lang_String_line_61:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_63:
mov eax, dword [ebp-4*5]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_65:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_67:
mov eax, dword [ebp-4*5]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_69:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_70:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_String_replace_CC_Ljava_lang_String_line_71:
mov eax, dword [ebp-4*5]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*5], eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_74:
mov eax, dword [ebp-4*5]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_76:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_78:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_String_replace_CC_Ljava_lang_String_line_61
function_java_lang_String_replace_CC_Ljava_lang_String_line_81:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_replace_CC_Ljava_lang_String_line_111
function_java_lang_String_replace_CC_Ljava_lang_String_line_84:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_86:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_88:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_89:
pop eax
mov dword [ebp-4*5], eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_91:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_93:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_95:
mov eax, dword [ebp-4*5]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_97:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_98:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_String_replace_CC_Ljava_lang_String_line_105
function_java_lang_String_replace_CC_Ljava_lang_String_line_101:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_102:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_replace_CC_Ljava_lang_String_line_107
function_java_lang_String_replace_CC_Ljava_lang_String_line_105:
mov eax, dword [ebp-4*5]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_107:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_String_replace_CC_Ljava_lang_String_line_108:
mov eax, dword [ebp-4*2]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*2], eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_111:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_113:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_114:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_String_replace_CC_Ljava_lang_String_line_84
function_java_lang_String_replace_CC_Ljava_lang_String_line_117:
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_120:
pop eax
push eax
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_121:
mov eax, dword [ebp-4*4]
push eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_123:
call function_java_lang_String_$init$__C_V_line_start
add esp, 4*2
function_java_lang_String_replace_CC_Ljava_lang_String_line_126:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_replace_CC_Ljava_lang_String_line_exit
function_java_lang_String_replace_CC_Ljava_lang_String_line_127:
mov eax, dword [ebp+4*4]
push eax
mov eax, dword [ebp-4*3]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
mov eax, 0
mov dword [ebp-4*3], eax
mov eax, dword [ebp-4*4]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
mov eax, 0
mov dword [ebp-4*4], eax
function_java_lang_String_replace_CC_Ljava_lang_String_line_128:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_replace_CC_Ljava_lang_String_line_exit
function_java_lang_String_replace_CC_Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [contains_Ljava_lang_String_Z] (P:2 - 2;L:0 - 0)
function_java_lang_String_contains_Ljava_lang_String_Z_line_start:
push ebp
mov ebp, esp
function_java_lang_String_contains_Ljava_lang_String_Z_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_contains_Ljava_lang_String_Z_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_contains_Ljava_lang_String_Z_line_2:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:indexOf_Ljava_lang_String_I
add eax, 4*19
call dword [eax] ;java_lang_String.indexOf_Ljava_lang_String_I
add esp, 4*2
push eax
function_java_lang_String_contains_Ljava_lang_String_Z_line_5:
mov eax, -1
push eax
function_java_lang_String_contains_Ljava_lang_String_Z_line_6:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_String_contains_Ljava_lang_String_Z_line_11
function_java_lang_String_contains_Ljava_lang_String_Z_line_9:
mov eax, 1
push eax
function_java_lang_String_contains_Ljava_lang_String_Z_line_10:
pop eax
jmp function_java_lang_String_contains_Ljava_lang_String_Z_line_exit
function_java_lang_String_contains_Ljava_lang_String_Z_line_11:
mov eax, 0
push eax
function_java_lang_String_contains_Ljava_lang_String_Z_line_12:
pop eax
jmp function_java_lang_String_contains_Ljava_lang_String_Z_line_exit
function_java_lang_String_contains_Ljava_lang_String_Z_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [trim__Ljava_lang_String] (P:1 - 1;L:3 - 3)
function_java_lang_String_trim__Ljava_lang_String_line_start:
push ebp
mov ebp, esp
sub esp, 4*3
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
mov dword [esp+4*2], 0
function_java_lang_String_trim__Ljava_lang_String_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_trim__Ljava_lang_String_line_1:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_trim__Ljava_lang_String_line_4:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_trim__Ljava_lang_String_line_5:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_String_trim__Ljava_lang_String_line_6:
mov eax, 0
push eax
function_java_lang_String_trim__Ljava_lang_String_line_7:
pop eax
mov dword [ebp-4*2], eax
function_java_lang_String_trim__Ljava_lang_String_line_8:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_trim__Ljava_lang_String_line_9:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_trim__Ljava_lang_String_line_12:
mov eax, dword [ebp-4*3]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*3], eax
function_java_lang_String_trim__Ljava_lang_String_line_13:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_trim__Ljava_lang_String_line_19
function_java_lang_String_trim__Ljava_lang_String_line_16:
mov eax, dword [ebp-4*2]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*2], eax
function_java_lang_String_trim__Ljava_lang_String_line_19:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_trim__Ljava_lang_String_line_20:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_trim__Ljava_lang_String_line_21:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_String_trim__Ljava_lang_String_line_38
function_java_lang_String_trim__Ljava_lang_String_line_24:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_trim__Ljava_lang_String_line_25:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_trim__Ljava_lang_String_line_26:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_trim__Ljava_lang_String_line_27:
mov eax, 32
push eax
function_java_lang_String_trim__Ljava_lang_String_line_29:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_String_trim__Ljava_lang_String_line_16
function_java_lang_String_trim__Ljava_lang_String_line_32:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_trim__Ljava_lang_String_line_38
function_java_lang_String_trim__Ljava_lang_String_line_35:
mov eax, dword [ebp-4*1]
push eax
mov eax, 255
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*1], eax
function_java_lang_String_trim__Ljava_lang_String_line_38:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_trim__Ljava_lang_String_line_39:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_trim__Ljava_lang_String_line_40:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_String_trim__Ljava_lang_String_line_53
function_java_lang_String_trim__Ljava_lang_String_line_43:
mov eax, dword [ebp-4*3]
push eax
function_java_lang_String_trim__Ljava_lang_String_line_44:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_trim__Ljava_lang_String_line_45:
mov eax, 1
push eax
function_java_lang_String_trim__Ljava_lang_String_line_46:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_String_trim__Ljava_lang_String_line_47:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_String_trim__Ljava_lang_String_line_48:
mov eax, 32
push eax
function_java_lang_String_trim__Ljava_lang_String_line_50:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_String_trim__Ljava_lang_String_line_35
function_java_lang_String_trim__Ljava_lang_String_line_53:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_trim__Ljava_lang_String_line_54:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jg  function_java_lang_String_trim__Ljava_lang_String_line_66
function_java_lang_String_trim__Ljava_lang_String_line_57:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_trim__Ljava_lang_String_line_58:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_trim__Ljava_lang_String_line_59:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_trim__Ljava_lang_String_line_62:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_trim__Ljava_lang_String_line_63:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jge function_java_lang_String_trim__Ljava_lang_String_line_75
function_java_lang_String_trim__Ljava_lang_String_line_66:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_trim__Ljava_lang_String_line_67:
mov eax, dword [ebp-4*2]
push eax
function_java_lang_String_trim__Ljava_lang_String_line_68:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_trim__Ljava_lang_String_line_69:
mov eax, dword [esp+4*2]
mov eax, dword [eax] ;VFC:substring_II_Ljava_lang_String
add eax, 4*12
call dword [eax] ;java_lang_String.substring_II_Ljava_lang_String
add esp, 4*3
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_String_trim__Ljava_lang_String_line_72:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_trim__Ljava_lang_String_line_76
function_java_lang_String_trim__Ljava_lang_String_line_75:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_trim__Ljava_lang_String_line_76:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_trim__Ljava_lang_String_line_exit
function_java_lang_String_trim__Ljava_lang_String_line_exit:
push eax
mov eax, dword [ebp-4*3]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [toString__Ljava_lang_String] (P:1 - 1;L:0 - 0)
function_java_lang_String_toString__Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_String_toString__Ljava_lang_String_line_0:
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_String_toString__Ljava_lang_String_line_3:
pop eax
push eax
push eax
function_java_lang_String_toString__Ljava_lang_String_line_4:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_toString__Ljava_lang_String_line_5:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:getBytes___B
add eax, 4*8
call dword [eax] ;java_lang_String.getBytes___B
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_String_toString__Ljava_lang_String_line_8:
call function_java_lang_String_$init$__B_V_line_start
add esp, 4*2
function_java_lang_String_toString__Ljava_lang_String_line_11:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_toString__Ljava_lang_String_line_exit
function_java_lang_String_toString__Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [toCharArray___C] (P:1 - 1;L:1 - 1)
function_java_lang_String_toCharArray___C_line_start:
push ebp
mov ebp, esp
sub esp, 4*1
mov dword [esp+4*0], 0
function_java_lang_String_toCharArray___C_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_toCharArray___C_line_1:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_toCharArray___C_line_4:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_toCharArray___C_line_5:
pop ecx
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
push eax
function_java_lang_String_toCharArray___C_line_7:
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*1], eax
function_java_lang_String_toCharArray___C_line_8:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_toCharArray___C_line_9:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_toCharArray___C_line_12:
mov eax, 0
push eax
function_java_lang_String_toCharArray___C_line_13:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_toCharArray___C_line_14:
mov eax, 0
push eax
function_java_lang_String_toCharArray___C_line_15:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_toCharArray___C_line_16:
pop ebx
mov eax, dword [ebx+12]
push eax
function_java_lang_String_toCharArray___C_line_19:
pop ebx
mov eax, [ebx+8]
push eax
function_java_lang_String_toCharArray___C_line_20:
call function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_start
add esp, 4*5
function_java_lang_String_toCharArray___C_line_23:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_String_toCharArray___C_line_24:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_toCharArray___C_line_exit
function_java_lang_String_toCharArray___C_line_exit:
push eax
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [valueOf_Ljava_lang_Object_Ljava_lang_String] (P:1 - 1;L:0 - 0)
function_java_lang_String_valueOf_Ljava_lang_Object_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_String_valueOf_Ljava_lang_Object_Ljava_lang_String_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_valueOf_Ljava_lang_Object_Ljava_lang_String_line_1:
pop eax
cmp eax, 0
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_String_valueOf_Ljava_lang_Object_Ljava_lang_String_line_9
function_java_lang_String_valueOf_Ljava_lang_Object_Ljava_lang_String_line_4:
mov eax, dword [stringmap_33c587]
push eax
function_java_lang_String_valueOf_Ljava_lang_Object_Ljava_lang_String_line_6:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_String_valueOf_Ljava_lang_Object_Ljava_lang_String_line_13
function_java_lang_String_valueOf_Ljava_lang_Object_Ljava_lang_String_line_9:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_valueOf_Ljava_lang_Object_Ljava_lang_String_line_10:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:toString__Ljava_lang_String
add eax, 4*2
call dword [eax] ;java_lang_Object.toString__Ljava_lang_String
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_String_valueOf_Ljava_lang_Object_Ljava_lang_String_line_13:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_valueOf_Ljava_lang_Object_Ljava_lang_String_line_exit
function_java_lang_String_valueOf_Ljava_lang_Object_Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [valueOf__CII_Ljava_lang_String] (P:3 - 3;L:0 - 0)
function_java_lang_String_valueOf__CII_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_String_valueOf__CII_Ljava_lang_String_line_0:
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_String_valueOf__CII_Ljava_lang_String_line_3:
pop eax
push eax
push eax
function_java_lang_String_valueOf__CII_Ljava_lang_String_line_4:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_valueOf__CII_Ljava_lang_String_line_5:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_valueOf__CII_Ljava_lang_String_line_6:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_valueOf__CII_Ljava_lang_String_line_7:
call function_java_lang_String_$init$__CII_V_line_start
add esp, 4*4
function_java_lang_String_valueOf__CII_Ljava_lang_String_line_10:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_valueOf__CII_Ljava_lang_String_line_exit
function_java_lang_String_valueOf__CII_Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [copyValueOf__CII_Ljava_lang_String] (P:3 - 3;L:0 - 0)
function_java_lang_String_copyValueOf__CII_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_String_copyValueOf__CII_Ljava_lang_String_line_0:
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_String_copyValueOf__CII_Ljava_lang_String_line_3:
pop eax
push eax
push eax
function_java_lang_String_copyValueOf__CII_Ljava_lang_String_line_4:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_String_copyValueOf__CII_Ljava_lang_String_line_5:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_String_copyValueOf__CII_Ljava_lang_String_line_6:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_copyValueOf__CII_Ljava_lang_String_line_7:
call function_java_lang_String_$init$__CII_V_line_start
add esp, 4*4
function_java_lang_String_copyValueOf__CII_Ljava_lang_String_line_10:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_copyValueOf__CII_Ljava_lang_String_line_exit
function_java_lang_String_copyValueOf__CII_Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [copyValueOf__C_Ljava_lang_String] (P:1 - 1;L:0 - 0)
function_java_lang_String_copyValueOf__C_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_String_copyValueOf__C_Ljava_lang_String_line_0:
mov eax, java_lang_String_class
push eax
mov eax, 16
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_String_copyValueOf__C_Ljava_lang_String_line_3:
pop eax
push eax
push eax
function_java_lang_String_copyValueOf__C_Ljava_lang_String_line_4:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_String_copyValueOf__C_Ljava_lang_String_line_5:
call function_java_lang_String_$init$__C_V_line_start
add esp, 4*2
function_java_lang_String_copyValueOf__C_Ljava_lang_String_line_8:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_String_copyValueOf__C_Ljava_lang_String_line_exit
function_java_lang_String_copyValueOf__C_Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$destroy$] (P:1 - 1;L:0 - 0)
function_java_lang_String_$destroy$_line_start:
push ebp
mov ebp, esp
mov ebx, [ebp+4*2]
mov eax, [ebx+12]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
function_java_lang_String_$destroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [$cldestroy$] (P:0 - 0;L:0 - 0)
function_java_lang_String_$cldestroy$_line_start:
push ebp
mov ebp, esp
function_java_lang_String_$cldestroy$_line_0:
function_java_lang_String_$cldestroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;=================================================
;Starting function [$init$_C_V] (P:2 - 2;L:0 - 0)
function_java_lang_Character_$init$_C_V_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_$init$_C_V_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Character_$init$_C_V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_java_lang_Character_$init$_C_V_line_4:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Character_$init$_C_V_line_5:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_$init$_C_V_line_6:
pop eax
and eax, 0xFF
pop ebx
mov dword [ebx+8], eax
function_java_lang_Character_$init$_C_V_line_9:
jmp function_java_lang_Character_$init$_C_V_line_exit
function_java_lang_Character_$init$_C_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [valueOf_C_Ljava_lang_Character] (P:1 - 1;L:0 - 0)
function_java_lang_Character_valueOf_C_Ljava_lang_Character_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_valueOf_C_Ljava_lang_Character_line_0:
mov eax, java_lang_Character_class
push eax
mov eax, 9
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_Character_valueOf_C_Ljava_lang_Character_line_3:
pop eax
push eax
push eax
function_java_lang_Character_valueOf_C_Ljava_lang_Character_line_4:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_valueOf_C_Ljava_lang_Character_line_5:
call function_java_lang_Character_$init$_C_V_line_start
add esp, 4*2
function_java_lang_Character_valueOf_C_Ljava_lang_Character_line_8:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_Character_valueOf_C_Ljava_lang_Character_line_exit
function_java_lang_Character_valueOf_C_Ljava_lang_Character_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [charValue__C] (P:1 - 1;L:0 - 0)
function_java_lang_Character_charValue__C_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_charValue__C_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_charValue__C_line_1:
pop ebx
mov eax, dword [ebx+8]
movsx eax, al
push eax
function_java_lang_Character_charValue__C_line_4:
pop eax
jmp function_java_lang_Character_charValue__C_line_exit
function_java_lang_Character_charValue__C_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [hashCode__I] (P:1 - 1;L:0 - 0)
function_java_lang_Character_hashCode__I_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_hashCode__I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_hashCode__I_line_1:
pop ebx
mov eax, dword [ebx+8]
movsx eax, al
push eax
function_java_lang_Character_hashCode__I_line_4:
pop eax
jmp function_java_lang_Character_hashCode__I_line_exit
function_java_lang_Character_hashCode__I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [toString__Ljava_lang_String] (P:1 - 1;L:1 - 1)
function_java_lang_Character_toString__Ljava_lang_String_line_start:
push ebp
mov ebp, esp
sub esp, 4*1
mov dword [esp+4*0], 0
function_java_lang_Character_toString__Ljava_lang_String_line_0:
mov eax, 1
push eax
function_java_lang_Character_toString__Ljava_lang_String_line_1:
pop ecx
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
push eax
function_java_lang_Character_toString__Ljava_lang_String_line_3:
pop eax
push eax
push eax
function_java_lang_Character_toString__Ljava_lang_String_line_4:
mov eax, 0
push eax
function_java_lang_Character_toString__Ljava_lang_String_line_5:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_toString__Ljava_lang_String_line_6:
pop ebx
mov eax, dword [ebx+8]
movsx eax, al
push eax
function_java_lang_Character_toString__Ljava_lang_String_line_9:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_Character_toString__Ljava_lang_String_line_10:
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*1], eax
function_java_lang_Character_toString__Ljava_lang_String_line_11:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_Character_toString__Ljava_lang_String_line_12:
call function_java_lang_String_valueOf__C_Ljava_lang_String_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_Character_toString__Ljava_lang_String_line_15:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_Character_toString__Ljava_lang_String_line_exit
function_java_lang_Character_toString__Ljava_lang_String_line_exit:
push eax
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [toString_C_Ljava_lang_String] (P:1 - 1;L:0 - 0)
function_java_lang_Character_toString_C_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_toString_C_Ljava_lang_String_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_toString_C_Ljava_lang_String_line_1:
call function_java_lang_String_valueOf_C_Ljava_lang_String_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_Character_toString_C_Ljava_lang_String_line_4:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_Character_toString_C_Ljava_lang_String_line_exit
function_java_lang_Character_toString_C_Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [digit_CI_I] (P:2 - 2;L:0 - 0)
function_java_lang_Character_digit_CI_I_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_digit_CI_I_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Character_digit_CI_I_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_digit_CI_I_line_2:
call function_java_lang_Character_digit_II_I_line_start
add esp, 4*2
push eax
function_java_lang_Character_digit_CI_I_line_5:
pop eax
jmp function_java_lang_Character_digit_CI_I_line_exit
function_java_lang_Character_digit_CI_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [digit_II_I] (P:2 - 2;L:0 - 0)
function_java_lang_Character_digit_II_I_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_digit_II_I_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Character_digit_II_I_line_1:
call function_java_lang_Character_isLowerCase_I_Z_line_start
add esp, 4*1
push eax
function_java_lang_Character_digit_II_I_line_4:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_Character_digit_II_I_line_28
function_java_lang_Character_digit_II_I_line_7:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_digit_II_I_line_8:
mov eax, 97
push eax
function_java_lang_Character_digit_II_I_line_10:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_Character_digit_II_I_line_11:
mov eax, 10
push eax
function_java_lang_Character_digit_II_I_line_13:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_Character_digit_II_I_line_14:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Character_digit_II_I_line_15:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jg  function_java_lang_Character_digit_II_I_line_20
function_java_lang_Character_digit_II_I_line_18:
mov eax, -1
push eax
function_java_lang_Character_digit_II_I_line_19:
pop eax
jmp function_java_lang_Character_digit_II_I_line_exit
function_java_lang_Character_digit_II_I_line_20:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Character_digit_II_I_line_21:
mov eax, 97
push eax
function_java_lang_Character_digit_II_I_line_23:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_Character_digit_II_I_line_24:
mov eax, 10
push eax
function_java_lang_Character_digit_II_I_line_26:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_Character_digit_II_I_line_27:
pop eax
jmp function_java_lang_Character_digit_II_I_line_exit
function_java_lang_Character_digit_II_I_line_28:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Character_digit_II_I_line_29:
call function_java_lang_Character_isUpperCase_I_Z_line_start
add esp, 4*1
push eax
function_java_lang_Character_digit_II_I_line_32:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_Character_digit_II_I_line_56
function_java_lang_Character_digit_II_I_line_35:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_digit_II_I_line_36:
mov eax, 65
push eax
function_java_lang_Character_digit_II_I_line_38:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_Character_digit_II_I_line_39:
mov eax, 10
push eax
function_java_lang_Character_digit_II_I_line_41:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_Character_digit_II_I_line_42:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Character_digit_II_I_line_43:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jg  function_java_lang_Character_digit_II_I_line_48
function_java_lang_Character_digit_II_I_line_46:
mov eax, -1
push eax
function_java_lang_Character_digit_II_I_line_47:
pop eax
jmp function_java_lang_Character_digit_II_I_line_exit
function_java_lang_Character_digit_II_I_line_48:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Character_digit_II_I_line_49:
mov eax, 65
push eax
function_java_lang_Character_digit_II_I_line_51:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_Character_digit_II_I_line_52:
mov eax, 10
push eax
function_java_lang_Character_digit_II_I_line_54:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_Character_digit_II_I_line_55:
pop eax
jmp function_java_lang_Character_digit_II_I_line_exit
function_java_lang_Character_digit_II_I_line_56:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Character_digit_II_I_line_57:
call function_java_lang_Character_isDigit_I_Z_line_start
add esp, 4*1
push eax
function_java_lang_Character_digit_II_I_line_60:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_Character_digit_II_I_line_78
function_java_lang_Character_digit_II_I_line_63:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_digit_II_I_line_64:
mov eax, 48
push eax
function_java_lang_Character_digit_II_I_line_66:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_Character_digit_II_I_line_67:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Character_digit_II_I_line_68:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jg  function_java_lang_Character_digit_II_I_line_73
function_java_lang_Character_digit_II_I_line_71:
mov eax, -1
push eax
function_java_lang_Character_digit_II_I_line_72:
pop eax
jmp function_java_lang_Character_digit_II_I_line_exit
function_java_lang_Character_digit_II_I_line_73:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Character_digit_II_I_line_74:
mov eax, 48
push eax
function_java_lang_Character_digit_II_I_line_76:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_Character_digit_II_I_line_77:
pop eax
jmp function_java_lang_Character_digit_II_I_line_exit
function_java_lang_Character_digit_II_I_line_78:
mov eax, -1
push eax
function_java_lang_Character_digit_II_I_line_79:
pop eax
jmp function_java_lang_Character_digit_II_I_line_exit
function_java_lang_Character_digit_II_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [isLowerCase_C_Z] (P:1 - 1;L:0 - 0)
function_java_lang_Character_isLowerCase_C_Z_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_isLowerCase_C_Z_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isLowerCase_C_Z_line_1:
call function_java_lang_Character_isLowerCase_I_Z_line_start
add esp, 4*1
push eax
function_java_lang_Character_isLowerCase_C_Z_line_4:
pop eax
jmp function_java_lang_Character_isLowerCase_C_Z_line_exit
function_java_lang_Character_isLowerCase_C_Z_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [isLowerCase_I_Z] (P:1 - 1;L:0 - 0)
function_java_lang_Character_isLowerCase_I_Z_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_isLowerCase_I_Z_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isLowerCase_I_Z_line_1:
call function_java_lang_Character_getType_I_I_line_start
add esp, 4*1
push eax
function_java_lang_Character_isLowerCase_I_Z_line_4:
mov eax, 2
push eax
function_java_lang_Character_isLowerCase_I_Z_line_5:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_Character_isLowerCase_I_Z_line_10
function_java_lang_Character_isLowerCase_I_Z_line_8:
mov eax, 1
push eax
function_java_lang_Character_isLowerCase_I_Z_line_9:
pop eax
jmp function_java_lang_Character_isLowerCase_I_Z_line_exit
function_java_lang_Character_isLowerCase_I_Z_line_10:
mov eax, 0
push eax
function_java_lang_Character_isLowerCase_I_Z_line_11:
pop eax
jmp function_java_lang_Character_isLowerCase_I_Z_line_exit
function_java_lang_Character_isLowerCase_I_Z_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [isUpperCase_C_Z] (P:1 - 1;L:0 - 0)
function_java_lang_Character_isUpperCase_C_Z_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_isUpperCase_C_Z_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isUpperCase_C_Z_line_1:
call function_java_lang_Character_isUpperCase_I_Z_line_start
add esp, 4*1
push eax
function_java_lang_Character_isUpperCase_C_Z_line_4:
pop eax
jmp function_java_lang_Character_isUpperCase_C_Z_line_exit
function_java_lang_Character_isUpperCase_C_Z_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [isUpperCase_I_Z] (P:1 - 1;L:0 - 0)
function_java_lang_Character_isUpperCase_I_Z_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_isUpperCase_I_Z_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isUpperCase_I_Z_line_1:
call function_java_lang_Character_getType_I_I_line_start
add esp, 4*1
push eax
function_java_lang_Character_isUpperCase_I_Z_line_4:
mov eax, 1
push eax
function_java_lang_Character_isUpperCase_I_Z_line_5:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_Character_isUpperCase_I_Z_line_10
function_java_lang_Character_isUpperCase_I_Z_line_8:
mov eax, 1
push eax
function_java_lang_Character_isUpperCase_I_Z_line_9:
pop eax
jmp function_java_lang_Character_isUpperCase_I_Z_line_exit
function_java_lang_Character_isUpperCase_I_Z_line_10:
mov eax, 0
push eax
function_java_lang_Character_isUpperCase_I_Z_line_11:
pop eax
jmp function_java_lang_Character_isUpperCase_I_Z_line_exit
function_java_lang_Character_isUpperCase_I_Z_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [isDigit_C_Z] (P:1 - 1;L:0 - 0)
function_java_lang_Character_isDigit_C_Z_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_isDigit_C_Z_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isDigit_C_Z_line_1:
call function_java_lang_Character_isDigit_I_Z_line_start
add esp, 4*1
push eax
function_java_lang_Character_isDigit_C_Z_line_4:
pop eax
jmp function_java_lang_Character_isDigit_C_Z_line_exit
function_java_lang_Character_isDigit_C_Z_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [isDigit_I_Z] (P:1 - 1;L:0 - 0)
function_java_lang_Character_isDigit_I_Z_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_isDigit_I_Z_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isDigit_I_Z_line_1:
call function_java_lang_Character_getType_I_I_line_start
add esp, 4*1
push eax
function_java_lang_Character_isDigit_I_Z_line_4:
mov eax, 9
push eax
function_java_lang_Character_isDigit_I_Z_line_6:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_Character_isDigit_I_Z_line_11
function_java_lang_Character_isDigit_I_Z_line_9:
mov eax, 1
push eax
function_java_lang_Character_isDigit_I_Z_line_10:
pop eax
jmp function_java_lang_Character_isDigit_I_Z_line_exit
function_java_lang_Character_isDigit_I_Z_line_11:
mov eax, 0
push eax
function_java_lang_Character_isDigit_I_Z_line_12:
pop eax
jmp function_java_lang_Character_isDigit_I_Z_line_exit
function_java_lang_Character_isDigit_I_Z_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [isDefined_C_Z] (P:1 - 1;L:0 - 0)
function_java_lang_Character_isDefined_C_Z_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_isDefined_C_Z_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isDefined_C_Z_line_1:
call function_java_lang_Character_isDefined_I_Z_line_start
add esp, 4*1
push eax
function_java_lang_Character_isDefined_C_Z_line_4:
pop eax
jmp function_java_lang_Character_isDefined_C_Z_line_exit
function_java_lang_Character_isDefined_C_Z_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [isDefined_I_Z] (P:1 - 1;L:0 - 0)
function_java_lang_Character_isDefined_I_Z_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_isDefined_I_Z_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isDefined_I_Z_line_1:
call function_java_lang_Character_getType_I_I_line_start
add esp, 4*1
push eax
function_java_lang_Character_isDefined_I_Z_line_4:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_Character_isDefined_I_Z_line_9
function_java_lang_Character_isDefined_I_Z_line_7:
mov eax, 1
push eax
function_java_lang_Character_isDefined_I_Z_line_8:
pop eax
jmp function_java_lang_Character_isDefined_I_Z_line_exit
function_java_lang_Character_isDefined_I_Z_line_9:
mov eax, 0
push eax
function_java_lang_Character_isDefined_I_Z_line_10:
pop eax
jmp function_java_lang_Character_isDefined_I_Z_line_exit
function_java_lang_Character_isDefined_I_Z_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [isLetter_C_Z] (P:1 - 1;L:0 - 0)
function_java_lang_Character_isLetter_C_Z_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_isLetter_C_Z_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isLetter_C_Z_line_1:
call function_java_lang_Character_isLetter_I_Z_line_start
add esp, 4*1
push eax
function_java_lang_Character_isLetter_C_Z_line_4:
pop eax
jmp function_java_lang_Character_isLetter_C_Z_line_exit
function_java_lang_Character_isLetter_C_Z_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [isLetter_I_Z] (P:1 - 1;L:0 - 0)
function_java_lang_Character_isLetter_I_Z_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_isLetter_I_Z_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isLetter_I_Z_line_1:
call function_java_lang_Character_getType_I_I_line_start
add esp, 4*1
push eax
function_java_lang_Character_isLetter_I_Z_line_4:
mov eax, 1
push eax
function_java_lang_Character_isLetter_I_Z_line_5:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_Character_isLetter_I_Z_line_26
function_java_lang_Character_isLetter_I_Z_line_8:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isLetter_I_Z_line_9:
call function_java_lang_Character_getType_I_I_line_start
add esp, 4*1
push eax
function_java_lang_Character_isLetter_I_Z_line_12:
mov eax, 2
push eax
function_java_lang_Character_isLetter_I_Z_line_13:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_Character_isLetter_I_Z_line_26
function_java_lang_Character_isLetter_I_Z_line_16:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isLetter_I_Z_line_17:
call function_java_lang_Character_getType_I_I_line_start
add esp, 4*1
push eax
function_java_lang_Character_isLetter_I_Z_line_20:
mov eax, 5
push eax
function_java_lang_Character_isLetter_I_Z_line_21:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_Character_isLetter_I_Z_line_26
function_java_lang_Character_isLetter_I_Z_line_24:
mov eax, 0
push eax
function_java_lang_Character_isLetter_I_Z_line_25:
pop eax
jmp function_java_lang_Character_isLetter_I_Z_line_exit
function_java_lang_Character_isLetter_I_Z_line_26:
mov eax, 1
push eax
function_java_lang_Character_isLetter_I_Z_line_27:
pop eax
jmp function_java_lang_Character_isLetter_I_Z_line_exit
function_java_lang_Character_isLetter_I_Z_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [isLetterOrDigit_C_Z] (P:1 - 1;L:0 - 0)
function_java_lang_Character_isLetterOrDigit_C_Z_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_isLetterOrDigit_C_Z_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isLetterOrDigit_C_Z_line_1:
call function_java_lang_Character_isLetterOrDigit_I_Z_line_start
add esp, 4*1
push eax
function_java_lang_Character_isLetterOrDigit_C_Z_line_4:
pop eax
jmp function_java_lang_Character_isLetterOrDigit_C_Z_line_exit
function_java_lang_Character_isLetterOrDigit_C_Z_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [isLetterOrDigit_I_Z] (P:1 - 1;L:0 - 0)
function_java_lang_Character_isLetterOrDigit_I_Z_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_isLetterOrDigit_I_Z_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isLetterOrDigit_I_Z_line_1:
call function_java_lang_Character_isLetter_I_Z_line_start
add esp, 4*1
push eax
function_java_lang_Character_isLetterOrDigit_I_Z_line_4:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_Character_isLetterOrDigit_I_Z_line_16
function_java_lang_Character_isLetterOrDigit_I_Z_line_7:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isLetterOrDigit_I_Z_line_8:
call function_java_lang_Character_isDigit_I_Z_line_start
add esp, 4*1
push eax
function_java_lang_Character_isLetterOrDigit_I_Z_line_11:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_Character_isLetterOrDigit_I_Z_line_16
function_java_lang_Character_isLetterOrDigit_I_Z_line_14:
mov eax, 0
push eax
function_java_lang_Character_isLetterOrDigit_I_Z_line_15:
pop eax
jmp function_java_lang_Character_isLetterOrDigit_I_Z_line_exit
function_java_lang_Character_isLetterOrDigit_I_Z_line_16:
mov eax, 1
push eax
function_java_lang_Character_isLetterOrDigit_I_Z_line_17:
pop eax
jmp function_java_lang_Character_isLetterOrDigit_I_Z_line_exit
function_java_lang_Character_isLetterOrDigit_I_Z_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [isAlphabetic_I_Z] (P:1 - 1;L:0 - 0)
function_java_lang_Character_isAlphabetic_I_Z_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_isAlphabetic_I_Z_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isAlphabetic_I_Z_line_1:
mov eax, 65
push eax
function_java_lang_Character_isAlphabetic_I_Z_line_3:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_Character_isAlphabetic_I_Z_line_12
function_java_lang_Character_isAlphabetic_I_Z_line_6:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isAlphabetic_I_Z_line_7:
mov eax, 90
push eax
function_java_lang_Character_isAlphabetic_I_Z_line_9:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_Character_isAlphabetic_I_Z_line_26
function_java_lang_Character_isAlphabetic_I_Z_line_12:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isAlphabetic_I_Z_line_13:
mov eax, 97
push eax
function_java_lang_Character_isAlphabetic_I_Z_line_15:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_Character_isAlphabetic_I_Z_line_24
function_java_lang_Character_isAlphabetic_I_Z_line_18:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isAlphabetic_I_Z_line_19:
mov eax, 122
push eax
function_java_lang_Character_isAlphabetic_I_Z_line_21:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jle function_java_lang_Character_isAlphabetic_I_Z_line_26
function_java_lang_Character_isAlphabetic_I_Z_line_24:
mov eax, 0
push eax
function_java_lang_Character_isAlphabetic_I_Z_line_25:
pop eax
jmp function_java_lang_Character_isAlphabetic_I_Z_line_exit
function_java_lang_Character_isAlphabetic_I_Z_line_26:
mov eax, 1
push eax
function_java_lang_Character_isAlphabetic_I_Z_line_27:
pop eax
jmp function_java_lang_Character_isAlphabetic_I_Z_line_exit
function_java_lang_Character_isAlphabetic_I_Z_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [toLowerCase_C_C] (P:1 - 1;L:0 - 0)
function_java_lang_Character_toLowerCase_C_C_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_toLowerCase_C_C_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_toLowerCase_C_C_line_1:
call function_java_lang_Character_toLowerCase_I_I_line_start
add esp, 4*1
push eax
function_java_lang_Character_toLowerCase_C_C_line_4:
pop eax
movsx eax, al
push eax
function_java_lang_Character_toLowerCase_C_C_line_5:
pop eax
jmp function_java_lang_Character_toLowerCase_C_C_line_exit
function_java_lang_Character_toLowerCase_C_C_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [toLowerCase_I_I] (P:1 - 1;L:0 - 0)
function_java_lang_Character_toLowerCase_I_I_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_toLowerCase_I_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_toLowerCase_I_I_line_1:
call function_java_lang_Character_isAlphabetic_I_Z_line_start
add esp, 4*1
push eax
function_java_lang_Character_toLowerCase_I_I_line_4:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_Character_toLowerCase_I_I_line_12
function_java_lang_Character_toLowerCase_I_I_line_7:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_toLowerCase_I_I_line_8:
mov eax, 64
push eax
function_java_lang_Character_toLowerCase_I_I_line_10:
pop ebx
pop eax
or eax, ebx
push eax
function_java_lang_Character_toLowerCase_I_I_line_11:
pop eax
jmp function_java_lang_Character_toLowerCase_I_I_line_exit
function_java_lang_Character_toLowerCase_I_I_line_12:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_toLowerCase_I_I_line_13:
pop eax
jmp function_java_lang_Character_toLowerCase_I_I_line_exit
function_java_lang_Character_toLowerCase_I_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [toUpperCase_C_C] (P:1 - 1;L:0 - 0)
function_java_lang_Character_toUpperCase_C_C_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_toUpperCase_C_C_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_toUpperCase_C_C_line_1:
call function_java_lang_Character_toUpperCase_I_I_line_start
add esp, 4*1
push eax
function_java_lang_Character_toUpperCase_C_C_line_4:
pop eax
movsx eax, al
push eax
function_java_lang_Character_toUpperCase_C_C_line_5:
pop eax
jmp function_java_lang_Character_toUpperCase_C_C_line_exit
function_java_lang_Character_toUpperCase_C_C_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [toUpperCase_I_I] (P:1 - 1;L:0 - 0)
function_java_lang_Character_toUpperCase_I_I_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_toUpperCase_I_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_toUpperCase_I_I_line_1:
call function_java_lang_Character_isAlphabetic_I_Z_line_start
add esp, 4*1
push eax
function_java_lang_Character_toUpperCase_I_I_line_4:
mov eax, 0
push eax
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_Character_toUpperCase_I_I_line_12
function_java_lang_Character_toUpperCase_I_I_line_7:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_toUpperCase_I_I_line_8:
mov eax, 191
push eax
function_java_lang_Character_toUpperCase_I_I_line_10:
pop ebx
pop eax
and eax, ebx
push eax
function_java_lang_Character_toUpperCase_I_I_line_11:
pop eax
jmp function_java_lang_Character_toUpperCase_I_I_line_exit
function_java_lang_Character_toUpperCase_I_I_line_12:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_toUpperCase_I_I_line_13:
pop eax
jmp function_java_lang_Character_toUpperCase_I_I_line_exit
function_java_lang_Character_toUpperCase_I_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [getNumericValue_C_I] (P:1 - 1;L:0 - 0)
function_java_lang_Character_getNumericValue_C_I_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_getNumericValue_C_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_getNumericValue_C_I_line_1:
call function_java_lang_Character_getNumericValue_I_I_line_start
add esp, 4*1
push eax
function_java_lang_Character_getNumericValue_C_I_line_4:
pop eax
jmp function_java_lang_Character_getNumericValue_C_I_line_exit
function_java_lang_Character_getNumericValue_C_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [getNumericValue_I_I] (P:1 - 1;L:0 - 0)
function_java_lang_Character_getNumericValue_I_I_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_getNumericValue_I_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_getNumericValue_I_I_line_1:
pop eax
jmp function_java_lang_Character_getNumericValue_I_I_line_exit
function_java_lang_Character_getNumericValue_I_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [isSpaceChar_C_Z] (P:1 - 1;L:0 - 0)
function_java_lang_Character_isSpaceChar_C_Z_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_isSpaceChar_C_Z_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isSpaceChar_C_Z_line_1:
call function_java_lang_Character_isSpaceChar_I_Z_line_start
add esp, 4*1
push eax
function_java_lang_Character_isSpaceChar_C_Z_line_4:
pop eax
jmp function_java_lang_Character_isSpaceChar_C_Z_line_exit
function_java_lang_Character_isSpaceChar_C_Z_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [isSpaceChar_I_Z] (P:1 - 1;L:0 - 0)
function_java_lang_Character_isSpaceChar_I_Z_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_isSpaceChar_I_Z_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isSpaceChar_I_Z_line_1:
mov eax, 32
push eax
function_java_lang_Character_isSpaceChar_I_Z_line_3:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_Character_isSpaceChar_I_Z_line_20
function_java_lang_Character_isSpaceChar_I_Z_line_6:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isSpaceChar_I_Z_line_7:
mov eax, 10
push eax
function_java_lang_Character_isSpaceChar_I_Z_line_9:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_Character_isSpaceChar_I_Z_line_20
function_java_lang_Character_isSpaceChar_I_Z_line_12:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isSpaceChar_I_Z_line_13:
mov eax, 9
push eax
function_java_lang_Character_isSpaceChar_I_Z_line_15:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
je  function_java_lang_Character_isSpaceChar_I_Z_line_20
function_java_lang_Character_isSpaceChar_I_Z_line_18:
mov eax, 0
push eax
function_java_lang_Character_isSpaceChar_I_Z_line_19:
pop eax
jmp function_java_lang_Character_isSpaceChar_I_Z_line_exit
function_java_lang_Character_isSpaceChar_I_Z_line_20:
mov eax, 1
push eax
function_java_lang_Character_isSpaceChar_I_Z_line_21:
pop eax
jmp function_java_lang_Character_isSpaceChar_I_Z_line_exit
function_java_lang_Character_isSpaceChar_I_Z_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [isWhitespace_C_Z] (P:1 - 1;L:0 - 0)
function_java_lang_Character_isWhitespace_C_Z_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_isWhitespace_C_Z_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isWhitespace_C_Z_line_1:
call function_java_lang_Character_isWhitespace_I_Z_line_start
add esp, 4*1
push eax
function_java_lang_Character_isWhitespace_C_Z_line_4:
pop eax
jmp function_java_lang_Character_isWhitespace_C_Z_line_exit
function_java_lang_Character_isWhitespace_C_Z_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [isWhitespace_I_Z] (P:1 - 1;L:0 - 0)
function_java_lang_Character_isWhitespace_I_Z_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_isWhitespace_I_Z_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_isWhitespace_I_Z_line_1:
mov eax, 32
push eax
function_java_lang_Character_isWhitespace_I_Z_line_3:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jne function_java_lang_Character_isWhitespace_I_Z_line_8
function_java_lang_Character_isWhitespace_I_Z_line_6:
mov eax, 1
push eax
function_java_lang_Character_isWhitespace_I_Z_line_7:
pop eax
jmp function_java_lang_Character_isWhitespace_I_Z_line_exit
function_java_lang_Character_isWhitespace_I_Z_line_8:
mov eax, 0
push eax
function_java_lang_Character_isWhitespace_I_Z_line_9:
pop eax
jmp function_java_lang_Character_isWhitespace_I_Z_line_exit
function_java_lang_Character_isWhitespace_I_Z_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [getType_C_I] (P:1 - 1;L:0 - 0)
function_java_lang_Character_getType_C_I_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_getType_C_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_getType_C_I_line_1:
call function_java_lang_Character_getType_I_I_line_start
add esp, 4*1
push eax
function_java_lang_Character_getType_C_I_line_4:
pop eax
jmp function_java_lang_Character_getType_C_I_line_exit
function_java_lang_Character_getType_C_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [getType_I_I] (P:1 - 1;L:0 - 0)
function_java_lang_Character_getType_I_I_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_getType_I_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_getType_I_I_line_1:
mov eax, 65
push eax
function_java_lang_Character_getType_I_I_line_3:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_Character_getType_I_I_line_14
function_java_lang_Character_getType_I_I_line_6:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_getType_I_I_line_7:
mov eax, 90
push eax
function_java_lang_Character_getType_I_I_line_9:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jg  function_java_lang_Character_getType_I_I_line_14
function_java_lang_Character_getType_I_I_line_12:
mov eax, 1
push eax
function_java_lang_Character_getType_I_I_line_13:
pop eax
jmp function_java_lang_Character_getType_I_I_line_exit
function_java_lang_Character_getType_I_I_line_14:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_getType_I_I_line_15:
mov eax, 97
push eax
function_java_lang_Character_getType_I_I_line_17:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_Character_getType_I_I_line_28
function_java_lang_Character_getType_I_I_line_20:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_getType_I_I_line_21:
mov eax, 122
push eax
function_java_lang_Character_getType_I_I_line_23:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jg  function_java_lang_Character_getType_I_I_line_28
function_java_lang_Character_getType_I_I_line_26:
mov eax, 2
push eax
function_java_lang_Character_getType_I_I_line_27:
pop eax
jmp function_java_lang_Character_getType_I_I_line_exit
function_java_lang_Character_getType_I_I_line_28:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_getType_I_I_line_29:
mov eax, 48
push eax
function_java_lang_Character_getType_I_I_line_31:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_Character_getType_I_I_line_43
function_java_lang_Character_getType_I_I_line_34:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_getType_I_I_line_35:
mov eax, 57
push eax
function_java_lang_Character_getType_I_I_line_37:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jg  function_java_lang_Character_getType_I_I_line_43
function_java_lang_Character_getType_I_I_line_40:
mov eax, 9
push eax
function_java_lang_Character_getType_I_I_line_42:
pop eax
jmp function_java_lang_Character_getType_I_I_line_exit
function_java_lang_Character_getType_I_I_line_43:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_getType_I_I_line_44:
mov eax, 32
push eax
function_java_lang_Character_getType_I_I_line_46:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_Character_getType_I_I_line_57
function_java_lang_Character_getType_I_I_line_49:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_getType_I_I_line_50:
mov eax, 126
push eax
function_java_lang_Character_getType_I_I_line_52:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jg  function_java_lang_Character_getType_I_I_line_57
function_java_lang_Character_getType_I_I_line_55:
mov eax, 5
push eax
function_java_lang_Character_getType_I_I_line_56:
pop eax
jmp function_java_lang_Character_getType_I_I_line_exit
function_java_lang_Character_getType_I_I_line_57:
mov eax, 0
push eax
function_java_lang_Character_getType_I_I_line_58:
pop eax
jmp function_java_lang_Character_getType_I_I_line_exit
function_java_lang_Character_getType_I_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [compareTo_Ljava_lang_Character_I] (P:2 - 2;L:0 - 0)
function_java_lang_Character_compareTo_Ljava_lang_Character_I_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_compareTo_Ljava_lang_Character_I_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Character_compareTo_Ljava_lang_Character_I_line_1:
pop ebx
mov eax, dword [ebx+8]
movsx eax, al
push eax
function_java_lang_Character_compareTo_Ljava_lang_Character_I_line_4:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_compareTo_Ljava_lang_Character_I_line_5:
pop ebx
mov eax, dword [ebx+8]
movsx eax, al
push eax
function_java_lang_Character_compareTo_Ljava_lang_Character_I_line_8:
call function_java_lang_Character_compare_CC_I_line_start
add esp, 4*2
push eax
function_java_lang_Character_compareTo_Ljava_lang_Character_I_line_11:
pop eax
jmp function_java_lang_Character_compareTo_Ljava_lang_Character_I_line_exit
function_java_lang_Character_compareTo_Ljava_lang_Character_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [compare_CC_I] (P:2 - 2;L:0 - 0)
function_java_lang_Character_compare_CC_I_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_compare_CC_I_line_0:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_Character_compare_CC_I_line_1:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_Character_compare_CC_I_line_2:
pop ebx
pop eax
sub eax, ebx
push eax
function_java_lang_Character_compare_CC_I_line_3:
pop eax
jmp function_java_lang_Character_compare_CC_I_line_exit
function_java_lang_Character_compare_CC_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$destroy$] (P:1 - 1;L:0 - 0)
function_java_lang_Character_$destroy$_line_start:
push ebp
mov ebp, esp
mov ebx, [ebp+4*2]
function_java_lang_Character_$destroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [$cldestroy$] (P:0 - 0;L:0 - 0)
function_java_lang_Character_$cldestroy$_line_start:
push ebp
mov ebp, esp
function_java_lang_Character_$cldestroy$_line_0:
function_java_lang_Character_$cldestroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;=================================================
;Starting function [$init$__V] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_LibC_$init$__V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_LibC_$init$__V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_LibC_$init$__V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_pusty_f0xC_imports_LibC_$init$__V_line_4:
jmp function_pusty_f0xC_imports_LibC_$init$__V_line_exit
function_pusty_f0xC_imports_LibC_$init$__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [native_malloc_I_I] (P:1 - 1;L:0 - 0)
;Starting function [native_free_I_V] (P:1 - 1;L:0 - 0)
;Starting function [native_exit_I_V] (P:1 - 1;L:0 - 0)
;Starting function [libc_printf__V] (P:0 - 0;L:0 - 0)
;Starting function [malloc_I_Ljava_lang_Object] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_LibC_malloc_I_Ljava_lang_Object_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_LibC_malloc_I_Ljava_lang_Object_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_LibC_malloc_I_Ljava_lang_Object_line_1:
call dword [native_malloc]
add esp, 4*1
push eax
function_pusty_f0xC_imports_LibC_malloc_I_Ljava_lang_Object_line_4:
call function_pusty_f0xC_imports_InternalObject_int2obj_I_Ljava_lang_Object_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_pusty_f0xC_imports_LibC_malloc_I_Ljava_lang_Object_line_7:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_pusty_f0xC_imports_LibC_malloc_I_Ljava_lang_Object_line_exit
function_pusty_f0xC_imports_LibC_malloc_I_Ljava_lang_Object_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [free_Ljava_lang_Object_V] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_LibC_free_Ljava_lang_Object_V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_LibC_free_Ljava_lang_Object_V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_LibC_free_Ljava_lang_Object_V_line_1:
call function_pusty_f0xC_imports_InternalObject_obj2int_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_LibC_free_Ljava_lang_Object_V_line_4:
call dword [native_free]
add esp, 4*1
function_pusty_f0xC_imports_LibC_free_Ljava_lang_Object_V_line_7:
jmp function_pusty_f0xC_imports_LibC_free_Ljava_lang_Object_V_line_exit
function_pusty_f0xC_imports_LibC_free_Ljava_lang_Object_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [exit_I_V] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_LibC_exit_I_V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_LibC_exit_I_V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_LibC_exit_I_V_line_1:
call dword [native_exit]
add esp, 4*1
function_pusty_f0xC_imports_LibC_exit_I_V_line_4:
jmp function_pusty_f0xC_imports_LibC_exit_I_V_line_exit
function_pusty_f0xC_imports_LibC_exit_I_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [printDB_III_V] (P:3 - 3;L:0 - 0)
function_pusty_f0xC_imports_LibC_printDB_III_V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_LibC_printDB_III_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [printDG_III_V] (P:3 - 3;L:0 - 0)
function_pusty_f0xC_imports_LibC_printDG_III_V_line_start:
push ebp
mov ebp, esp
cinvoke libc_printf,[ebp+4*4],[ebp+4*3],[ebp+4*2]
function_pusty_f0xC_imports_LibC_printDG_III_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [getDBStr_I_I] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_LibC_getDBStr_I_I_line_start:
push ebp
mov ebp, esp
mov edx, [ebp+4*2]
mov edi, debugFixedStrings
getDBStr_repeat:
test edx, edx
jz getDBStr_end
mov ecx, -1
xor eax, eax
repnz scasb
dec edx
jmp getDBStr_repeat
getDBStr_end:
mov eax, edi
function_pusty_f0xC_imports_LibC_getDBStr_I_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [JString2CString_Ljava_lang_String__B] (P:1 - 1;L:2 - 2)
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_start:
push ebp
mov ebp, esp
sub esp, 4*2
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_1:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:length__I
add eax, 4*5
call dword [eax] ;java_lang_String.length__I
add esp, 4*1
push eax
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_4:
mov eax, 1
push eax
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_5:
pop ebx
pop eax
add eax, ebx
push eax
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_6:
pop ecx
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
push eax
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_8:
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*1], eax
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_9:
mov eax, 0
push eax
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_10:
pop eax
mov dword [ebp-4*2], eax
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_11:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_26
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_14:
mov eax, dword [ebp-4*1]
push eax
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_15:
mov eax, dword [ebp-4*2]
push eax
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_16:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_17:
mov eax, dword [ebp-4*2]
push eax
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_18:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:charAt_I_C
add eax, 4*7
call dword [eax] ;java_lang_String.charAt_I_C
add esp, 4*2
push eax
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_21:
pop eax
movsx eax, al
push eax
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_22:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_23:
mov eax, dword [ebp-4*2]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*2], eax
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_26:
mov eax, dword [ebp-4*2]
push eax
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_27:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_28:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:length__I
add eax, 4*5
call dword [eax] ;java_lang_String.length__I
add esp, 4*1
push eax
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_31:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_14
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_34:
mov eax, dword [ebp-4*1]
push eax
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_35:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_36:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:length__I
add eax, 4*5
call dword [eax] ;java_lang_String.length__I
add esp, 4*1
push eax
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_39:
mov eax, 0
push eax
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_40:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_41:
mov eax, dword [ebp-4*1]
push eax
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_42:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_exit
function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_exit:
push eax
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [JString2WString_Ljava_lang_String__B] (P:1 - 1;L:2 - 2)
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_start:
push ebp
mov ebp, esp
sub esp, 4*2
mov dword [esp+4*0], 0
mov dword [esp+4*1], 0
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_1:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:length__I
add eax, 4*5
call dword [eax] ;java_lang_String.length__I
add esp, 4*1
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_4:
mov eax, 1
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_5:
pop ebx
pop eax
add eax, ebx
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_6:
mov eax, 2
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_7:
pop ebx
pop eax
imul eax, ebx
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_8:
pop ecx
mov eax, array_class
push ecx
push eax
imul eax, ecx, 1
add eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
pop ecx
mov [eax+8], ecx
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_10:
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [ebp-4*1], eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_11:
mov eax, 0
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_12:
pop eax
mov dword [ebp-4*2], eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_13:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_38
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_16:
mov eax, dword [ebp-4*1]
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_17:
mov eax, dword [ebp-4*2]
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_18:
mov eax, 2
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_19:
pop ebx
pop eax
imul eax, ebx
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_20:
mov eax, 0
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_21:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_22:
mov eax, dword [ebp-4*1]
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_23:
mov eax, dword [ebp-4*2]
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_24:
mov eax, 2
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_25:
pop ebx
pop eax
imul eax, ebx
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_26:
mov eax, 1
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_27:
pop ebx
pop eax
add eax, ebx
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_28:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_29:
mov eax, dword [ebp-4*2]
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_30:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:charAt_I_C
add eax, 4*7
call dword [eax] ;java_lang_String.charAt_I_C
add esp, 4*2
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_33:
pop eax
movsx eax, al
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_34:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_35:
mov eax, dword [ebp-4*2]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*2], eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_38:
mov eax, dword [ebp-4*2]
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_39:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_40:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:length__I
add eax, 4*5
call dword [eax] ;java_lang_String.length__I
add esp, 4*1
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_43:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_16
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_46:
mov eax, dword [ebp-4*1]
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_47:
mov eax, dword [ebp-4*1]
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_48:
pop ebx
mov eax, [ebx+8]
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_49:
mov eax, 1
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_50:
pop ebx
pop eax
sub eax, ebx
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_51:
mov eax, 0
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_52:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_53:
mov eax, dword [ebp-4*1]
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_54:
mov eax, dword [ebp-4*1]
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_55:
pop ebx
mov eax, [ebx+8]
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_56:
mov eax, 0
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_57:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_58:
mov eax, dword [ebp-4*1]
push eax
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_59:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_exit
function_pusty_f0xC_imports_LibC_JString2WString_Ljava_lang_String__B_line_exit:
push eax
mov eax, dword [ebp-4*1]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$destroy$] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_LibC_$destroy$_line_start:
push ebp
mov ebp, esp
mov ebx, [ebp+4*2]
function_pusty_f0xC_imports_LibC_$destroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [$cldestroy$] (P:0 - 0;L:0 - 0)
function_pusty_f0xC_imports_LibC_$cldestroy$_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_LibC_$cldestroy$_line_0:
function_pusty_f0xC_imports_LibC_$cldestroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;=================================================
;Starting function [$init$__V] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio_$init$__V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio_$init$__V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio_$init$__V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_pusty_f0xC_imports_libc_CStdio_$init$__V_line_4:
jmp function_pusty_f0xC_imports_libc_CStdio_$init$__V_line_exit
function_pusty_f0xC_imports_libc_CStdio_$init$__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [native_fclose_I_I] (P:1 - 1;L:0 - 0)
;Starting function [fclose_Lpusty_f0xC_imports_libc_CStdio$FILE_I] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio_fclose_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio_fclose_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio_fclose_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_1:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:getFD__I
add eax, 4*5
call dword [eax] ;pusty_f0xC_imports_libc_CStdio$FILE.getFD__I
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_fclose_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_4:
call dword [native_fclose]
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_fclose_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_7:
pop eax
jmp function_pusty_f0xC_imports_libc_CStdio_fclose_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_exit
function_pusty_f0xC_imports_libc_CStdio_fclose_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [native_clearerr_I_V] (P:1 - 1;L:0 - 0)
;Starting function [clearerr_Lpusty_f0xC_imports_libc_CStdio$FILE_V] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio_clearerr_Lpusty_f0xC_imports_libc_CStdio$FILE_V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio_clearerr_Lpusty_f0xC_imports_libc_CStdio$FILE_V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio_clearerr_Lpusty_f0xC_imports_libc_CStdio$FILE_V_line_1:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:getFD__I
add eax, 4*5
call dword [eax] ;pusty_f0xC_imports_libc_CStdio$FILE.getFD__I
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_clearerr_Lpusty_f0xC_imports_libc_CStdio$FILE_V_line_4:
call dword [native_clearerr]
add esp, 4*1
function_pusty_f0xC_imports_libc_CStdio_clearerr_Lpusty_f0xC_imports_libc_CStdio$FILE_V_line_7:
jmp function_pusty_f0xC_imports_libc_CStdio_clearerr_Lpusty_f0xC_imports_libc_CStdio$FILE_V_line_exit
function_pusty_f0xC_imports_libc_CStdio_clearerr_Lpusty_f0xC_imports_libc_CStdio$FILE_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [native_feof_I_I] (P:1 - 1;L:0 - 0)
;Starting function [feof_Lpusty_f0xC_imports_libc_CStdio$FILE_I] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio_feof_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio_feof_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio_feof_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_1:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:getFD__I
add eax, 4*5
call dword [eax] ;pusty_f0xC_imports_libc_CStdio$FILE.getFD__I
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_feof_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_4:
call dword [native_feof]
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_feof_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_7:
pop eax
jmp function_pusty_f0xC_imports_libc_CStdio_feof_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_exit
function_pusty_f0xC_imports_libc_CStdio_feof_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [native_ferror_I_I] (P:1 - 1;L:0 - 0)
;Starting function [ferror_Lpusty_f0xC_imports_libc_CStdio$FILE_I] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio_ferror_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio_ferror_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio_ferror_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_1:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:getFD__I
add eax, 4*5
call dword [eax] ;pusty_f0xC_imports_libc_CStdio$FILE.getFD__I
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_ferror_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_4:
call dword [native_ferror]
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_ferror_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_7:
pop eax
jmp function_pusty_f0xC_imports_libc_CStdio_ferror_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_exit
function_pusty_f0xC_imports_libc_CStdio_ferror_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [native_fflush_I_I] (P:1 - 1;L:0 - 0)
;Starting function [fflush_Lpusty_f0xC_imports_libc_CStdio$FILE_I] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio_fflush_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio_fflush_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio_fflush_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_1:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:getFD__I
add eax, 4*5
call dword [eax] ;pusty_f0xC_imports_libc_CStdio$FILE.getFD__I
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_fflush_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_4:
call dword [native_fflush]
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_fflush_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_7:
pop eax
jmp function_pusty_f0xC_imports_libc_CStdio_fflush_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_exit
function_pusty_f0xC_imports_libc_CStdio_fflush_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [native_fopen_II_I] (P:2 - 2;L:0 - 0)
;Starting function [fopen_Ljava_lang_StringLjava_lang_String_Lpusty_f0xC_imports_libc_CStdio$FILE] (P:2 - 2;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio_fopen_Ljava_lang_StringLjava_lang_String_Lpusty_f0xC_imports_libc_CStdio$FILE_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio_fopen_Ljava_lang_StringLjava_lang_String_Lpusty_f0xC_imports_libc_CStdio$FILE_line_0:
mov eax, pusty_f0xC_imports_libc_CStdio$FILE_class
push eax
mov eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_pusty_f0xC_imports_libc_CStdio_fopen_Ljava_lang_StringLjava_lang_String_Lpusty_f0xC_imports_libc_CStdio$FILE_line_3:
pop eax
push eax
push eax
function_pusty_f0xC_imports_libc_CStdio_fopen_Ljava_lang_StringLjava_lang_String_Lpusty_f0xC_imports_libc_CStdio$FILE_line_4:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio_fopen_Ljava_lang_StringLjava_lang_String_Lpusty_f0xC_imports_libc_CStdio$FILE_line_5:
call function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_pusty_f0xC_imports_libc_CStdio_fopen_Ljava_lang_StringLjava_lang_String_Lpusty_f0xC_imports_libc_CStdio$FILE_line_8:
call function_pusty_f0xC_imports_InternalObject_con2int_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_fopen_Ljava_lang_StringLjava_lang_String_Lpusty_f0xC_imports_libc_CStdio$FILE_line_11:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_libc_CStdio_fopen_Ljava_lang_StringLjava_lang_String_Lpusty_f0xC_imports_libc_CStdio$FILE_line_12:
call function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_pusty_f0xC_imports_libc_CStdio_fopen_Ljava_lang_StringLjava_lang_String_Lpusty_f0xC_imports_libc_CStdio$FILE_line_15:
call function_pusty_f0xC_imports_InternalObject_con2int_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_fopen_Ljava_lang_StringLjava_lang_String_Lpusty_f0xC_imports_libc_CStdio$FILE_line_18:
call dword [native_fopen]
add esp, 4*2
push eax
function_pusty_f0xC_imports_libc_CStdio_fopen_Ljava_lang_StringLjava_lang_String_Lpusty_f0xC_imports_libc_CStdio$FILE_line_21:
call function_pusty_f0xC_imports_libc_CStdio$FILE_$init$_I_V_line_start
add esp, 4*2
function_pusty_f0xC_imports_libc_CStdio_fopen_Ljava_lang_StringLjava_lang_String_Lpusty_f0xC_imports_libc_CStdio$FILE_line_24:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_pusty_f0xC_imports_libc_CStdio_fopen_Ljava_lang_StringLjava_lang_String_Lpusty_f0xC_imports_libc_CStdio$FILE_line_exit
function_pusty_f0xC_imports_libc_CStdio_fopen_Ljava_lang_StringLjava_lang_String_Lpusty_f0xC_imports_libc_CStdio$FILE_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [native_fread_IIII_I] (P:4 - 4;L:0 - 0)
;Starting function [fread__BIILpusty_f0xC_imports_libc_CStdio$FILE_I] (P:4 - 4;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio_fread__BIILpusty_f0xC_imports_libc_CStdio$FILE_I_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio_fread__BIILpusty_f0xC_imports_libc_CStdio$FILE_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio_fread__BIILpusty_f0xC_imports_libc_CStdio$FILE_I_line_1:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:getFD__I
add eax, 4*5
call dword [eax] ;pusty_f0xC_imports_libc_CStdio$FILE.getFD__I
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_fread__BIILpusty_f0xC_imports_libc_CStdio$FILE_I_line_4:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_libc_CStdio_fread__BIILpusty_f0xC_imports_libc_CStdio$FILE_I_line_5:
mov eax, dword [ebp+4*4]
push eax
function_pusty_f0xC_imports_libc_CStdio_fread__BIILpusty_f0xC_imports_libc_CStdio$FILE_I_line_6:
mov eax, dword [ebp+4*5]
push eax
function_pusty_f0xC_imports_libc_CStdio_fread__BIILpusty_f0xC_imports_libc_CStdio$FILE_I_line_7:
call function_pusty_f0xC_imports_InternalObject_con2int_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_fread__BIILpusty_f0xC_imports_libc_CStdio$FILE_I_line_10:
call dword [native_fread]
add esp, 4*4
push eax
function_pusty_f0xC_imports_libc_CStdio_fread__BIILpusty_f0xC_imports_libc_CStdio$FILE_I_line_13:
pop eax
jmp function_pusty_f0xC_imports_libc_CStdio_fread__BIILpusty_f0xC_imports_libc_CStdio$FILE_I_line_exit
function_pusty_f0xC_imports_libc_CStdio_fread__BIILpusty_f0xC_imports_libc_CStdio$FILE_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [native_freopen_III_I] (P:3 - 3;L:0 - 0)
;Starting function [freopen_Ljava_lang_StringLjava_lang_StringLpusty_f0xC_imports_libc_CStdio$FILE_Lpusty_f0xC_imports_libc_CStdio$FILE] (P:3 - 3;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio_freopen_Ljava_lang_StringLjava_lang_StringLpusty_f0xC_imports_libc_CStdio$FILE_Lpusty_f0xC_imports_libc_CStdio$FILE_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio_freopen_Ljava_lang_StringLjava_lang_StringLpusty_f0xC_imports_libc_CStdio$FILE_Lpusty_f0xC_imports_libc_CStdio$FILE_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio_freopen_Ljava_lang_StringLjava_lang_StringLpusty_f0xC_imports_libc_CStdio$FILE_Lpusty_f0xC_imports_libc_CStdio$FILE_line_1:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio_freopen_Ljava_lang_StringLjava_lang_StringLpusty_f0xC_imports_libc_CStdio$FILE_Lpusty_f0xC_imports_libc_CStdio$FILE_line_2:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:getFD__I
add eax, 4*5
call dword [eax] ;pusty_f0xC_imports_libc_CStdio$FILE.getFD__I
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_freopen_Ljava_lang_StringLjava_lang_StringLpusty_f0xC_imports_libc_CStdio$FILE_Lpusty_f0xC_imports_libc_CStdio$FILE_line_5:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_libc_CStdio_freopen_Ljava_lang_StringLjava_lang_StringLpusty_f0xC_imports_libc_CStdio$FILE_Lpusty_f0xC_imports_libc_CStdio$FILE_line_6:
call function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_pusty_f0xC_imports_libc_CStdio_freopen_Ljava_lang_StringLjava_lang_StringLpusty_f0xC_imports_libc_CStdio$FILE_Lpusty_f0xC_imports_libc_CStdio$FILE_line_9:
call function_pusty_f0xC_imports_InternalObject_con2int_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_freopen_Ljava_lang_StringLjava_lang_StringLpusty_f0xC_imports_libc_CStdio$FILE_Lpusty_f0xC_imports_libc_CStdio$FILE_line_12:
mov eax, dword [ebp+4*4]
push eax
function_pusty_f0xC_imports_libc_CStdio_freopen_Ljava_lang_StringLjava_lang_StringLpusty_f0xC_imports_libc_CStdio$FILE_Lpusty_f0xC_imports_libc_CStdio$FILE_line_13:
call function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_pusty_f0xC_imports_libc_CStdio_freopen_Ljava_lang_StringLjava_lang_StringLpusty_f0xC_imports_libc_CStdio$FILE_Lpusty_f0xC_imports_libc_CStdio$FILE_line_16:
call function_pusty_f0xC_imports_InternalObject_con2int_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_freopen_Ljava_lang_StringLjava_lang_StringLpusty_f0xC_imports_libc_CStdio$FILE_Lpusty_f0xC_imports_libc_CStdio$FILE_line_19:
call dword [native_freopen]
add esp, 4*3
push eax
function_pusty_f0xC_imports_libc_CStdio_freopen_Ljava_lang_StringLjava_lang_StringLpusty_f0xC_imports_libc_CStdio$FILE_Lpusty_f0xC_imports_libc_CStdio$FILE_line_22:
mov eax, dword [esp+4*1]
mov eax, dword [eax] ;VFC:setFD_I_V
add eax, 4*6
call dword [eax] ;pusty_f0xC_imports_libc_CStdio$FILE.setFD_I_V
add esp, 4*2
function_pusty_f0xC_imports_libc_CStdio_freopen_Ljava_lang_StringLjava_lang_StringLpusty_f0xC_imports_libc_CStdio$FILE_Lpusty_f0xC_imports_libc_CStdio$FILE_line_25:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio_freopen_Ljava_lang_StringLjava_lang_StringLpusty_f0xC_imports_libc_CStdio$FILE_Lpusty_f0xC_imports_libc_CStdio$FILE_line_26:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_pusty_f0xC_imports_libc_CStdio_freopen_Ljava_lang_StringLjava_lang_StringLpusty_f0xC_imports_libc_CStdio$FILE_Lpusty_f0xC_imports_libc_CStdio$FILE_line_exit
function_pusty_f0xC_imports_libc_CStdio_freopen_Ljava_lang_StringLjava_lang_StringLpusty_f0xC_imports_libc_CStdio$FILE_Lpusty_f0xC_imports_libc_CStdio$FILE_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [native_fwrite_IIII_I] (P:4 - 4;L:0 - 0)
;Starting function [fwrite__BIILpusty_f0xC_imports_libc_CStdio$FILE_I] (P:4 - 4;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio_fwrite__BIILpusty_f0xC_imports_libc_CStdio$FILE_I_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio_fwrite__BIILpusty_f0xC_imports_libc_CStdio$FILE_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio_fwrite__BIILpusty_f0xC_imports_libc_CStdio$FILE_I_line_1:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:getFD__I
add eax, 4*5
call dword [eax] ;pusty_f0xC_imports_libc_CStdio$FILE.getFD__I
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_fwrite__BIILpusty_f0xC_imports_libc_CStdio$FILE_I_line_4:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_libc_CStdio_fwrite__BIILpusty_f0xC_imports_libc_CStdio$FILE_I_line_5:
mov eax, dword [ebp+4*4]
push eax
function_pusty_f0xC_imports_libc_CStdio_fwrite__BIILpusty_f0xC_imports_libc_CStdio$FILE_I_line_6:
mov eax, dword [ebp+4*5]
push eax
function_pusty_f0xC_imports_libc_CStdio_fwrite__BIILpusty_f0xC_imports_libc_CStdio$FILE_I_line_7:
call function_pusty_f0xC_imports_InternalObject_con2int_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_fwrite__BIILpusty_f0xC_imports_libc_CStdio$FILE_I_line_10:
call dword [native_fwrite]
add esp, 4*4
push eax
function_pusty_f0xC_imports_libc_CStdio_fwrite__BIILpusty_f0xC_imports_libc_CStdio$FILE_I_line_13:
pop eax
jmp function_pusty_f0xC_imports_libc_CStdio_fwrite__BIILpusty_f0xC_imports_libc_CStdio$FILE_I_line_exit
function_pusty_f0xC_imports_libc_CStdio_fwrite__BIILpusty_f0xC_imports_libc_CStdio$FILE_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [native_remove_I_I] (P:1 - 1;L:0 - 0)
;Starting function [remove_Ljava_lang_String_I] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio_remove_Ljava_lang_String_I_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio_remove_Ljava_lang_String_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio_remove_Ljava_lang_String_I_line_1:
call function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_pusty_f0xC_imports_libc_CStdio_remove_Ljava_lang_String_I_line_4:
call function_pusty_f0xC_imports_InternalObject_con2int_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_remove_Ljava_lang_String_I_line_7:
call dword [native_remove]
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_remove_Ljava_lang_String_I_line_10:
pop eax
jmp function_pusty_f0xC_imports_libc_CStdio_remove_Ljava_lang_String_I_line_exit
function_pusty_f0xC_imports_libc_CStdio_remove_Ljava_lang_String_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [native_rename_II_I] (P:2 - 2;L:0 - 0)
;Starting function [rename_Ljava_lang_StringLjava_lang_String_I] (P:2 - 2;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio_rename_Ljava_lang_StringLjava_lang_String_I_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio_rename_Ljava_lang_StringLjava_lang_String_I_line_0:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_libc_CStdio_rename_Ljava_lang_StringLjava_lang_String_I_line_1:
call function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_pusty_f0xC_imports_libc_CStdio_rename_Ljava_lang_StringLjava_lang_String_I_line_4:
call function_pusty_f0xC_imports_InternalObject_con2int_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_rename_Ljava_lang_StringLjava_lang_String_I_line_7:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio_rename_Ljava_lang_StringLjava_lang_String_I_line_8:
call function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_pusty_f0xC_imports_libc_CStdio_rename_Ljava_lang_StringLjava_lang_String_I_line_11:
call function_pusty_f0xC_imports_InternalObject_con2int_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_rename_Ljava_lang_StringLjava_lang_String_I_line_14:
call dword [native_rename]
add esp, 4*2
push eax
function_pusty_f0xC_imports_libc_CStdio_rename_Ljava_lang_StringLjava_lang_String_I_line_17:
pop eax
jmp function_pusty_f0xC_imports_libc_CStdio_rename_Ljava_lang_StringLjava_lang_String_I_line_exit
function_pusty_f0xC_imports_libc_CStdio_rename_Ljava_lang_StringLjava_lang_String_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [native_rewind_I_V] (P:1 - 1;L:0 - 0)
;Starting function [rewind_Lpusty_f0xC_imports_libc_CStdio$FILE_V] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio_rewind_Lpusty_f0xC_imports_libc_CStdio$FILE_V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio_rewind_Lpusty_f0xC_imports_libc_CStdio$FILE_V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio_rewind_Lpusty_f0xC_imports_libc_CStdio$FILE_V_line_1:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:getFD__I
add eax, 4*5
call dword [eax] ;pusty_f0xC_imports_libc_CStdio$FILE.getFD__I
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_rewind_Lpusty_f0xC_imports_libc_CStdio$FILE_V_line_4:
call dword [native_rewind]
add esp, 4*1
function_pusty_f0xC_imports_libc_CStdio_rewind_Lpusty_f0xC_imports_libc_CStdio$FILE_V_line_7:
jmp function_pusty_f0xC_imports_libc_CStdio_rewind_Lpusty_f0xC_imports_libc_CStdio$FILE_V_line_exit
function_pusty_f0xC_imports_libc_CStdio_rewind_Lpusty_f0xC_imports_libc_CStdio$FILE_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [native_tmpfile__I] (P:0 - 0;L:0 - 0)
;Starting function [tmpfile__Lpusty_f0xC_imports_libc_CStdio$FILE] (P:0 - 0;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio_tmpfile__Lpusty_f0xC_imports_libc_CStdio$FILE_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio_tmpfile__Lpusty_f0xC_imports_libc_CStdio$FILE_line_0:
mov eax, pusty_f0xC_imports_libc_CStdio$FILE_class
push eax
mov eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_pusty_f0xC_imports_libc_CStdio_tmpfile__Lpusty_f0xC_imports_libc_CStdio$FILE_line_3:
pop eax
push eax
push eax
function_pusty_f0xC_imports_libc_CStdio_tmpfile__Lpusty_f0xC_imports_libc_CStdio$FILE_line_4:
call dword [native_tmpfile]
add esp, 4*0
push eax
function_pusty_f0xC_imports_libc_CStdio_tmpfile__Lpusty_f0xC_imports_libc_CStdio$FILE_line_7:
call function_pusty_f0xC_imports_libc_CStdio$FILE_$init$_I_V_line_start
add esp, 4*2
function_pusty_f0xC_imports_libc_CStdio_tmpfile__Lpusty_f0xC_imports_libc_CStdio$FILE_line_10:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_pusty_f0xC_imports_libc_CStdio_tmpfile__Lpusty_f0xC_imports_libc_CStdio$FILE_line_exit
function_pusty_f0xC_imports_libc_CStdio_tmpfile__Lpusty_f0xC_imports_libc_CStdio$FILE_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [native_fgetc_I_I] (P:1 - 1;L:0 - 0)
;Starting function [fgetc_Lpusty_f0xC_imports_libc_CStdio$FILE_I] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio_fgetc_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio_fgetc_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio_fgetc_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_1:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:getFD__I
add eax, 4*5
call dword [eax] ;pusty_f0xC_imports_libc_CStdio$FILE.getFD__I
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_fgetc_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_4:
call dword [native_fgetc]
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_fgetc_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_7:
pop eax
jmp function_pusty_f0xC_imports_libc_CStdio_fgetc_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_exit
function_pusty_f0xC_imports_libc_CStdio_fgetc_Lpusty_f0xC_imports_libc_CStdio$FILE_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [native_fgets_III_I] (P:3 - 3;L:0 - 0)
;Starting function [fgets__BILpusty_f0xC_imports_libc_CStdio$FILE_I] (P:3 - 3;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio_fgets__BILpusty_f0xC_imports_libc_CStdio$FILE_I_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio_fgets__BILpusty_f0xC_imports_libc_CStdio$FILE_I_line_0:
mov eax, dword [ebp+4*4]
push eax
function_pusty_f0xC_imports_libc_CStdio_fgets__BILpusty_f0xC_imports_libc_CStdio$FILE_I_line_1:
call function_pusty_f0xC_imports_InternalObject_con2int_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_fgets__BILpusty_f0xC_imports_libc_CStdio$FILE_I_line_4:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_libc_CStdio_fgets__BILpusty_f0xC_imports_libc_CStdio$FILE_I_line_5:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio_fgets__BILpusty_f0xC_imports_libc_CStdio$FILE_I_line_6:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:getFD__I
add eax, 4*5
call dword [eax] ;pusty_f0xC_imports_libc_CStdio$FILE.getFD__I
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_fgets__BILpusty_f0xC_imports_libc_CStdio$FILE_I_line_9:
call dword [native_fgets]
add esp, 4*3
push eax
function_pusty_f0xC_imports_libc_CStdio_fgets__BILpusty_f0xC_imports_libc_CStdio$FILE_I_line_12:
pop eax
jmp function_pusty_f0xC_imports_libc_CStdio_fgets__BILpusty_f0xC_imports_libc_CStdio$FILE_I_line_exit
function_pusty_f0xC_imports_libc_CStdio_fgets__BILpusty_f0xC_imports_libc_CStdio$FILE_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [native_fputc_II_I] (P:2 - 2;L:0 - 0)
;Starting function [fputc_ILpusty_f0xC_imports_libc_CStdio$FILE_I] (P:2 - 2;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio_fputc_ILpusty_f0xC_imports_libc_CStdio$FILE_I_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio_fputc_ILpusty_f0xC_imports_libc_CStdio$FILE_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio_fputc_ILpusty_f0xC_imports_libc_CStdio$FILE_I_line_1:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:getFD__I
add eax, 4*5
call dword [eax] ;pusty_f0xC_imports_libc_CStdio$FILE.getFD__I
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_fputc_ILpusty_f0xC_imports_libc_CStdio$FILE_I_line_4:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_libc_CStdio_fputc_ILpusty_f0xC_imports_libc_CStdio$FILE_I_line_5:
call dword [native_fputc]
add esp, 4*2
push eax
function_pusty_f0xC_imports_libc_CStdio_fputc_ILpusty_f0xC_imports_libc_CStdio$FILE_I_line_8:
pop eax
jmp function_pusty_f0xC_imports_libc_CStdio_fputc_ILpusty_f0xC_imports_libc_CStdio$FILE_I_line_exit
function_pusty_f0xC_imports_libc_CStdio_fputc_ILpusty_f0xC_imports_libc_CStdio$FILE_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [native_fputs_II_I] (P:2 - 2;L:0 - 0)
;Starting function [fputs__BLpusty_f0xC_imports_libc_CStdio$FILE_I] (P:2 - 2;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio_fputs__BLpusty_f0xC_imports_libc_CStdio$FILE_I_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio_fputs__BLpusty_f0xC_imports_libc_CStdio$FILE_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio_fputs__BLpusty_f0xC_imports_libc_CStdio$FILE_I_line_1:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:getFD__I
add eax, 4*5
call dword [eax] ;pusty_f0xC_imports_libc_CStdio$FILE.getFD__I
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_fputs__BLpusty_f0xC_imports_libc_CStdio$FILE_I_line_4:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_libc_CStdio_fputs__BLpusty_f0xC_imports_libc_CStdio$FILE_I_line_5:
call function_pusty_f0xC_imports_InternalObject_con2int_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_fputs__BLpusty_f0xC_imports_libc_CStdio$FILE_I_line_8:
call dword [native_fputs]
add esp, 4*2
push eax
function_pusty_f0xC_imports_libc_CStdio_fputs__BLpusty_f0xC_imports_libc_CStdio$FILE_I_line_11:
pop eax
jmp function_pusty_f0xC_imports_libc_CStdio_fputs__BLpusty_f0xC_imports_libc_CStdio$FILE_I_line_exit
function_pusty_f0xC_imports_libc_CStdio_fputs__BLpusty_f0xC_imports_libc_CStdio$FILE_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [getchar__I] (P:0 - 0;L:0 - 0)
;Starting function [native_gets_I_I] (P:1 - 1;L:0 - 0)
;Starting function [gets__B_I] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio_gets__B_I_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio_gets__B_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio_gets__B_I_line_1:
call function_pusty_f0xC_imports_InternalObject_con2int_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_gets__B_I_line_4:
call dword [native_gets]
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_gets__B_I_line_7:
pop eax
jmp function_pusty_f0xC_imports_libc_CStdio_gets__B_I_line_exit
function_pusty_f0xC_imports_libc_CStdio_gets__B_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [native_putc_II_I] (P:2 - 2;L:0 - 0)
;Starting function [putc_ILpusty_f0xC_imports_libc_CStdio$FILE_I] (P:2 - 2;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio_putc_ILpusty_f0xC_imports_libc_CStdio$FILE_I_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio_putc_ILpusty_f0xC_imports_libc_CStdio$FILE_I_line_0:
mov eax, dword [ebp+4*3]
push eax
function_pusty_f0xC_imports_libc_CStdio_putc_ILpusty_f0xC_imports_libc_CStdio$FILE_I_line_1:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio_putc_ILpusty_f0xC_imports_libc_CStdio$FILE_I_line_2:
mov eax, dword [esp+4*0]
mov eax, dword [eax] ;VFC:getFD__I
add eax, 4*5
call dword [eax] ;pusty_f0xC_imports_libc_CStdio$FILE.getFD__I
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_putc_ILpusty_f0xC_imports_libc_CStdio$FILE_I_line_5:
call dword [native_putc]
add esp, 4*2
push eax
function_pusty_f0xC_imports_libc_CStdio_putc_ILpusty_f0xC_imports_libc_CStdio$FILE_I_line_8:
pop eax
jmp function_pusty_f0xC_imports_libc_CStdio_putc_ILpusty_f0xC_imports_libc_CStdio$FILE_I_line_exit
function_pusty_f0xC_imports_libc_CStdio_putc_ILpusty_f0xC_imports_libc_CStdio$FILE_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [putchar_I_I] (P:1 - 1;L:0 - 0)
;Starting function [native_puts_I_I] (P:1 - 1;L:0 - 0)
;Starting function [puts_Ljava_lang_String_I] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio_puts_Ljava_lang_String_I_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio_puts_Ljava_lang_String_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio_puts_Ljava_lang_String_I_line_1:
call function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_pusty_f0xC_imports_libc_CStdio_puts_Ljava_lang_String_I_line_4:
call function_pusty_f0xC_imports_InternalObject_con2int_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_puts_Ljava_lang_String_I_line_7:
call dword [native_puts]
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_puts_Ljava_lang_String_I_line_10:
pop eax
jmp function_pusty_f0xC_imports_libc_CStdio_puts_Ljava_lang_String_I_line_exit
function_pusty_f0xC_imports_libc_CStdio_puts_Ljava_lang_String_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [native_perror_I_V] (P:1 - 1;L:0 - 0)
;Starting function [perror_Ljava_lang_String_V] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio_perror_Ljava_lang_String_V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio_perror_Ljava_lang_String_V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_imports_libc_CStdio_perror_Ljava_lang_String_V_line_1:
call function_pusty_f0xC_imports_LibC_JString2CString_Ljava_lang_String__B_line_start
add esp, 4*1
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_pusty_f0xC_imports_libc_CStdio_perror_Ljava_lang_String_V_line_4:
call function_pusty_f0xC_imports_InternalObject_con2int_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_pusty_f0xC_imports_libc_CStdio_perror_Ljava_lang_String_V_line_7:
call dword [native_perror]
add esp, 4*1
function_pusty_f0xC_imports_libc_CStdio_perror_Ljava_lang_String_V_line_10:
jmp function_pusty_f0xC_imports_libc_CStdio_perror_Ljava_lang_String_V_line_exit
function_pusty_f0xC_imports_libc_CStdio_perror_Ljava_lang_String_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$destroy$] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio_$destroy$_line_start:
push ebp
mov ebp, esp
mov ebx, [ebp+4*2]
function_pusty_f0xC_imports_libc_CStdio_$destroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [$cldestroy$] (P:0 - 0;L:0 - 0)
function_pusty_f0xC_imports_libc_CStdio_$cldestroy$_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_imports_libc_CStdio_$cldestroy$_line_0:
function_pusty_f0xC_imports_libc_CStdio_$cldestroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;=================================================
;Starting function [$init$_D_V] (P:2 - 3;L:0 - 0)
function_java_lang_Double_$init$_D_V_line_start:
push ebp
mov ebp, esp
function_java_lang_Double_$init$_D_V_line_0:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_Double_$init$_D_V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_java_lang_Double_$init$_D_V_line_4:
jmp function_java_lang_Double_$init$_D_V_line_exit
function_java_lang_Double_$init$_D_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [valueOf_D_Ljava_lang_Double] (P:1 - 2;L:0 - 0)
function_java_lang_Double_valueOf_D_Ljava_lang_Double_line_start:
push ebp
mov ebp, esp
function_java_lang_Double_valueOf_D_Ljava_lang_Double_line_0:
mov eax, java_lang_Double_class
push eax
mov eax, 8
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_Double_valueOf_D_Ljava_lang_Double_line_3:
pop eax
push eax
push eax
function_java_lang_Double_valueOf_D_Ljava_lang_Double_line_4:
mov eax, dword [ebp+4*3]
mov edx, dword [ebp+4*2]
push eax
push edx
function_java_lang_Double_valueOf_D_Ljava_lang_Double_line_5:
call function_java_lang_Double_$init$_D_V_line_start
add esp, 4*3
function_java_lang_Double_valueOf_D_Ljava_lang_Double_line_8:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_Double_valueOf_D_Ljava_lang_Double_line_exit
function_java_lang_Double_valueOf_D_Ljava_lang_Double_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [toString__Ljava_lang_String] (P:1 - 1;L:0 - 0)
function_java_lang_Double_toString__Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_Double_toString__Ljava_lang_String_line_0:
mov eax, dword [stringmap_85c2f798]
push eax
function_java_lang_Double_toString__Ljava_lang_String_line_2:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_Double_toString__Ljava_lang_String_line_exit
function_java_lang_Double_toString__Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [toString_D_Ljava_lang_String] (P:1 - 2;L:0 - 0)
function_java_lang_Double_toString_D_Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_Double_toString_D_Ljava_lang_String_line_0:
mov eax, dword [stringmap_85c2f798]
push eax
function_java_lang_Double_toString_D_Ljava_lang_String_line_2:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_Double_toString_D_Ljava_lang_String_line_exit
function_java_lang_Double_toString_D_Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$destroy$] (P:1 - 1;L:0 - 0)
function_java_lang_Double_$destroy$_line_start:
push ebp
mov ebp, esp
mov ebx, [ebp+4*2]
function_java_lang_Double_$destroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [$cldestroy$] (P:0 - 0;L:0 - 0)
function_java_lang_Double_$cldestroy$_line_start:
push ebp
mov ebp, esp
function_java_lang_Double_$cldestroy$_line_0:
function_java_lang_Double_$cldestroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;=================================================
;Starting function [$init$__V] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_rt_windows_Kernel32_$init$__V_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_rt_windows_Kernel32_$init$__V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_pusty_f0xC_rt_windows_Kernel32_$init$__V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_pusty_f0xC_rt_windows_Kernel32_$init$__V_line_4:
jmp function_pusty_f0xC_rt_windows_Kernel32_$init$__V_line_exit
function_pusty_f0xC_rt_windows_Kernel32_$init$__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [Sleep_I_V] (P:1 - 1;L:0 - 0)
;Starting function [$destroy$] (P:1 - 1;L:0 - 0)
function_pusty_f0xC_rt_windows_Kernel32_$destroy$_line_start:
push ebp
mov ebp, esp
mov ebx, [ebp+4*2]
function_pusty_f0xC_rt_windows_Kernel32_$destroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [$cldestroy$] (P:0 - 0;L:0 - 0)
function_pusty_f0xC_rt_windows_Kernel32_$cldestroy$_line_start:
push ebp
mov ebp, esp
function_pusty_f0xC_rt_windows_Kernel32_$cldestroy$_line_0:
function_pusty_f0xC_rt_windows_Kernel32_$cldestroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;=================================================
;Starting function [$clinit$__V] (P:0 - 0;L:0 - 0)
function_java_lang_System_$clinit$__V_line_start:
push ebp
mov ebp, esp
function_java_lang_System_$clinit$__V_line_0:
mov eax, pusty_f0xC_rt_io_NativeOutputStream_class
push eax
mov eax, 8
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_System_$clinit$__V_line_3:
pop eax
push eax
push eax
function_java_lang_System_$clinit$__V_line_4:
call function_pusty_f0xC_rt_io_NativeOutputStream_$init$__V_line_start
add esp, 4*1
function_java_lang_System_$clinit$__V_line_7:
mov eax, dword [java_lang_System_stdout]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [java_lang_System_stdout], eax
function_java_lang_System_$clinit$__V_line_10:
mov eax, java_io_PrintStream_class
push eax
mov eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_System_$clinit$__V_line_13:
pop eax
push eax
push eax
function_java_lang_System_$clinit$__V_line_14:
mov eax, dword [java_lang_System_stdout]
push eax
function_java_lang_System_$clinit$__V_line_17:
call function_java_io_PrintStream_$init$_Ljava_io_OutputStream_V_line_start
add esp, 4*2
function_java_lang_System_$clinit$__V_line_20:
mov eax, dword [java_lang_System_err]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [java_lang_System_err], eax
function_java_lang_System_$clinit$__V_line_23:
mov eax, java_io_PrintStream_class
push eax
mov eax, 12
push eax
call function_pusty_f0xC_imports_Internal_allocate_memory_II_Ljava_lang_Object_line_start
add esp, 4*2
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
push eax
mov ebx, dword [ebp]
push ebx
call function_pusty_f0xC_imports_Internal_garbage_register_Ljava_lang_ObjectI_V_line_start
pop ebx
pop eax
push eax
function_java_lang_System_$clinit$__V_line_26:
pop eax
push eax
push eax
function_java_lang_System_$clinit$__V_line_27:
mov eax, dword [java_lang_System_stdout]
push eax
function_java_lang_System_$clinit$__V_line_30:
call function_java_io_PrintStream_$init$_Ljava_io_OutputStream_V_line_start
add esp, 4*2
function_java_lang_System_$clinit$__V_line_33:
mov eax, dword [java_lang_System_out]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [java_lang_System_out], eax
function_java_lang_System_$clinit$__V_line_36:
mov eax, dword [stringmap_a]
push eax
function_java_lang_System_$clinit$__V_line_38:
mov eax, dword [java_lang_System_lineSeparator]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
mov dword [java_lang_System_lineSeparator], eax
function_java_lang_System_$clinit$__V_line_41:
jmp function_java_lang_System_$clinit$__V_line_exit
function_java_lang_System_$clinit$__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$init$__V] (P:1 - 1;L:0 - 0)
function_java_lang_System_$init$__V_line_start:
push ebp
mov ebp, esp
function_java_lang_System_$init$__V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_System_$init$__V_line_1:
call function_java_lang_Object_$init$__V_line_start
add esp, 4*1
function_java_lang_System_$init$__V_line_4:
jmp function_java_lang_System_$init$__V_line_exit
function_java_lang_System_$init$__V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [currentTimeMillis__J] (P:0 - 0;L:0 - 0)
function_java_lang_System_currentTimeMillis__J_line_start:
push ebp
mov ebp, esp
function_java_lang_System_currentTimeMillis__J_line_0:
mov eax, 0
mov edx, 0
push eax
push edx
function_java_lang_System_currentTimeMillis__J_line_1:
pop edx
pop eax
jmp function_java_lang_System_currentTimeMillis__J_line_exit
function_java_lang_System_currentTimeMillis__J_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [nanoTime__J] (P:0 - 0;L:0 - 0)
function_java_lang_System_nanoTime__J_line_start:
push ebp
mov ebp, esp
function_java_lang_System_nanoTime__J_line_0:
mov eax, 0
mov edx, 0
push eax
push edx
function_java_lang_System_nanoTime__J_line_1:
pop edx
pop eax
jmp function_java_lang_System_nanoTime__J_line_exit
function_java_lang_System_nanoTime__J_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V] (P:5 - 5;L:1 - 1)
function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_start:
push ebp
mov ebp, esp
sub esp, 4*1
mov dword [esp+4*0], 0
function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_0:
mov eax, 0
push eax
function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_1:
pop eax
mov dword [ebp-4*1], eax
function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_3:
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jmp function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_27
function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_6:
mov eax, dword [ebp+4*4]
push eax
function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_7:
function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_10:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_12:
mov eax, dword [ebp+4*3]
push eax
function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_13:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_14:
mov eax, dword [ebp+4*6]
push eax
function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_15:
function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_18:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_20:
mov eax, dword [ebp+4*5]
push eax
function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_21:
pop ebx
pop eax
add eax, ebx
push eax
function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_22:
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov eax, [ebx]
movsx eax, al
push eax
function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_23:
pop eax
and eax, 0xFF
pop ecx
pop ebx
imul ecx, ecx, 1
add ebx, ecx
add ebx, 12
mov [ebx], al
function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_24:
mov eax, dword [ebp-4*1]
push eax
mov eax, 1
push eax
pop ebx
pop eax
add eax, ebx
mov dword [ebp-4*1], eax
function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_27:
mov eax, dword [ebp-4*1]
push eax
function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_29:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_31:
pop ebx
pop eax
cmp eax, ebx
call function_pusty_f0xC_imports_Internal_garbage_collect_wrapper_I_V_line_start
jl  function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_6
function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_34:
jmp function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_exit
function_java_lang_System_arraycopy_Ljava_lang_ObjectILjava_lang_ObjectII_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [identityHashCode_Ljava_lang_Object_I] (P:1 - 1;L:0 - 0)
function_java_lang_System_identityHashCode_Ljava_lang_Object_I_line_start:
push ebp
mov ebp, esp
function_java_lang_System_identityHashCode_Ljava_lang_Object_I_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_System_identityHashCode_Ljava_lang_Object_I_line_1:
call function_pusty_f0xC_imports_InternalObject_obj2int_Ljava_lang_Object_I_line_start
add esp, 4*1
push eax
function_java_lang_System_identityHashCode_Ljava_lang_Object_I_line_4:
pop eax
jmp function_java_lang_System_identityHashCode_Ljava_lang_Object_I_line_exit
function_java_lang_System_identityHashCode_Ljava_lang_Object_I_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [lineSeparator__Ljava_lang_String] (P:0 - 0;L:0 - 0)
function_java_lang_System_lineSeparator__Ljava_lang_String_line_start:
push ebp
mov ebp, esp
function_java_lang_System_lineSeparator__Ljava_lang_String_line_0:
mov eax, dword [java_lang_System_lineSeparator]
push eax
function_java_lang_System_lineSeparator__Ljava_lang_String_line_3:
pop eax
push eax
call function_pusty_f0xC_imports_Internal_inc_memory_Ljava_lang_Object_V_line_start
pop eax
jmp function_java_lang_System_lineSeparator__Ljava_lang_String_line_exit
function_java_lang_System_lineSeparator__Ljava_lang_String_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [exit_I_V] (P:1 - 1;L:0 - 0)
function_java_lang_System_exit_I_V_line_start:
push ebp
mov ebp, esp
function_java_lang_System_exit_I_V_line_0:
mov eax, dword [ebp+4*2]
push eax
function_java_lang_System_exit_I_V_line_1:
call function_pusty_f0xC_imports_LibC_exit_I_V_line_start
add esp, 4*1
function_java_lang_System_exit_I_V_line_4:
jmp function_java_lang_System_exit_I_V_line_exit
function_java_lang_System_exit_I_V_line_exit:
push eax
pop eax
mov esp, ebp
pop ebp
push eax
push edx
push ebp
call function_pusty_f0xC_imports_Internal_garbage_collect_I_V_line_start
pop ebp
pop edx
pop eax
ret

;Starting function [$destroy$] (P:1 - 1;L:0 - 0)
function_java_lang_System_$destroy$_line_start:
push ebp
mov ebp, esp
mov ebx, [ebp+4*2]
function_java_lang_System_$destroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;Starting function [$cldestroy$] (P:0 - 0;L:0 - 0)
function_java_lang_System_$cldestroy$_line_start:
push ebp
mov ebp, esp
function_java_lang_System_$cldestroy$_line_0:
mov eax, [java_lang_System_stdout]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
mov eax, [java_lang_System_err]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
mov eax, [java_lang_System_lineSeparator]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
mov eax, [java_lang_System_out]
push eax
call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
pop eax
function_java_lang_System_$cldestroy$_line_exit:
mov esp, ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret

;=================================================

function_java_lang_Object_$init$__V_line_start:
ret

function_aarray_$destroy$_line_start:
  mov ebx, [esp+4]
  mov ecx, [ebx+8]
  lea eax, [ebx+12]
  function_aarray_$destroy$_next:
    push ecx
    push eax
    push dword [eax]
    call function_pusty_f0xC_imports_Internal_free_memory_Ljava_lang_Object_V_line_start
    add esp, 4
    pop eax
    pop ecx
    dec ecx
    add eax, 4
    test ecx, ecx
  jne function_aarray_$destroy$_next
  ret

function_array_$destroy$_line_start:
  ret
;FASM DATA SECTION
section '.data' data readable writeable
db 0

debugFixedStrings:
debug_allocStr    db 'Overall: [F:% 2d M: % 2d]',10,0
debug_allocMemStr db 'Allocated Memory: [%d/%d]',10,0
debug_allocHeader db '========= DIAGNOSTICS =========',10,0
debug_allocFooter db '===============================',10,0
debug_freeMsg     db '[#] Freeing  "%s" [%04X]',10,0
debug_allocMsg    db '[#] Allocing "%s" [%04X]',10,0
debug_gbRegMsg    db '[#] Register "%s" [%04X]',10,0
debug_gbMsg       db '[#] Collect  "%s" [%04X]',10,0
debug_gbFullMsg   db '[#] Garbage Collector Full!',10,0
debug_int db         'Int Value: %d',10,0

;Class Data
java_lang_Integer_class: dd function_java_lang_Integer_$destroy$_line_start
dd empty
dd function_java_lang_Integer_toString__Ljava_lang_String_line_start ;VFT:toString__Ljava_lang_String
dd function_java_lang_Integer_hashCode__I_line_start ;VFT:hashCode__I
dd function_java_lang_Object_equals_Ljava_lang_Object_Z_line_start ;VFT:equals_Ljava_lang_Object_Z
dd function_java_lang_Integer_byteValue__B_line_start ;VFT:byteValue__B
dd function_java_lang_Integer_shortValue__S_line_start ;VFT:shortValue__S
dd function_java_lang_Integer_intValue__I_line_start ;VFT:intValue__I
dd function_java_lang_Integer_longValue__J_line_start ;VFT:longValue__J
dd function_java_lang_Integer_floatValue__F_line_start ;VFT:floatValue__F
dd function_java_lang_Integer_doubleValue__D_line_start ;VFT:doubleValue__D
dd function_java_lang_Integer_compareTo_Ljava_lang_Integer_I_line_start ;VFT:compareTo_Ljava_lang_Integer_I
java_lang_StringBuilder_class: dd function_java_lang_StringBuilder_$destroy$_line_start
dd empty
dd function_java_lang_StringBuilder_toString__Ljava_lang_String_line_start ;VFT:toString__Ljava_lang_String
dd function_java_lang_StringBuilder_hashCode__I_line_start ;VFT:hashCode__I
dd function_java_lang_Object_equals_Ljava_lang_Object_Z_line_start ;VFT:equals_Ljava_lang_Object_Z
dd function_java_lang_StringBuilder_enlargeBuffer_I_V_line_start ;VFT:enlargeBuffer_I_V
dd function_java_lang_StringBuilder_appendNull__V_line_start ;VFT:appendNull__V
dd function_java_lang_StringBuilder_append0__C_V_line_start ;VFT:append0__C_V
dd function_java_lang_StringBuilder_append0__CII_V_line_start ;VFT:append0__CII_V
dd function_java_lang_StringBuilder_append0_C_V_line_start ;VFT:append0_C_V
dd function_java_lang_StringBuilder_append0_Ljava_lang_String_V_line_start ;VFT:append0_Ljava_lang_String_V
dd function_java_lang_StringBuilder_delete0_II_V_line_start ;VFT:delete0_II_V
dd function_java_lang_StringBuilder_deleteCharAt0_I_V_line_start ;VFT:deleteCharAt0_I_V
dd function_java_lang_StringBuilder_ensureCapacity_I_V_line_start ;VFT:ensureCapacity_I_V
dd function_java_lang_StringBuilder_getChars_II_CI_V_line_start ;VFT:getChars_II_CI_V
dd function_java_lang_StringBuilder_insert0_I_C_V_line_start ;VFT:insert0_I_C_V
dd function_java_lang_StringBuilder_insert0_I_CII_V_line_start ;VFT:insert0_I_CII_V
dd function_java_lang_StringBuilder_insert0_IC_V_line_start ;VFT:insert0_IC_V
dd function_java_lang_StringBuilder_insert0_ILjava_lang_String_V_line_start ;VFT:insert0_ILjava_lang_String_V
dd function_java_lang_StringBuilder_move_II_V_line_start ;VFT:move_II_V
dd function_java_lang_StringBuilder_replace0_IILjava_lang_String_V_line_start ;VFT:replace0_IILjava_lang_String_V
dd function_java_lang_StringBuilder_reverse0__V_line_start ;VFT:reverse0__V
dd function_java_lang_StringBuilder_length__I_line_start ;VFT:length__I
dd function_java_lang_StringBuilder_capacity__I_line_start ;VFT:capacity__I
dd function_java_lang_StringBuilder_getValue___C_line_start ;VFT:getValue___C
dd function_java_lang_StringBuilder_charAt_I_C_line_start ;VFT:charAt_I_C
dd function_java_lang_StringBuilder_setCharAt_IC_V_line_start ;VFT:setCharAt_IC_V
dd function_java_lang_StringBuilder_setLength_I_V_line_start ;VFT:setLength_I_V
dd function_java_lang_StringBuilder_substring_I_Ljava_lang_String_line_start ;VFT:substring_I_Ljava_lang_String
dd function_java_lang_StringBuilder_substring_II_Ljava_lang_String_line_start ;VFT:substring_II_Ljava_lang_String
dd function_java_lang_StringBuilder_indexOf_Ljava_lang_String_I_line_start ;VFT:indexOf_Ljava_lang_String_I
dd function_java_lang_StringBuilder_indexOf_Ljava_lang_StringI_I_line_start ;VFT:indexOf_Ljava_lang_StringI_I
dd function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_String_I_line_start ;VFT:lastIndexOf_Ljava_lang_String_I
dd function_java_lang_StringBuilder_lastIndexOf_Ljava_lang_StringI_I_line_start ;VFT:lastIndexOf_Ljava_lang_StringI_I
dd function_java_lang_StringBuilder_trimToSize__V_line_start ;VFT:trimToSize__V
dd function_java_lang_StringBuilder_append_Z_Ljava_lang_StringBuilder_line_start ;VFT:append_Z_Ljava_lang_StringBuilder
dd function_java_lang_StringBuilder_append_C_Ljava_lang_StringBuilder_line_start ;VFT:append_C_Ljava_lang_StringBuilder
dd function_java_lang_StringBuilder_append_I_Ljava_lang_StringBuilder_line_start ;VFT:append_I_Ljava_lang_StringBuilder
dd function_java_lang_StringBuilder_append_F_Ljava_lang_StringBuilder_line_start ;VFT:append_F_Ljava_lang_StringBuilder
dd function_java_lang_StringBuilder_append_D_Ljava_lang_StringBuilder_line_start ;VFT:append_D_Ljava_lang_StringBuilder
dd function_java_lang_StringBuilder_append_Ljava_lang_Object_Ljava_lang_StringBuilder_line_start ;VFT:append_Ljava_lang_Object_Ljava_lang_StringBuilder
dd function_java_lang_StringBuilder_append_Ljava_lang_String_Ljava_lang_StringBuilder_line_start ;VFT:append_Ljava_lang_String_Ljava_lang_StringBuilder
dd function_java_lang_StringBuilder_append__C_Ljava_lang_StringBuilder_line_start ;VFT:append__C_Ljava_lang_StringBuilder
dd function_java_lang_StringBuilder_append__CII_Ljava_lang_StringBuilder_line_start ;VFT:append__CII_Ljava_lang_StringBuilder
dd function_java_lang_StringBuilder_append_Ljava_lang_StringBuilder_Ljava_lang_StringBuilder_line_start ;VFT:append_Ljava_lang_StringBuilder_Ljava_lang_StringBuilder
dd function_java_lang_StringBuilder_append_Ljava_lang_StringBuilderII_Ljava_lang_StringBuilder_line_start ;VFT:append_Ljava_lang_StringBuilderII_Ljava_lang_StringBuilder
dd function_java_lang_StringBuilder_delete_II_Ljava_lang_StringBuilder_line_start ;VFT:delete_II_Ljava_lang_StringBuilder
dd function_java_lang_StringBuilder_deleteCharAt_I_Ljava_lang_StringBuilder_line_start ;VFT:deleteCharAt_I_Ljava_lang_StringBuilder
dd function_java_lang_StringBuilder_insert_IZ_Ljava_lang_StringBuilder_line_start ;VFT:insert_IZ_Ljava_lang_StringBuilder
dd function_java_lang_StringBuilder_insert_IC_Ljava_lang_StringBuilder_line_start ;VFT:insert_IC_Ljava_lang_StringBuilder
dd function_java_lang_StringBuilder_insert_II_Ljava_lang_StringBuilder_line_start ;VFT:insert_II_Ljava_lang_StringBuilder
dd function_java_lang_StringBuilder_insert_IJ_Ljava_lang_StringBuilder_line_start ;VFT:insert_IJ_Ljava_lang_StringBuilder
dd function_java_lang_StringBuilder_insert_IF_Ljava_lang_StringBuilder_line_start ;VFT:insert_IF_Ljava_lang_StringBuilder
dd function_java_lang_StringBuilder_insert_ID_Ljava_lang_StringBuilder_line_start ;VFT:insert_ID_Ljava_lang_StringBuilder
dd function_java_lang_StringBuilder_insert_ILjava_lang_Object_Ljava_lang_StringBuilder_line_start ;VFT:insert_ILjava_lang_Object_Ljava_lang_StringBuilder
dd function_java_lang_StringBuilder_insert_ILjava_lang_String_Ljava_lang_StringBuilder_line_start ;VFT:insert_ILjava_lang_String_Ljava_lang_StringBuilder
dd function_java_lang_StringBuilder_insert_I_C_Ljava_lang_StringBuilder_line_start ;VFT:insert_I_C_Ljava_lang_StringBuilder
dd function_java_lang_StringBuilder_insert_I_CII_Ljava_lang_StringBuilder_line_start ;VFT:insert_I_CII_Ljava_lang_StringBuilder
dd function_java_lang_StringBuilder_replace_IILjava_lang_String_Ljava_lang_StringBuilder_line_start ;VFT:replace_IILjava_lang_String_Ljava_lang_StringBuilder
dd function_java_lang_StringBuilder_reverse__Ljava_lang_StringBuilder_line_start ;VFT:reverse__Ljava_lang_StringBuilder
pusty_f0xC_rt_windows_WindowsImportUtil_class: dd function_pusty_f0xC_rt_windows_WindowsImportUtil_$destroy$_line_start
dd empty
dd function_java_lang_Object_toString__Ljava_lang_String_line_start ;VFT:toString__Ljava_lang_String
dd function_java_lang_Object_hashCode__I_line_start ;VFT:hashCode__I
dd function_java_lang_Object_equals_Ljava_lang_Object_Z_line_start ;VFT:equals_Ljava_lang_Object_Z
pusty_f0xC_imports_libc_CStdio$FILE_class: dd function_pusty_f0xC_imports_libc_CStdio$FILE_$destroy$_line_start
dd empty
dd function_java_lang_Object_toString__Ljava_lang_String_line_start ;VFT:toString__Ljava_lang_String
dd function_java_lang_Object_hashCode__I_line_start ;VFT:hashCode__I
dd function_java_lang_Object_equals_Ljava_lang_Object_Z_line_start ;VFT:equals_Ljava_lang_Object_Z
dd function_pusty_f0xC_imports_libc_CStdio$FILE_getFD__I_line_start ;VFT:getFD__I
dd function_pusty_f0xC_imports_libc_CStdio$FILE_setFD_I_V_line_start ;VFT:setFD_I_V
java_lang_Float_class: dd function_java_lang_Float_$destroy$_line_start
dd empty
dd function_java_lang_Float_toString__Ljava_lang_String_line_start ;VFT:toString__Ljava_lang_String
dd function_java_lang_Object_hashCode__I_line_start ;VFT:hashCode__I
dd function_java_lang_Object_equals_Ljava_lang_Object_Z_line_start ;VFT:equals_Ljava_lang_Object_Z
java_lang_Long_class: dd function_java_lang_Long_$destroy$_line_start
dd empty
dd function_java_lang_Object_toString__Ljava_lang_String_line_start ;VFT:toString__Ljava_lang_String
dd function_java_lang_Object_hashCode__I_line_start ;VFT:hashCode__I
dd function_java_lang_Object_equals_Ljava_lang_Object_Z_line_start ;VFT:equals_Ljava_lang_Object_Z
pusty_f0xC_imports_InternalObject_class: dd function_pusty_f0xC_imports_InternalObject_$destroy$_line_start
dd empty
dd function_java_lang_Object_toString__Ljava_lang_String_line_start ;VFT:toString__Ljava_lang_String
dd function_java_lang_Object_hashCode__I_line_start ;VFT:hashCode__I
dd function_java_lang_Object_equals_Ljava_lang_Object_Z_line_start ;VFT:equals_Ljava_lang_Object_Z
pusty_f0xC_imports_GarbageCollector_class: dd function_pusty_f0xC_imports_GarbageCollector_$destroy$_line_start
dd empty
dd function_java_lang_Object_toString__Ljava_lang_String_line_start ;VFT:toString__Ljava_lang_String
dd function_java_lang_Object_hashCode__I_line_start ;VFT:hashCode__I
dd function_java_lang_Object_equals_Ljava_lang_Object_Z_line_start ;VFT:equals_Ljava_lang_Object_Z
dd function_pusty_f0xC_imports_GarbageCollector_add_Ljava_lang_ObjectI_Z_line_start ;VFT:add_Ljava_lang_ObjectI_Z
dd function_pusty_f0xC_imports_GarbageCollector_collect_I_V_line_start ;VFT:collect_I_V
java_io_OutputStream_class: dd function_java_io_OutputStream_$destroy$_line_start
dd empty
dd function_java_lang_Object_toString__Ljava_lang_String_line_start ;VFT:toString__Ljava_lang_String
dd function_java_lang_Object_hashCode__I_line_start ;VFT:hashCode__I
dd function_java_lang_Object_equals_Ljava_lang_Object_Z_line_start ;VFT:equals_Ljava_lang_Object_Z
dd function_java_io_OutputStream_write_I_V_line_start ;VFT:write_I_V
dd function_java_io_OutputStream_write__B_V_line_start ;VFT:write__B_V
dd function_java_io_OutputStream_write__BII_V_line_start ;VFT:write__BII_V
dd function_java_io_OutputStream_flush__V_line_start ;VFT:flush__V
dd function_java_io_OutputStream_close__V_line_start ;VFT:close__V
java_io_PrintStream_class: dd function_java_io_PrintStream_$destroy$_line_start
dd empty
dd function_java_lang_Object_toString__Ljava_lang_String_line_start ;VFT:toString__Ljava_lang_String
dd function_java_lang_Object_hashCode__I_line_start ;VFT:hashCode__I
dd function_java_lang_Object_equals_Ljava_lang_Object_Z_line_start ;VFT:equals_Ljava_lang_Object_Z
dd function_java_io_PrintStream_flush__V_line_start ;VFT:flush__V
dd function_java_io_PrintStream_write_I_V_line_start ;VFT:write_I_V
dd function_java_io_PrintStream_write__BII_V_line_start ;VFT:write__BII_V
dd function_java_io_PrintStream_write__C_V_line_start ;VFT:write__C_V
dd function_java_io_PrintStream_write_Ljava_lang_String_V_line_start ;VFT:write_Ljava_lang_String_V
dd function_java_io_PrintStream_newLine__V_line_start ;VFT:newLine__V
dd function_java_io_PrintStream_print_Z_V_line_start ;VFT:print_Z_V
dd function_java_io_PrintStream_print_C_V_line_start ;VFT:print_C_V
dd function_java_io_PrintStream_print_I_V_line_start ;VFT:print_I_V
dd function_java_io_PrintStream_print_J_V_line_start ;VFT:print_J_V
dd function_java_io_PrintStream_print_F_V_line_start ;VFT:print_F_V
dd function_java_io_PrintStream_print_D_V_line_start ;VFT:print_D_V
dd function_java_io_PrintStream_print__C_V_line_start ;VFT:print__C_V
dd function_java_io_PrintStream_print_Ljava_lang_String_V_line_start ;VFT:print_Ljava_lang_String_V
dd function_java_io_PrintStream_print_Ljava_lang_Object_V_line_start ;VFT:print_Ljava_lang_Object_V
dd function_java_io_PrintStream_println__V_line_start ;VFT:println__V
dd function_java_io_PrintStream_println_Z_V_line_start ;VFT:println_Z_V
dd function_java_io_PrintStream_println_C_V_line_start ;VFT:println_C_V
dd function_java_io_PrintStream_println_I_V_line_start ;VFT:println_I_V
dd function_java_io_PrintStream_println_J_V_line_start ;VFT:println_J_V
dd function_java_io_PrintStream_println_F_V_line_start ;VFT:println_F_V
dd function_java_io_PrintStream_println_D_V_line_start ;VFT:println_D_V
dd function_java_io_PrintStream_println__C_V_line_start ;VFT:println__C_V
dd function_java_io_PrintStream_println_Ljava_lang_String_V_line_start ;VFT:println_Ljava_lang_String_V
dd function_java_io_PrintStream_println_Ljava_lang_Object_V_line_start ;VFT:println_Ljava_lang_Object_V
pusty_f0xC_imports_Internal_class: dd function_pusty_f0xC_imports_Internal_$destroy$_line_start
dd empty
dd function_java_lang_Object_toString__Ljava_lang_String_line_start ;VFT:toString__Ljava_lang_String
dd function_java_lang_Object_hashCode__I_line_start ;VFT:hashCode__I
dd function_java_lang_Object_equals_Ljava_lang_Object_Z_line_start ;VFT:equals_Ljava_lang_Object_Z
example_windows_Example_class: dd function_example_windows_Example_$destroy$_line_start
dd empty
dd function_java_lang_Object_toString__Ljava_lang_String_line_start ;VFT:toString__Ljava_lang_String
dd function_java_lang_Object_hashCode__I_line_start ;VFT:hashCode__I
dd function_java_lang_Object_equals_Ljava_lang_Object_Z_line_start ;VFT:equals_Ljava_lang_Object_Z
java_lang_Object_class: dd function_java_lang_Object_$destroy$_line_start
dd empty
dd function_java_lang_Object_toString__Ljava_lang_String_line_start ;VFT:toString__Ljava_lang_String
dd function_java_lang_Object_hashCode__I_line_start ;VFT:hashCode__I
dd function_java_lang_Object_equals_Ljava_lang_Object_Z_line_start ;VFT:equals_Ljava_lang_Object_Z
pusty_f0xC_rt_io_NativeOutputStream_class: dd function_pusty_f0xC_rt_io_NativeOutputStream_$destroy$_line_start
dd empty
dd function_java_lang_Object_toString__Ljava_lang_String_line_start ;VFT:toString__Ljava_lang_String
dd function_java_lang_Object_hashCode__I_line_start ;VFT:hashCode__I
dd function_java_lang_Object_equals_Ljava_lang_Object_Z_line_start ;VFT:equals_Ljava_lang_Object_Z
dd function_pusty_f0xC_rt_io_NativeOutputStream_write_I_V_line_start ;VFT:write_I_V
dd function_java_io_OutputStream_write__B_V_line_start ;VFT:write__B_V
dd function_java_io_OutputStream_write__BII_V_line_start ;VFT:write__BII_V
dd function_java_io_OutputStream_flush__V_line_start ;VFT:flush__V
dd function_java_io_OutputStream_close__V_line_start ;VFT:close__V
java_lang_String_class: dd function_java_lang_String_$destroy$_line_start
dd empty
dd function_java_lang_String_toString__Ljava_lang_String_line_start ;VFT:toString__Ljava_lang_String
dd function_java_lang_String_hashCode__I_line_start ;VFT:hashCode__I
dd function_java_lang_Object_equals_Ljava_lang_Object_Z_line_start ;VFT:equals_Ljava_lang_Object_Z
dd function_java_lang_String_length__I_line_start ;VFT:length__I
dd function_java_lang_String_isEmpty__Z_line_start ;VFT:isEmpty__Z
dd function_java_lang_String_charAt_I_C_line_start ;VFT:charAt_I_C
dd function_java_lang_String_getBytes___B_line_start ;VFT:getBytes___B
dd function_java_lang_String_indexOf_I_I_line_start ;VFT:indexOf_I_I
dd function_java_lang_String_indexOf_II_I_line_start ;VFT:indexOf_II_I
dd function_java_lang_String_substring_I_Ljava_lang_String_line_start ;VFT:substring_I_Ljava_lang_String
dd function_java_lang_String_substring_II_Ljava_lang_String_line_start ;VFT:substring_II_Ljava_lang_String
dd function_java_lang_String_getChars__CI_V_line_start ;VFT:getChars__CI_V
dd function_java_lang_String_getChars_II_CI_V_line_start ;VFT:getChars_II_CI_V
dd function_java_lang_String_regionMatches_ILjava_lang_StringII_Z_line_start ;VFT:regionMatches_ILjava_lang_StringII_Z
dd function_java_lang_String_startsWith_Ljava_lang_StringI_Z_line_start ;VFT:startsWith_Ljava_lang_StringI_Z
dd function_java_lang_String_startsWith_Ljava_lang_String_Z_line_start ;VFT:startsWith_Ljava_lang_String_Z
dd function_java_lang_String_endsWith_Ljava_lang_String_Z_line_start ;VFT:endsWith_Ljava_lang_String_Z
dd function_java_lang_String_indexOf_Ljava_lang_String_I_line_start ;VFT:indexOf_Ljava_lang_String_I
dd function_java_lang_String_indexOf_Ljava_lang_StringI_I_line_start ;VFT:indexOf_Ljava_lang_StringI_I
dd function_java_lang_String_lastIndexOf_Ljava_lang_String_I_line_start ;VFT:lastIndexOf_Ljava_lang_String_I
dd function_java_lang_String_lastIndexOf_Ljava_lang_StringI_I_line_start ;VFT:lastIndexOf_Ljava_lang_StringI_I
dd function_java_lang_String_concat_Ljava_lang_String_Ljava_lang_String_line_start ;VFT:concat_Ljava_lang_String_Ljava_lang_String
dd function_java_lang_String_replace_CC_Ljava_lang_String_line_start ;VFT:replace_CC_Ljava_lang_String
dd function_java_lang_String_contains_Ljava_lang_String_Z_line_start ;VFT:contains_Ljava_lang_String_Z
dd function_java_lang_String_trim__Ljava_lang_String_line_start ;VFT:trim__Ljava_lang_String
dd function_java_lang_String_toCharArray___C_line_start ;VFT:toCharArray___C
java_lang_Character_class: dd function_java_lang_Character_$destroy$_line_start
dd empty
dd function_java_lang_Character_toString__Ljava_lang_String_line_start ;VFT:toString__Ljava_lang_String
dd function_java_lang_Character_hashCode__I_line_start ;VFT:hashCode__I
dd function_java_lang_Object_equals_Ljava_lang_Object_Z_line_start ;VFT:equals_Ljava_lang_Object_Z
dd function_java_lang_Character_charValue__C_line_start ;VFT:charValue__C
dd function_java_lang_Character_compareTo_Ljava_lang_Character_I_line_start ;VFT:compareTo_Ljava_lang_Character_I
pusty_f0xC_imports_LibC_class: dd function_pusty_f0xC_imports_LibC_$destroy$_line_start
dd empty
dd function_java_lang_Object_toString__Ljava_lang_String_line_start ;VFT:toString__Ljava_lang_String
dd function_java_lang_Object_hashCode__I_line_start ;VFT:hashCode__I
dd function_java_lang_Object_equals_Ljava_lang_Object_Z_line_start ;VFT:equals_Ljava_lang_Object_Z
pusty_f0xC_imports_libc_CStdio_class: dd function_pusty_f0xC_imports_libc_CStdio_$destroy$_line_start
dd empty
dd function_java_lang_Object_toString__Ljava_lang_String_line_start ;VFT:toString__Ljava_lang_String
dd function_java_lang_Object_hashCode__I_line_start ;VFT:hashCode__I
dd function_java_lang_Object_equals_Ljava_lang_Object_Z_line_start ;VFT:equals_Ljava_lang_Object_Z
java_lang_Double_class: dd function_java_lang_Double_$destroy$_line_start
dd empty
dd function_java_lang_Double_toString__Ljava_lang_String_line_start ;VFT:toString__Ljava_lang_String
dd function_java_lang_Object_hashCode__I_line_start ;VFT:hashCode__I
dd function_java_lang_Object_equals_Ljava_lang_Object_Z_line_start ;VFT:equals_Ljava_lang_Object_Z
pusty_f0xC_rt_windows_Kernel32_class: dd function_pusty_f0xC_rt_windows_Kernel32_$destroy$_line_start
dd empty
dd function_java_lang_Object_toString__Ljava_lang_String_line_start ;VFT:toString__Ljava_lang_String
dd function_java_lang_Object_hashCode__I_line_start ;VFT:hashCode__I
dd function_java_lang_Object_equals_Ljava_lang_Object_Z_line_start ;VFT:equals_Ljava_lang_Object_Z
java_lang_System_class: dd function_java_lang_System_$destroy$_line_start
dd empty
dd function_java_lang_Object_toString__Ljava_lang_String_line_start ;VFT:toString__Ljava_lang_String
dd function_java_lang_Object_hashCode__I_line_start ;VFT:hashCode__I
dd function_java_lang_Object_equals_Ljava_lang_Object_Z_line_start ;VFT:equals_Ljava_lang_Object_Z
aarray_class: dd function_aarray_$destroy$_line_start
dd empty
array_class: dd function_array_$destroy$_line_start
dd empty
empty db " ",0

;Static String Map
   stringTable:
   stringmap_0       dd 0
   stringmap_23       dd 0
   stringmap_15876a41       dd 0
   stringmap_5cb1923       dd 0
   stringmap_648       dd 0
   stringmap_628       dd 0
   stringmap_a       dd 0
   stringmap_2b       dd 0
   stringmap_2d       dd 0
   stringmap_30       dd 0
   stringmap_33c587       dd 0
   stringmap_36758e       dd 0
   stringmap_dd9       dd 0
   stringmap_85c2f798       dd 0
   stringmap_33ae2f       dd 0
   stringTableData:
   stringmap_0_value db 0
   stringmap_23_value db 35, 0
   stringmap_15876a41_value db 79, 98, 106, 101, 99, 116, 64, 88, 88, 88, 88, 0
   stringmap_5cb1923_value db 102, 97, 108, 115, 101, 0
   stringmap_648_value db 48, 120, 0
   stringmap_628_value db 48, 88, 0
   stringmap_a_value db 10, 0
   stringmap_2b_value db 43, 0
   stringmap_2d_value db 45, 0
   stringmap_30_value db 48, 0
   stringmap_33c587_value db 110, 117, 108, 108, 0
   stringmap_36758e_value db 116, 114, 117, 101, 0
   stringmap_dd9_value db 111, 104, 0
   stringmap_85c2f798_value db 61, 61, 84, 79, 79, 32, 76, 65, 90, 89, 32, 84, 79, 32, 73, 77, 80, 76, 69, 77, 69, 78, 84, 32, 83, 82, 89, 61, 61, 0
   stringmap_33ae2f_value db 110, 111, 101, 115, 0

;Static Float Map

;Static Double Map

;Global Data for 'java/lang/Integer'
   java_lang_Integer_digits dd 0

;Global Data for 'java/lang/StringBuilder'

;Global Data for 'pusty/f0xC/rt/windows/WindowsImportUtil'

;Global Data for 'pusty/f0xC/imports/libc/CStdio$FILE'

;Global Data for 'java/lang/Float'

;Global Data for 'java/lang/Long'

;Global Data for 'pusty/f0xC/imports/InternalObject'

;Global Data for 'pusty/f0xC/imports/GarbageCollector'

;Global Data for 'java/io/OutputStream'

;Global Data for 'java/io/PrintStream'

;Global Data for 'pusty/f0xC/imports/Internal'
   pusty_f0xC_imports_Internal_allocCalls dd 0
   pusty_f0xC_imports_Internal_allocMemory dd 0
   pusty_f0xC_imports_Internal_gbStatus dd 0
   pusty_f0xC_imports_Internal_gbCollector dd 0
   pusty_f0xC_imports_Internal_freedMemory dd 0
   pusty_f0xC_imports_Internal_freeCalls dd 0

;Global Data for 'example/windows/Example'

;Global Data for 'java/lang/Object'

;Global Data for 'pusty/f0xC/rt/io/NativeOutputStream'

;Global Data for 'java/lang/String'

;Global Data for 'java/lang/Character'

;Global Data for 'pusty/f0xC/imports/LibC'

;Global Data for 'pusty/f0xC/imports/libc/CStdio'

;Global Data for 'java/lang/Double'

;Global Data for 'pusty/f0xC/rt/windows/Kernel32'

;Global Data for 'java/lang/System'
   java_lang_System_stdout dd 0
   java_lang_System_err dd 0
   java_lang_System_lineSeparator dd 0
   java_lang_System_out dd 0


; FASM IMPORT MACROS [DYNAMICLY IMPORTED]
section '.idata' data import readable
include "C:\FASM\INCLUDE\macro\import32.inc"

library user32, "user32.dll",\
        kernel32, "kernel32.dll",\
        msvcrt, "msvcrt.dll"

import user32,\
       MessageBoxA, 'MessageBoxA'
import kernel32,\
       Sleep, 'Sleep'
import msvcrt,\
       native_putc, 'putc',\
       native_fgets, 'fgets',\
       native_ferror, 'ferror',\
       native_fflush, 'fflush',\
       native_free, 'free',\
       native_clearerr, 'clearerr',\
       libc_printf, 'printf',\
       native_perror, 'perror',\
       native_freopen, 'freopen',\
       native_fgetc, 'fgetc',\
       native_remove, 'remove',\
       native_fputc, 'fputc',\
       putchar, 'putchar',\
       native_fclose, 'fclose',\
       native_rewind, 'rewind',\
       native_fwrite, 'fwrite',\
       native_exit, 'exit',\
       native_rename, 'rename',\
       native_gets, 'gets',\
       getchar, 'getchar',\
       native_fputs, 'fputs',\
       native_feof, 'feof',\
       native_malloc, 'malloc',\
       native_fopen, 'fopen',\
       native_fread, 'fread',\
       native_puts, 'puts',\
       native_tmpfile, 'tmpfile'

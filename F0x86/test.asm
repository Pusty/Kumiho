dd function_java_lang_Integer_digits_I_C_line_12, 8, function_java_lang_Integer_digits_I_C_line_12
push ebp
mov ebp,esp
mov eax,dword [function_java_lang_Integer_digits_I_C_line_12-4]
mov eax,dword [ebp+8]
push eax
mov eax,9
push eax
pop ebx
pop eax
cmp eax,ebx
j2: jle function_java_lang_Integer_digits_I_C_line_12
mov eax,0x57
push eax
mov eax,dword [ebp+8]
push eax
pop ebx
pop eax
add eax,ebx
push eax
pop eax
movsx eax,al
push eax
pop eax
jmp function_java_lang_Integer_digits_I_C_line_exit
function_java_lang_Integer_digits_I_C_line_12:
mov eax,0x30
push eax
mov eax,dword [ebp+8]
push eax
pop ebx
pop eax
add eax,ebx
push eax
pop eax
movsx eax,al
push eax
pop eax
jmp function_java_lang_Integer_digits_I_C_line_exit
function_java_lang_Integer_digits_I_C_line_exit:
mov esp,ebp
pop ebp
push eax
push edx
push ebp
pop ebp
pop edx
pop eax
ret 

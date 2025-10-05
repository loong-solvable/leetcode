def word_frequency(file_path):
    with open(file_path,'r',encoding='utf-8') as file:
        content = file.read().lower()

    word_count = {}
    for word in content.split():
        word = word.strip('.,!?;:"()[]')
        if word:
            word_count[word] = word_count.get(word,0) + 1

    sorted_words = sorted(word_count.items(),key = lambda x: x[1],reverse=True)

    print(f"文件'{file_path}' 中的单词频率统计:")
    for word,count in sorted_words[:10]:
        print(f"{word}:{count}次")

word_frequency('sample.txt')

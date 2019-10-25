package com.h2t.study.strategy;

import com.h2t.study.dto.BaseCacheValue;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 缓存过期策略
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/10/25 9:34
 */
public interface ExpireStrategy<K, V> {
    /**
     * 清空过期Key-Value
     */
    V removeExpireKey(ConcurrentHashMap<K, BaseCacheValue<V>> localCache, K key);
}
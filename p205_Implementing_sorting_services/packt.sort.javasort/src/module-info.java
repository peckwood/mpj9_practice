module packt.sort.javasort {
        requires packt.sortutil;
        requires java.logging;
        provides packt.util.SortUtil with packt.util.impl.javasort.JavaSortUtilImpl;
        }